package br.com.microsservico.consumidor.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class PedidoDTO {
    private Long id;
    private String descricao;
    private List<ItemPedidoDTO>itemPedidos;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemPedidoDTO> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedidoDTO> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }
}
