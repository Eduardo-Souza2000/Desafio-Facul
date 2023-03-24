package br.com.desafio.desafio.repository;

import br.com.desafio.desafio.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
