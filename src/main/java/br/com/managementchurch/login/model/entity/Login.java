package br.com.managementchurch.login.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="tb_logins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O e-mail fornecido não possui cadastro!")
    @Email(message = "O e-mail fornecido não é válido!")
    private String email;
    @Column
    private String password;
}
