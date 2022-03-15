package net.idrok.shifoxona.service;


import net.idrok.shifoxona.entity.Xona;
import net.idrok.shifoxona.repository.XonaRepository;

public class XonaService {
    private final XonaRepository xonaRepository;


    public XonaService(XonaRepository xonaRepository) {
        this.xonaRepository = xonaRepository;
    }

    public Xona create(Xona xona){
        if(xona.getId() == null)
        return this.xonaRepository.save(xona);
        throw new RuntimeException("ID null bo'lsihi kerak");
    }

    public Xona update(Xona xona) {
        if (xona.getId() != null)
            return xonaRepository.save(xona);
        throw new RuntimeException();
    }

    public void deleteById(Long id) {
        xonaRepository.deleteById(id);
    }

    public void delete(Xona xona) {
        xonaRepository.delete(xona);
    }
}
