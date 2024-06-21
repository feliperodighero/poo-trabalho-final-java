/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author fezar
 */
public class Pedido implements Serializable{
    
    private int numeroMesa;
    private String nomeComida;
    private int quantidadeComida;
    private String nomeBebida;
    private int quantidadeBebida;
    private float precoTotal;

    public Pedido(int numeroMesa, String nomeComida, int quantidadeComida, String nomeBebida, int quantidadeBebida, float precoTotal) {
        this.numeroMesa = numeroMesa;
        this.nomeComida = nomeComida;
        this.quantidadeComida = quantidadeComida;
        this.nomeBebida = nomeBebida;
        this.quantidadeBebida = quantidadeBebida;
        this.precoTotal = precoTotal;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        this.nomeComida = nomeComida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public int getQuantidadeBebida() {
        return quantidadeBebida;
    }

    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    
}
