package br.com.thiago.academicnet.controller;


import br.com.thiago.academicnet.modelo.Aluno;
import br.com.thiago.academicnet.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @GetMapping
    public List<Aluno> getAlunos(){
        return alunoRepositorio.findAll();//findAll = listar os alunos cadastrados
    }
    @PostMapping//serve para da um set
    public void setAluno(@RequestBody Aluno aluno){
        alunoRepositorio.save(aluno);

    }
    @PutMapping//serve para alterar os dados salvos
    public void alterarAluno (@RequestBody Aluno aluno){
        alunoRepositorio.save(aluno);
    }

    @DeleteMapping("/{matricula}")
    public void delAluno(@PathVariable Long matricula){
        alunoRepositorio.deleteById(matricula);
    }
    @GetMapping("/{matricula}")
    public Optional<Aluno> getAlunoMatricula(@PathVariable Long matricula){
        return alunoRepositorio.findById(matricula);
    }

}




