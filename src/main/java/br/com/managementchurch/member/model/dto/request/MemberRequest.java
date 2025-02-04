package br.com.managementchurch.member.model.dto.request;

import br.com.managementchurch.member.gender.GenderEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Embedded;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequest {
    private String fullName;
    private String email;
    private String whatsApp;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;
    @Embedded
    private AddressRequest address;
    private GenderEnum gender;
}
