package com.senai.eli.Model;

import java.time.LocalDate;

import org.hibernate.annotations.ColumnDefault;

import com.senai.eli.Enum.Sexo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Table(name = "usuario")
@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    @ColumnDefault("3")
    private Sexo sexo = Sexo.NAO_INFORMADO;

    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "telefone", length = 14)
    @Pattern(regexp = "(\\d{2}) \\d{5}-\\{4}")
     private String telefone;

     @Column(name = "nascimento", nullable = false)
     private LocalDate nascimento;
     

}
