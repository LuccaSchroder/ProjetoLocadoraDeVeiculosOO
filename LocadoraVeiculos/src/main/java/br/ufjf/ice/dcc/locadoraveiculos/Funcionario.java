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
abstract public class Funcionario extends PessoaFisica{
    
    public Usuario usuario = new Usuario();

    public abstract void calculaComicao();    
    public abstract int tipoFuncionario();

}
