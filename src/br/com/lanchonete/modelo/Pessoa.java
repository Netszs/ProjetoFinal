/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.modelo;

import java.util.Calendar;

/**
 *
 * @author sebas
 */
public abstract class Pessoa {
    
    protected int id;
    protected String nome;
    protected String descricao;
    protected String pedido;
    protected String numeroVenda;
    

    
    public Pessoa(int id, String nome, String descricao, String pedido, String numeroVenda)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.pedido = pedido;
        this.numeroVenda = numeroVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getNumeroVenda() {
        return numeroVenda;
    }
    
    public void setNumeroVenda(String numeroVenda) {
        this.numeroVenda = numeroVenda;
    }
    
}
