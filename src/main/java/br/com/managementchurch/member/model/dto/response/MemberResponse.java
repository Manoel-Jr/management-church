package br.com.managementchurch.member.model.dto.response;

import br.com.managementchurch.member.gender.GenderEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponse {

    private Long id;
    private String fullName;
    private String email;
    private String whatsApp;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate accessionDate;
    private  AddressResponse address;
    private GenderEnum gender;
}
