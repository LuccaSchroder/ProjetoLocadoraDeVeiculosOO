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
public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String ano;
    private String cor;
    private String capacidade;

    public Veiculo(){
        
    }
    
    public Veiculo( String placa, String modelo, String marca, String ano, String cor, String capacidade){
        this.setPlaca(placa);
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setAno(ano);
        this.setCor(cor);
        this.setCapacidade(capacidade);
    }
    
    public Veiculo( String placa, String modelo){
        this.setPlaca(placa);
        this.setModelo(modelo);
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    
    public void imprime(){
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Capacidade: " + this.getCapacidade());
        System.out.println("Ano: " + this.getAno());

    }
}
