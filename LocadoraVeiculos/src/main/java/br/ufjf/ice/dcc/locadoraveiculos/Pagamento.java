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
public interface Pagamento {
    
    public float pagamento(float precoDiaria, int dias);   
}
