package com.deliverytech.delivery_api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deliverytech.delivery_api.dto.RestaurantDto;
import com.deliverytech.delivery_api.service.RestaurantService;

public class RestaurantController 
{
    private RestaurantService restaurantService;
    
    @RequestMapping("api/restaurants")
    public List<RestaurantDto> listRestaurants() 
    {
        return restaurantService.findAll();
    }
}