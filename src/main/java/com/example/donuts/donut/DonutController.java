package com.example.donuts.donut;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donut")
public class DonutController {
    private final DonutService donutService;

    public DonutController(DonutService donutService) {
        this.donutService = donutService;
    }

    @PostMapping
    DonutResponse addDonut(@RequestBody @Validated DonutRequest donutRequest) {
        return donutService.addDonut(donutRequest);
    }

    @GetMapping("/{id}")
    DonutResponse fetchDonut(@PathVariable Long id) {
        return donutService.findDonutById(id);
    }

}
