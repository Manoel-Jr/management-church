package br.com.managementchurch.member.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponse {

    private Long id;

    private String name;

    private String cpf;

    private String whatsApp;
}
