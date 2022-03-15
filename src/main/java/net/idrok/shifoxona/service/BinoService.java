package net.idrok.shifoxona.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.idrok.shifoxona.entity.Bino;
import net.idrok.shifoxona.repository.BinoRepository;

@Service
public class BinoService {
     ;
    private final BinoRepository binoRepository;


    public BinoService(BinoRepository binoRepository) {
        this.binoRepository = binoRepository;
    }

    public List<Bino> getAll(){
        return binoRepository.findAll();
    }

    public Bino create(Bino bino){
        if(bino.getId() == null)
        return binoRepository.save(bino);
        throw new RuntimeException("Yangi bino da id bo'lmasligi zarur");
    }
    public Bino update(Bino bino){
        if(bino.getId() != null)
        return binoRepository.save(bino);
        throw new RuntimeException("O'zgarayotgan bino da id bo'lishi zarur");
    }

    public void deleteById(Long id){
        binoRepository.deleteById(id);
    }
    public void delete(Bino bino){
        binoRepository.delete(bino);
    }
}