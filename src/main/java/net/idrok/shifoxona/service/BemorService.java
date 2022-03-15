package net.idrok.shifoxona.service;

import net.idrok.shifoxona.entity.Bemor;
import net.idrok.shifoxona.repository.BemorRepository;

public class BemorService {
    private final BemorRepository bemorRepository;

    public BemorService(BemorRepository bemorRepository) {
        this.bemorRepository = bemorRepository;
    }

    public Bemor create(Bemor bemor) {
        if (bemor.getId() == null)
            return this.bemorRepository.save(bemor);
        throw new RuntimeException("ID null bo'lsihi kerak");
    }

    public Bemor update(Bemor bemor) {
        if (bemor.getId() != null)
            return bemorRepository.save(bemor);
        throw new RuntimeException();
    }

    public void deleteById(Long id) {
        bemorRepository.deleteById(id);
    }

    public void delete(Bemor bemor) {
        bemorRepository.delete(bemor);
    }
}
