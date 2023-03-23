package br.com.desafio.desafio.entity;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "aluno", schema = "public")
public class Aluno {

    @Id
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 120)
    private String nome;

    @Getter @Setter
    @Column(name = "cpf", nullable = false, unique = true, length = 17)
    private String cpf;

    @Getter @Setter
    @JoinColumn (name = "endereco",nullable = false)
    @OneToOne
    private Endereco endereco;

}
