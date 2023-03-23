package br.com.desafio.desafio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "endereco", schema = "public")
public class Endereco {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false, unique = true)
    private Long id;

    @Getter @Setter
    @Column (name = "rua", nullable = false, length = 150)
    private String rua;

    @Getter @Setter
    @Column (name = "numero", nullable = false)
    private int numero;

    @Getter @Setter
    @Column (name = "bairro", nullable = false, length = 50)
    private String bairro;

    @Getter @Setter
    @Column (name = "cep", nullable = false)
    private int cep;

}
