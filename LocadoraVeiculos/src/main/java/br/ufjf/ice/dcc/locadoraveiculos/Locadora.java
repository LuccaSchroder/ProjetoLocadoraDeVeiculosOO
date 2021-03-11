/*
Lucca Oliveira Schroder - 201765205AC
Ronan Dos Santos Rosa - 201765026AB
Jaqueline da Silva Amaral Lopes - 201976007
Wendell Guimarães Júnior - 201635032
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import java.util.*;

/**
 *
 * @author lucca
 */
public class Locadora {
    private static List <Veiculo> veiculos = new ArrayList<>(); //todos os veiculos
    private static List <Reserva> reservasPF = new ArrayList<>(); //guarda todas as reversas de determinado veiculo
    private static List <Reserva> reservasPJ = new ArrayList<>();
    private static List <PessoaFisica> pFisica = new ArrayList<>(); 
    private static List <PessoaJuridica> pJuridica = new ArrayList<>();
    private static List <Atendente> atendentes = new ArrayList<>(); 
    private static List <Gerente> gerentes = new ArrayList<>(); 
    private static Atendente atendenteLogado = new Atendente("");
    private static Gerente gerenteLogado = new Gerente();

   
    
    public static void adicionaVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public static List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public static void adicionaReservaPF(Reserva reserva){
        reservasPF.add(reserva);
    }

    public static List<Reserva> getReservasPF() {
        return reservasPF;
    }
    
    public static void adicionaReservaPJ(Reserva reserva){
        reservasPF.add(reserva);
    }

    public static List<Reserva> getReservasPJ() {
        return reservasPJ;
    }
    
    public static void adicionaPFisica(PessoaFisica pessoa){
        pFisica.add(pessoa);
    }

    public static List<PessoaFisica> getPFisica() {
        return pFisica;
    }
    
    public static void adicionaPJuridica(PessoaJuridica pessoa){
        pJuridica.add(pessoa);
    }

    public static List<PessoaJuridica> getPJuridica() {
        return pJuridica;
    }
    
    public static List<Atendente> getAtendente() {
        return atendentes;
    }
    
    public static List<Gerente> getGerente() {
        return gerentes;
    }
    
    //RETORNA SE UM VEICULO JA FOI CADASTRADO
    public static boolean verificaVeiculos(Veiculo veiculo){
        for (int i = 0; i < veiculos.size(); i++) {
            if(veiculos.get(i).getPlaca().equals(veiculo.getPlaca()))
                return true;
        }
        return false;
    }
    
    //RETORNA SE UMA PESSOA FÍSICA JA FOI CADASTRADO
    public static boolean verificaPFsica(PessoaFisica pessoa){
        for (int i = 0; i < pFisica.size(); i++) {
            if(pFisica.get(i).getCpf().equals(pessoa.getCpf()))
                return true;
        }
        return false;
    }
    
    //RETORNA SE UMA PESSOA JURIDICA JA FOI CADASTRADO
    public static boolean verificaPJuridica(PessoaJuridica pessoa){
        for (int i = 0; i < pJuridica.size(); i++) {
            if(pJuridica.get(i).getCnpj().equals(pessoa.getCnpj()))
                return true;
        }
        return false;
    }
    
    public static boolean buscaAtendente(String cpf){
        for (int i = 0; i < atendentes.size(); i++) {
            if(atendentes.get(i).getCpf().equals(cpf)){
                atendenteLogado = atendentes.get(i);
                return true;
            }  
        }
        return false;
    }
    
    public static boolean buscaGerente(String cpf){
        for (int i = 0; i < gerentes.size(); i++) {
            if(gerentes.get(i).getCpf().equals(cpf)){
                gerenteLogado = gerentes.get(i);
                return true;
            }
        }
        return false;
    }
    
    public static boolean verificaAtendente(Atendente funcionario){
        for (int i = 0; i < atendentes.size(); i++) {
            if(atendentes.get(i).getCpf().equals(funcionario.getCpf()))
                return true;
        }
        return false;
    }
    
    public static boolean verificaGerente(Gerente funcionario){
        for (int i = 0; i < gerentes.size(); i++) {
            if(gerentes.get(i).getCpf().equals(funcionario.getCpf()))
                return true;
        }
        return false;
    }
    
    public static Funcionario getLogado(){
        if(atendenteLogado.getCpf() != ""){
            System.out.println("é atendente");
            return atendenteLogado;
        } else {
            System.out.println("é gerente");
            return gerenteLogado;
        }
    }
    
    public static void adicionaAtendente(/*Atendente funcionario*/){
        Atendente ronan = new Atendente("123456");
        atendenteLogado = ronan;
        atendentes.add(ronan);
        //atendentes.add(funcionario);
        
    }
    
    public static void adicionaGerente(Gerente funcionario){
        Atendente ronan = new Atendente("123456");
        atendenteLogado = ronan;
        atendentes.add(ronan);
        //gerentes.add(funcionario);
    }
    
    /*public static void main(String[] args) {
        Usuario a1 = new Usuario("Ronan dos Santos", "12312312313");
        Usuario a2 = new Usuario("Lucca", "1111111111");
        Usuario a3 = new Usuario("Jaque", "2222222222");
        Usuario a4 = new Usuario("Wendell", "3333333333");

        //a.imprime();
        Veiculo b = new Veiculo("aaa1111", "gol");
        veiculos.add(b);
        
        //b.imprime();
        //Reserva c = new Reserva(a1, b, 5);
        //reservas.add(c);
        
        //c.imprime();
        
        clientes.add(a1);
        clientes.add(a2);
        clientes.add(a3);
        clientes.add(a4);
        
        imprimeClientes();
        
    }*/
    

}
