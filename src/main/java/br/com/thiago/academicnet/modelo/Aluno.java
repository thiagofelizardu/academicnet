package br.com.thiago.academicnet.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Entity//esta classe em uma identidade
@Data//cria get e set
@AllArgsConstructor//cria a classe com o contrutor padrao com agrs
@NoArgsConstructor//cria a classe com o contrutor padrao sem agrs
public class Aluno {

    @Id//vai usar a matricula como ID
    private Long matricula;

    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;

}
