package com.mycompany.projetoteste;

public class Carro {
    private int ano;
    private int potencia;
    private int velocidade;
    private String marca;
    private String modelo;
    private int km_rodados;
    
    private final int CONSTANTE_DESACELERACAO = 10;
    private final int CONSTANTE_KM_CARRO_SEMINOVO = 20000;
    private final int ANO_DE_REFERENCIA_CARRO_NOVO = 2023;
    
    public Carro(String marca, String modelo, int ano, int potencia) {
        this.ano = ano;
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
        this.km_rodados = 0;
    }
    
    public Carro(int potencia, int velocidade){
        this.potencia = potencia;
        this.velocidade = velocidade;
        km_rodados = 0;
    }
    
    public void acelerar(int aceleracao) {
        this.velocidade = velocidade + aceleracao;
        km_rodados = km_rodados + aceleracao;
    }
    
    public void reduzir(){
        while(this.velocidade > 0){
            this.velocidade = this.velocidade - CONSTANTE_DESACELERACAO;
            System.out.println(this.velocidade);
        } 
    }
    
    /*
        se o carro é do ano
        OU se km_rodados é menor que CONSTANTE_KM_CARRO_SEMINOVO
    */
    
    public boolean eCarroNovo(){
        return ((this.ano==ANO_DE_REFERENCIA_CARRO_NOVO) || 
                (km_rodados<=CONSTANTE_KM_CARRO_SEMINOVO));
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
