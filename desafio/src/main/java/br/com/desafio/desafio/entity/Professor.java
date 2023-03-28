package br.com.desafio.desafio.entity;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table (name = "professores", schema = "public")
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
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "professor-alunos",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {
                        "professor_id",
                        "aluno_id"
                }
        ),
            joinColumns = @JoinColumn(
                    name = "professor_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "aluno_id"
            )
    )
    private List<Aluno> aluno;

}
