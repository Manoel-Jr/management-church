package br.com.managementchurch.member.model.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequest {

    private String name;

    private String cpf;

    private String whatsApp;
}
