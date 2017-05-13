package org.javabahia.gestaoalunos.repository;

import org.javabahia.gestaoalunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ivanqueiroz
 */
public interface Alunos extends JpaRepository<Aluno, Long> {

}
