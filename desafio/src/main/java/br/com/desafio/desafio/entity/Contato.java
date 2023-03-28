package br.com.desafio.desafio.entity;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contatos", schema = "public")
public class Contato {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Getter @Setter
    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;

    @Getter @Setter
    @Column(name = "valor", nullable = false, length = 20)
    private String valor;

    @Getter @Setter
    @JoinColumn (name = "aluno", nullable = false, unique = true)
    @ManyToOne
    private Aluno aluno;

}
