package com.deliverytech.delivery_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverytech.delivery_api.dto.RestauranteDto;
import com.deliverytech.delivery_api.service.RestauranteService;

@CrossOrigin(origins = "*")
@RequestMapping("api/v1/restaurants")
@RestController
public class RestauranteController 
{
    private RestauranteService restaurantService;

    @Autowired
    public RestauranteController(RestauranteService restaurantService) {
        this.restaurantService = restaurantService;
    }
    
    @GetMapping("/findAll")
    public List<RestauranteDto> listRestaurants() 
    {
        return restaurantService.findAll();
    }
}