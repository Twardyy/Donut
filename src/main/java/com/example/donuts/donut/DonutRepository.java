package com.example.donuts.donut;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonutRepository extends JpaRepository<Donut, Long> {
}
