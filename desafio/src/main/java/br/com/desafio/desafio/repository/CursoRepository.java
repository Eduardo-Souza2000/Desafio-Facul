package br.com.desafio.desafio.repository;

import br.com.desafio.desafio.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
