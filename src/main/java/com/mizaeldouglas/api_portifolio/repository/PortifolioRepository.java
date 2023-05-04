package com.mizaeldouglas.api_portifolio.repository;

import com.mizaeldouglas.api_portifolio.entities.Portifolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortifolioRepository extends JpaRepository<Portifolio,Long> {
//    List<Portifolio> findByTechnology(String technology);
}
