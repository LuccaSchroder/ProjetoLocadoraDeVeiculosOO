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
public class Atendente extends Funcionario{

    Atendente(String cpf){
        this.setCpf(cpf);
    }
    @Override
    public void calculaComicao() {
        
    }

    @Override
    public int tipoFuncionario() {
        return 1;
    }
}
