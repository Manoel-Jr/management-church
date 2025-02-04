package br.com.managementchurch.member.model.entity;

import br.com.managementchurch.member.gender.GenderEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_members")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NomeCompleto")
    private String fullName;

    @Column(name = "E-mail", unique = true)
    private String email;

    @Column(name = "whatsApp")
    private String whatsApp;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_adesao_a_igreja")
    private LocalDate accessionDate = LocalDate.now();
    @Embedded
    private Address address;
    @Column(name = "Genero")
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;
}
