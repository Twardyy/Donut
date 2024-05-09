package com.example.donuts.donut;

import org.springframework.stereotype.Component;

@Component
public class DonutMapper {
    Donut donutRequestToDonut(DonutRequest donutRequest) {
        return new Donut(donutRequest.name(), donutRequest.description(), donutRequest.price(),
                donutRequest.calories(),donutRequest.weight(),donutRequest.quantity());
    }

    DonutResponse donutToDonutResponse(Donut donut) {
        return new DonutResponse(donut.getId(), donut.getName(), donut.getDescription(), donut.getPrice(),
                donut.getCalories(), donut.getWeight(), donut.getQuantity());
    }
}
