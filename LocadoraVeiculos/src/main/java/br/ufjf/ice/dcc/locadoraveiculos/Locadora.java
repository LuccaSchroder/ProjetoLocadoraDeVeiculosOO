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
    private static List <Reserva> reservas = new ArrayList<>(); //guarda todas as reversas de determinado veiculo
    private static List <Usuario> clientes = new ArrayList<>(); //guarda todos os clientes
    
    public static void imprimeClientes(){
        for(Usuario cliente : clientes ){
            cliente.imprime();
        }
    }
    
    public static void adicionaVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public static List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    
    
    
    public static void main(String[] args) {
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
   
    }
    

}
