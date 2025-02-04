package br.com.managementchurch.member.controller;

import br.com.managementchurch.member.model.dto.request.MemberRequest;
import br.com.managementchurch.member.model.dto.request.MemberUpdateRequest;
import br.com.managementchurch.member.model.dto.response.MemberResponse;
import br.com.managementchurch.member.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@AllArgsConstructor
public class MemberController {

    private final MemberService service;

    @PostMapping
    public ResponseEntity<MemberResponse> create(@RequestBody MemberRequest request){
        return new ResponseEntity<>(service.create(request), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberResponse> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getMemberById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MemberResponse> update(@RequestBody MemberUpdateRequest request, @PathVariable Long id){
        return new ResponseEntity<>(service.update(request,id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
