package br.com.managementchurch.login.controller;

import br.com.managementchurch.login.model.dto.request.LoginRequest;
import br.com.managementchurch.login.model.dto.request.LoginUpdateRequest;
import br.com.managementchurch.login.model.dto.response.LoginResponse;
import br.com.managementchurch.login.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logins")
@AllArgsConstructor
public class LoginController {

    private final LoginService service;

    @PostMapping
    public ResponseEntity<LoginResponse> create(@RequestBody LoginRequest request) {
        return new ResponseEntity<>(service.create(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LoginResponse>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LoginResponse> update(@RequestBody LoginUpdateRequest request, @PathVariable Long id) {
        return new ResponseEntity<>(service.update(request, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        service.delete(id);
    }
}
