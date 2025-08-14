package com.deliverytech.delivery_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverytech.delivery_api.dto.RestaurantDto;
import com.deliverytech.delivery_api.service.RestaurantService;

@CrossOrigin(origins = "*")
@RequestMapping("api/restaurants")
@RestController
public class RestaurantController 
{
    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }
    
    @GetMapping("/findAll")
    public List<RestaurantDto> listRestaurants() 
    {
        return restaurantService.findAll();
    }
}