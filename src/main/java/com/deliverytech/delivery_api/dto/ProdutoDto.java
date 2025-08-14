package com.deliverytech.delivery_api.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProdutoDto {
    private Long id;
    private String nome;
    private BigDecimal preco;
    private String categoria;
    private String disponivel;
}