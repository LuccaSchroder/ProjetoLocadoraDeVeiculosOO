/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.ice.dcc.locadoraveiculos;

/**
 *
 * @author lucca
 */

//Mantem um registro de uma reserva
public class Reserva {
    private Cliente locatario = new Cliente();
    private String dataInicio;
    private String dataFim;
    private String periodoLocacao; //quantos dias ficara locado
    private float precoDiaria;
    Veiculo veiculo = new Veiculo();

    public Reserva(){
      //settar cliente e veiculos recebendo como parametro  
    };
    
    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getPeriodoLocacao() {
        return periodoLocacao;
    }

    public void setPeriodoLocacao(String periodoLocacao) {
        this.periodoLocacao = periodoLocacao;
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public float getPrecoTotal() {
        //implementar
        return 0;
    }

    
}
