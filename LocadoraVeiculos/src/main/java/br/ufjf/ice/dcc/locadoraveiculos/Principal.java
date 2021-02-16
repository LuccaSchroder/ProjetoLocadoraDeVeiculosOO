/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import static br.ufjf.ice.dcc.locadoraveiculos.Locadora.clientes;
import static br.ufjf.ice.dcc.locadoraveiculos.Locadora.imprimeClientes;
import static br.ufjf.ice.dcc.locadoraveiculos.Locadora.reservas;
import static br.ufjf.ice.dcc.locadoraveiculos.Locadora.veiculos;

/**
 *
 * @author Jaqueline
 */
public class Principal {
    //o mais será criado em uma classe main separada
    public static void main(String[] args) {
        Cliente a1 = new Cliente("Ronan dos Santos", "12312312313");
        Cliente a2 = new Cliente("Lucca", "1111111111");
        Cliente a3 = new Cliente("Jaque", "2222222222");
        Cliente a4 = new Cliente("Wendell", "3333333333");

        //a.imprime();
        Veiculo b = new Veiculo("aaa1111", "gol");
        veiculos.add(b);
        
        //b.imprime();
        Reserva c = new Reserva(a1, b, 5);
        reservas.add(c);
        
        c.imprime();
        
        clientes.add(a1);
        clientes.add(a2);
        clientes.add(a3);
        clientes.add(a4);
        
        imprimeClientes();
        
    }
}
