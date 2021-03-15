/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos;



/**
 *
 * @author Jaqueline
 */
public class Gerente extends Funcionario {
    
    public Gerente(){
        
    }
    
    Gerente(String cpf){
        this.setCpf(cpf);
    }

    @Override
    public int tipoFuncionario() {
        return 0;
    }

}
