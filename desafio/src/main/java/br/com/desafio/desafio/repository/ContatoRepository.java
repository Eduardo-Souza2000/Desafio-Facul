package br.com.desafio.desafio.repository;

import br.com.desafio.desafio.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato,Long> {
}
