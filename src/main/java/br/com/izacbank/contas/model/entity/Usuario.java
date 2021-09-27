package br.com.izacbank.contas.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150, name="nome")
    private String name;

    @Column(unique = true, name="email")
    private String username;

    @Column(name = "senha")
    private String password;

//    2) Para manipular os dados da conta o usuário logado, construa uma API contendo o cadastro do usuário (CRUD - contendo nome, email e senha).
//    A autenticação será feita usando email e senha.


}
