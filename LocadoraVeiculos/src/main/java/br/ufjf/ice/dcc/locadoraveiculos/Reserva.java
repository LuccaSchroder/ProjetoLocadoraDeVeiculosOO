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
    private PessoaFisica clienteF;
    private PessoaJuridica clienteJ;
    private Veiculo veiculo;
    private Date dataInicio = new Date();
    private Date dataFim = new Date();
    private int periodoLocacao;
    private float total;
    
    public Reserva(){
      //settar cliente e veiculos recebendo como parametro  
    };

    public Reserva(float total, int periodoLocacao) {
        this.total = total;
        this.periodoLocacao = periodoLocacao;
    }

    public Reserva(PessoaFisica clienteF, Veiculo veiculo, Date dataInicio, Date dataFim, float total) {
        this.clienteF = clienteF;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
   
    public Reserva(PessoaJuridica clienteJ, Veiculo veiculo, Date dataInicio, Date dataFim, float total){
        this.setClienteJ(clienteJ);
        this.setVeiculo(veiculo);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public PessoaFisica getClienteF(){
        return this.clienteF;
    }
    
    public void setClienteF(PessoaFisica clienteF){
        this.clienteF = clienteF;
    }

    public PessoaJuridica getClienteJ() {
        return clienteJ;
    }

    public void setClienteJ(PessoaJuridica clienteJ) {
        this.clienteJ = clienteJ;
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

    public float getTotal() {
        return total;
    }

    public int getPeriodoLocacao() {
        return periodoLocacao;
    }
    
    public boolean estaDisponivel(Date dataParaReserva){
        return false;
    }
    
    
}
