package org.example.call_rest_api_using_web_client.dto;

import lombok.Data;

@Data
public class Products {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;
}
