/*
Lucca Oliveira Schroder - 201765205AC
Ronan Dos Santos Rosa - 201765026AB
Jaqueline da Silva Amaral Lopes - 201976007
Wendell Guimarães Júnior - 201635032
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import java.util.Date;

/**
 *
 * @author lucca
 */

//Parte do login
public class Usuario extends Cliente {
    //private String numRegistro;
    
    public Usuario(){
        
    }
    
    public Usuario(String nome, String cpf, String email, Endereco endereco, String telefone, Date dataNascimento){
        //settar cliente e atributos de pessoa
        //this.setNumRegistro(cpf);
        //atributos da classe abstrata Cliente
        this.setNome(nome);
        //this.setCpf(cpf);
        this.setEmail(email);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }
    
    public Usuario(String nome, String cpf){
        //settar cliente e atributos de pessoa
        //this.setNumRegistro(cpf);
        //atributos da classe abstrata Cliente
        this.setNome(nome);
        //this.setCpf(cpf);
    }
    /*public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }*/
    
    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        //System.out.println("CPF: " + this.getCpf());
        //System.out.println("Data de Nascimento: " + this.getDataNasimento());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco()+ "\n");
    }
    
}
