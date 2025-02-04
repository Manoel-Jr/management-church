package br.com.managementchurch.login.service.impl;

import br.com.managementchurch.login.model.dto.request.LoginRequest;
import br.com.managementchurch.login.model.dto.request.LoginUpdateRequest;
import br.com.managementchurch.login.model.dto.request.UserLoginRequest;
import br.com.managementchurch.login.model.dto.response.LoginResponse;
import br.com.managementchurch.login.model.entity.Login;
import br.com.managementchurch.login.repositories.LoginRepository;
import br.com.managementchurch.login.service.LoginService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository repository;

    private final ModelMapper modelMapper;


    @Override
    public LoginResponse create(LoginRequest request) {
        if (!repository.existsByEmail(request.getEmail())){
            Login login = modelMapper.map(request,Login.class);
            return modelMapper.map(repository.save(login),LoginResponse.class);
        }
        throw new RuntimeException();
    }

    @Override
    public List<LoginResponse> getAll() {
        List<Login> logins = repository.findAll();
        return logins.stream()
                .map(login -> modelMapper
                .map(login,LoginResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public LoginResponse update(LoginUpdateRequest request, Long id) {
        request.setId(id);
        Login login = modelMapper.map(request,Login.class);
        return modelMapper.map(repository.save(login),LoginResponse.class);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void login(UserLoginRequest request) {

    }
}
