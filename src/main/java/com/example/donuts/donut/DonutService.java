package com.example.donuts.donut;

import org.springframework.stereotype.Service;

@Service
public class DonutService {

    private final DonutRepository donutRepository;
    private final DonutMapper donutMapper;

    public DonutService(DonutRepository donutRepository, DonutMapper donutMapper) {
        this.donutRepository = donutRepository;
        this.donutMapper = donutMapper;
    }

    DonutResponse addDonut(DonutRequest donutRequest) {
        return donutMapper.donutToDonutResponse(
                donutRepository.save(donutMapper.donutRequestToDonut(donutRequest)));
    }

    DonutResponse findDonutById(Long id) {
        return donutRepository.findById(id)
                .map(donutMapper::donutToDonutResponse)
                .orElseThrow();
    }
}
