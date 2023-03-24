package br.com.desafio.desafio.repository;

import br.com.desafio.desafio.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor,Long> {
}
