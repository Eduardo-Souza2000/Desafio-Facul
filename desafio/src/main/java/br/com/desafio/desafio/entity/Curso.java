package br.com.desafio.desafio.entity;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cursos", schema = "public")
public class Curso {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false, unique = true)
    private Long id;

    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 120)
    private String nome;

    @Getter @Setter
    @Column(name = "carga-horaria", nullable = false)
    private int cargaHoraria;

    @Getter @Setter
    @JoinColumn(name = "alunos", nullable = false)
    @ManyToMany
    private List<Aluno> aluno = new ArrayList<Aluno>();}
