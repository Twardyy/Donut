package com.example.donuts.donut;

public record DonutResponse(
        Long id,
        String name,
        String description,
        double price,
        int calories,
        double weight,
        int quantity
) {
}
