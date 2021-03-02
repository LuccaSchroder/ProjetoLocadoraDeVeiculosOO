/*
Lucca Oliveira Schroder - 201765205AC
Ronan Dos Santos Rosa - 201765026AB
Jaqueline da Silva Amaral Lopes - 201976007
Wendell Guimarães Júnior - 201635032
 */
package br.ufjf.ice.dcc.locadoraveiculos;

import java.util.Date;

/**
 *
 * @author lucca
 */

//Mantem um registro de uma reserva
public class Reserva {
    Usuario locador;
    Veiculo veiculo;
    private Date dataInicio;
    private Date dataFim;
    
    public Reserva(){
      //settar cliente e veiculos recebendo como parametro  
    };
    
    public Reserva(Usuario locador, Veiculo veiculo, Date dataInicio, Date dataFim){
        this.setLocador(locador);
        this.setVeiculo(veiculo);
        this.dataInicio = new Date();
        this.dataFim = new Date();
    }
    
    public Usuario getLocador(){
        return this.locador;
    }
    
    public void setLocador(Usuario locador){
        this.locador = locador;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public int PeriodoLocacao(){
        //Calcular utilizando com dataInicio e dataFim;
        return 0;
    }
    
    /*public float PrecoTotal(){
        return this.veiculo.getPrecoDiaria() * PeriodoLocacao();
    }*/
    
    
    
    public void imprime(){
        //System.out.println("Registro do cliente: " + this.locador.getCpf());
        System.out.println("Placa: " + this.veiculo.getPlaca());
        //System.out.println("Periodo de locação: " + this.getPeriodoLocacao());
        
    }
}
