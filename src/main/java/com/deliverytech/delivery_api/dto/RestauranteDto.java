package com.deliverytech.delivery_api.dto;



import lombok.Data;

@Data
public class RestauranteDto 
{
    private String name;
    private String description;

    public RestauranteDto(String name, String description)
    {
        this.name = name;
        this.description = description;
    }    

    public RestauranteDto() 
    {
        super();
    }

    @Override
    public String toString() {
        return "RestaurantDto{" +
                "nome='" + name + '\'' +
                ", descricao='" + description + '\'' +
                '}';
    }
}