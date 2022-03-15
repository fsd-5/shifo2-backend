package net.idrok.shifoxona.service;

import net.idrok.shifoxona.entity.Smena;
import net.idrok.shifoxona.repository.SmenaRepository;
import org.springframework.stereotype.Service;

@Service
public class SmenaService {
    private final SmenaRepository smenaRepository;


    public SmenaService(SmenaRepository smenaRepository) {
        this.smenaRepository = smenaRepository;
    }

    public Smena create(Smena smena){
        if(smena.getId() == null)
        return this.smenaRepository.save(smena);
        throw new RuntimeException("ID null bo'lsihi kerak");
    }
}
