package br.com.desafio.desafio.entity;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table (name = "professor", schema = "public")
public class Professor {

    @Id
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 120)
    private String nome;

    @Getter @Setter
    @JoinColumn(name = "alunos", nullable = false)
    @OneToMany
    private List<Aluno> aluno = new ArrayList<>();

}
