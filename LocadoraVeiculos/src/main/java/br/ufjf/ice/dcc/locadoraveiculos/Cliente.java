/*
Lucca Oliveira Schroder - 201765205AC
Ronan Dos Santos Rosa - 201765026AB
Jaqueline da Silva Amaral Lopes - 201976007
Wendell Guimarães Júnior - 201635032
 */
package br.ufjf.ice.dcc.locadoraveiculos;

/**
 *
 * @author lucca
 */
public class Cliente extends Pessoa {
    private String numRegistro;

    public Cliente(){
        
    }
    
    public Cliente(String nome, String cpf, String email, String endereco, String telefone, String dataNascimento){
        //settar cliente e atributos de pessoa
        this.setNumRegistro(cpf);
        //atributos da classe abstrata Pessoa
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNasimento(dataNascimento);
        this.setEmail(email);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }
    
    public Cliente(String nome, String cpf){
        //settar cliente e atributos de pessoa
        this.setNumRegistro(cpf);
        //atributos da classe abstrata Pessoa
        this.setNome(nome);
        this.setCpf(cpf);
    }
    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }
    
    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNasimento());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco()+ "\n");


    }
    
}
