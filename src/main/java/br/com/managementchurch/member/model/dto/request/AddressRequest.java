package br.com.managementchurch.member.model.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {

    private String road;
    private String city;
    private String neighborhood;
}
