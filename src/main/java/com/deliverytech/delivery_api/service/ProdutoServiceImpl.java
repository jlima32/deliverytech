package com.deliverytech.delivery_api.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.deliverytech.delivery_api.dto.ProdutoDto;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Override
    public Long cadastrarProduto(ProdutoDto produtoDto) {
        // lógica de salvar produto
        return 1L;
    }

    @Override
    public List<ProdutoDto> listarProdutosPorRestaurante(Long restauranteId) {
        return List.of();
    }

    @Override
    public ProdutoDto buscarProdutoPorId(Long id) {
        return null;
    }

    @Override
    public ProdutoDto atualizarProduto(Long id, ProdutoDto produtoDto) {
        return null;
    }

    @Override
    public ProdutoDto alterarDisponibilidade(Long id, String disponivel) {
        return null;
    }

    @Override
    public ProdutoDto buscarProdutosPorCategoria(String categoria) {
        return null;
    }

    @Override
    public List<ProdutoDto> findAll() {
        return List.of();
    }
}
