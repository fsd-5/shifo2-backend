package net.idrok.shifoxona.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalTime;

@Entity
public class Smena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 30)
    @Column(length = 30)
    private String nom;

    private LocalTime boshVaqt;
    private LocalTime tugashVaqt;

    private String info;

    public Smena() {
    }

    public Smena(String nom, LocalTime boshVaqt, LocalTime tugashVaqt, String info) {
        this.nom = nom;
        this.boshVaqt = boshVaqt;
        this.tugashVaqt = tugashVaqt;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalTime getBoshVaqt() {
        return boshVaqt;
    }

    public void setBoshVaqt(LocalTime boshVaqt) {
        this.boshVaqt = boshVaqt;
    }

    public LocalTime getTugashVaqt() {
        return tugashVaqt;
    }

    public void setTugashVaqt(LocalTime tugashVaqt) {
        this.tugashVaqt = tugashVaqt;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
