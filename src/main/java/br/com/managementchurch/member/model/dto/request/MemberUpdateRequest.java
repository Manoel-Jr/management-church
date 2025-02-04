package br.com.managementchurch.member.model.dto.request;

import br.com.managementchurch.member.gender.GenderEnum;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberUpdateRequest {

    private Long id;
    private String fullName;
    private String email;
    private String whatsApp;
    private LocalDate dateOfBirth;
    private LocalDate accessionDate;
    private AddressRequest address;
    private GenderEnum gender;
}
