/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import java.util.Date;

/**
 *
 * @author Jaqueline
 */
public class PessoaJuridica extends Cliente {
    
    private String cnpj;
    
    public PessoaJuridica() {
    }    
    
    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getID() {
        return this.cnpj;
    }

    @Override
    public void setID(String id) {
        this.cnpj = id;
    }

    @Override
    public Date getDataNascimento() {
        return null;
    }

    @Override
    public void setDataNascimento(Date nascimento) {
        
    }
    
    
}
