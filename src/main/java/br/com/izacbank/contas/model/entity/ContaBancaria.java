package br.com.izacbank.contas.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class ContaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //    a) Um campo de dados privado do tipo double chamado saldo que representa o saldo atual da conta. O saldo padrão é 0.0.
    @Column(nullable = false, length = 150)
    private double saldo;

    //    b) Um campo de dados privado do tipo date chamado dataAbertura que guarda a data da abertura da conta bancária. O valor padrão é a data atual. Note que o campo dataAbertura é somente leitura, ou seja, no momento da criação da conta, esta variável receberá a data atual e não poderá mais ser alterada.
    @Column
    private LocalDate dataAbertura;

//    c) Um método RetornaDataAberturaFormatada() que retorna a data de abertura da conta como uma String. Você deverá também formatar a data retornada com o objetivo de exibir algo como "03/09/2021".
//
//    d) Um método depositar() que recebe um valor do tipo double e atualiza o saldo atual da conta.
//
//    e) Um método RetornaSaldoFormatado() que retorna o saldo atual da conta como uma String e formatado de acordo com o formato de moeda brasileira, ou seja, algo como "R$ 23.654,00".
//
//    f) Um método sacar() que recebe um valor do tipo double representando o valor a ser sacado. Não permita saques que farão com que a conta fique com saldo negativo.








}
