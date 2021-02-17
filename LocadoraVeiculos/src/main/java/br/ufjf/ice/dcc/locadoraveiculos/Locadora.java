/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import java.util.ArrayList;

/**
 *
 * @author lucca
 */
public class Locadora {
    static ArrayList <Veiculo> veiculos = new ArrayList<>(); //todos os veiculos
    static ArrayList <Reserva> reservas = new ArrayList<>(); //guarda todas as reversas de determinado veiculo
    static ArrayList <Cliente> clientes = new ArrayList<>(); //guarda todos os clientes
    
    public static void imprimeClientes(){
        for(Cliente cliente : clientes ){
            cliente.imprime();
        }
    }
    
    /*
        public void setCliente (){
            //instancia cliente e pega as informações
        };
        public Cliente getCliente();
        public void setVeiculo();
        public Veiculo getVeiculos();
        public void deletarCliente(int numRegistro);
        public void deletarVeiculo(String placa);
        public void reservarVeiculo(int numRegistro, String placa);
        public void imprimeRegistroFinanceiro();
        public bool consultaDisponibilidade(String data);
        public void cancelarReserva(int numRegistro);
        public void mudarReserva();
    
    */
    
    

}
