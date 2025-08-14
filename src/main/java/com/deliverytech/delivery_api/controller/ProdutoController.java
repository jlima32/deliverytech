package com.deliverytech.delivery_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverytech.delivery_api.dto.ProdutoDto;
import com.deliverytech.delivery_api.service.ProdutoService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/products")
public class ProdutoController {
    
    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<ProdutoDto> getAllProducts() {
        return produtoService.findAll();
        
    }

    @PostMapping
    public ResponseEntity<Long> cadastrarProduto(@Valid @RequestBody ProdutoDto dto) {
        Long id = produtoService.cadastrarProduto(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(id);
    }

    @PatchMapping("/{id}/produto")
    public ResponseEntity<ProdutoDto> atualizarProduto(Long id, @RequestBody ProdutoDto produtoDto) {
        ProdutoDto produtoSalvo = produtoService.atualizarProduto(id, produtoDto);
        return ResponseEntity.ok(produtoSalvo);
    }


}