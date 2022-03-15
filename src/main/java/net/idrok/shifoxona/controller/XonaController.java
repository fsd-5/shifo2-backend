package net.idrok.shifoxona.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.idrok.shifoxona.entity.Xona;
import net.idrok.shifoxona.service.XonaService;

@RestController
@RequestMapping("/api/xona")
public class XonaController {

    public final XonaService xonaService;
    
    public XonaController(XonaService xonaService){
        this.xonaService = xonaService;
}


    @GetMapping
    public List<Xona> getAll(){
        return xonaService.getAll();
    }
    @PostMapping
    public Xona create(@RequestBody Xona xona){
        return xonaService.create(xona);
    }

    @PutMapping
    public Xona update(@RequestBody Xona xona){
        return xonaService.update(xona);
    }
    @DeleteMapping("/{id}")
    public void update(@PathVariable Long id){
        xonaService.deleteById(id);
    }
}