package br.com.managementchurch.member.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdateRequest {

    private Long id;
    private String name;
    private String cpf;
    private String whatsApp;
}
