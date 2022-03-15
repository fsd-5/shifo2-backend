package net.idrok.shifoxona.service;

import net.idrok.shifoxona.repository.TumanRepository;
import net.idrok.shifoxona.entity.Tuman;

public class TumanService {
    private final TumanRepository tumanRepository;

    public TumanService(TumanRepository tumanRepository) {
        this.tumanRepository = tumanRepository;
    }

    public Tuman create(Tuman tuman) {
        if (tuman.getId() == null)
            return this.tumanRepository.save(tuman);
        throw new RuntimeException("ID null bo'lsihi kerak");
    }

    public Tuman update(Tuman tuman) {
        if (tuman.getId() != null)
            return tumanRepository.save(tuman);
        throw new RuntimeException();
    }

    public void deleteById(Long id) {
        tumanRepository.deleteById(id);
    }

    public void delete(Tuman tuman) {
        tumanRepository.delete(tuman);
    }
}
