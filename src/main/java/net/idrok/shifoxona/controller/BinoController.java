package net.idrok.shifoxona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.idrok.shifoxona.entity.Bino;
import net.idrok.shifoxona.service.BinoService;

@RestController
@RequestMapping("/api/bino")
public class BinoController {
    @Autowired
    BinoService binoService;

    @GetMapping
    public List<Bino> getAll(){
        return binoService.getAll();
    }
    @PostMapping
    public Bino create(@RequestBody Bino bino){
        return binoService.create(bino);
    }

    @PutMapping
    public Bino update(@RequestBody Bino bino){
        return binoService.update(bino);
    }
    @DeleteMapping("/{id}")
    public void update(@PathVariable Long id){
        binoService.deleteById(id);
    }
}