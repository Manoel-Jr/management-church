package br.com.managementchurch.login.service;

import br.com.managementchurch.login.model.dto.request.LoginRequest;
import br.com.managementchurch.login.model.dto.request.LoginUpdateRequest;
import br.com.managementchurch.login.model.dto.request.UserLoginRequest;
import br.com.managementchurch.login.model.dto.response.LoginResponse;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LoginService {

    public LoginResponse create(LoginRequest request);
    public List<LoginResponse> getAll();
    public LoginResponse update(LoginUpdateRequest request,Long id);
    public void delete(Long id);
    public void login(UserLoginRequest request);
}
