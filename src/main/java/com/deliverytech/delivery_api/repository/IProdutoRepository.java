package com.deliverytech.delivery_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery_api.entity.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    // Additional query methods can be defined here if needed
    
}