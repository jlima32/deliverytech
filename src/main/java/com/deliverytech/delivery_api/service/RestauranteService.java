package com.deliverytech.delivery_api.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliverytech.delivery_api.dto.RestauranteDto;
import com.deliverytech.delivery_api.entity.Restaurante;
import com.deliverytech.delivery_api.repository.IRestauranteRepository;

@Service
public class RestauranteService 
{
    @Autowired
    private IRestauranteRepository repository;

    public RestauranteService(IRestauranteRepository restaurantRepository) {
        this.repository = restaurantRepository;
    }

    public RestauranteService() {
        super();
    }

    public List<RestauranteDto> findAll()
    {
        return repository.findAll().stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());   
    }
    private RestauranteDto convertEntityToDto(Restaurante entity)
    {
        RestauranteDto dto = new RestauranteDto();
        dto.setName(entity.getNome());
        dto.setDescription(entity.getDescricao());

        return dto;
    }




}