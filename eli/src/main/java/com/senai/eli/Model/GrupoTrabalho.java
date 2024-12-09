package com.senai.eli.Model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "GrupoTrabalho")
@Entity
@Getter
@Setter
public class GrupoTrabalho { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "Responsavel")
    private String responsavel;


    @Column(name = "descricao")
    private String descricao;

    @ManyToMany(mappedBy = "grupos")
    private List<Evento> eventos = new ArrayList<>();

}