/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import java.util.Date;

/**
 *
 * @author Jaqueline
 */
public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica() {
    }
    
    public PessoaFisica(String nome, Endereco endereco, Date dataNascimento, String email, String telefone){
        setNome(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
}
