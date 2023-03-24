package br.com.desafio.desafio.repository;

import br.com.desafio.desafio.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {

}
