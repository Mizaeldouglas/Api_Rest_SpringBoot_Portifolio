package com.mizaeldouglas.api_portifolio.controllers;

import com.mizaeldouglas.api_portifolio.entities.Portifolio;
import com.mizaeldouglas.api_portifolio.repository.PortifolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/portifolio")
public class PortifolioController {

    @Autowired
    private PortifolioRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Portifolio createPortfolio(@RequestBody Portifolio portfolio) {
        return repository.save(portfolio);
    }

    @GetMapping
    public List<Portifolio> getAllPortfolios(){
        return  repository.findAll();
    }
    @GetMapping("/{id}")
    public Portifolio getPortfolioId(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Portifolio not found"));
    }

    @PutMapping("/{id}")
    public Portifolio updatePortifolio(@PathVariable Long id, @RequestBody Portifolio portifolio){
        portifolio.setId(id);
        return repository.save(portifolio);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }


}
