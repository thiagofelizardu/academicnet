package br.com.thiago.academicnet.repositorio;

import br.com.thiago.academicnet.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

//add os alunos no Banco de dados
public interface AlunoRepositorio extends JpaRepository<Aluno,Long> {
}
