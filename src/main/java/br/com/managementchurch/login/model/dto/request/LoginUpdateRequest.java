package br.com.managementchurch.login.model.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginUpdateRequest {

    private Long id;
    @Column
    private String email;
    @Column
    private String password;
}
