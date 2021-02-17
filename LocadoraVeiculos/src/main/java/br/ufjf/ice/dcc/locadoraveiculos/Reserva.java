/*
Lucca Oliveira Schroder - 201765205AC
Ronan Dos Santos Rosa - 201765026AB
Jaqueline da Silva Amaral Lopes - 201976007
Wendell Guimarães Júnior - 201635032
 */
package br.ufjf.ice.dcc.locadoraveiculos;

/**
 *
 * @author lucca
 */

//Mantem um registro de uma reserva
public class Reserva {
    Cliente locador;
    Veiculo veiculo;
    private String dataInicio;
    private String dataFim;
    private int periodoLocacao; //quantos dias ficara locado
    private float precoDiaria;
    //adicionar forma de pagamento
    
    public Reserva(){
      //settar cliente e veiculos recebendo como parametro  
    };
    
    public Reserva(Cliente locador, Veiculo veiculo, int periodoLocacao){
        this.setLocador(locador);
        this.setVeiculo(veiculo);
        this.setPeriodoLocacao(periodoLocacao);
    }
    
    public Cliente getLocador(){
        return this.locador;
    }
    
    public void setLocador(Cliente locador){
        this.locador = locador;
    }
    
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

    public int getPeriodoLocacao() {
        return periodoLocacao;
    }

    public void setPeriodoLocacao(int periodoLocacao) {
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

    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public void imprime(){
        System.out.println("Registro do cliente: " + this.locador.getNumRegistro());
        System.out.println("Placa: " + this.veiculo.getPlaca());
        System.out.println("Periodo de locação: " + this.getPeriodoLocacao());
        
    }
}
