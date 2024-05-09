package com.example.donuts.donut;

public record DonutRequest(
        String name,
        String description,
        double price,
        int calories,
        double weight,
        boolean availability,
        int quantity
) {
}
