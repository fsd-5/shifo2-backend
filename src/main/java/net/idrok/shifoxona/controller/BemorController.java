package net.idrok.shifoxona.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import net.idrok.shifoxona.service.BemorService;

import net.idrok.shifoxona.entity.Bemor;

@RestController
@RequestMapping("/api/bemor")
public class BemorController {
    private final BemorService bemorService;

    
    public BemorController(BemorService bemorService) {
        this.bemorService = bemorService;

    }

    @GetMapping
    public List<Bemor> getAll() {
        return bemorService.getAll();
    }

    @PostMapping()
    public Bemor create(@RequestBody Bemor bemor) {
        return bemorService.create(bemor);
    }

    @PutMapping
    public Bemor update(@RequestBody Bemor bemor) {
        return bemorService.update(bemor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bemorService.deleteById(id);
    }
}
