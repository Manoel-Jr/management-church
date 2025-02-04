package br.com.managementchurch.member.model.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {

    private String road;
    private String city;
    private String neighborhood;
}
