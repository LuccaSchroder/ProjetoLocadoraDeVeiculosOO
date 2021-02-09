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
    
    public static void main(String[] args) {
        Cliente a1 = new Cliente("Ronan dos Santos", "12312312313");
        Cliente a2 = new Cliente("Lucca", "1111111111");
        Cliente a3 = new Cliente("Jaque", "2222222222");
        Cliente a4 = new Cliente("Wendell", "3333333333");

        //a.imprime();
        Veiculo b = new Veiculo("aaa1111", "gol");
        //b.imprime();
        Reserva c = new Reserva(a1, b, 5);
        c.imprime();
        
        clientes.add(a1);
        clientes.add(a2);
        clientes.add(a3);
        clientes.add(a4);
        
        imprimeClientes();
        
    }
    
    public static void imprimeClientes(){
        for(Cliente cliente : clientes ){
            cliente.imprime();
        }
    }

}
