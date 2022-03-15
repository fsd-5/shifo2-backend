package net.idrok.shifoxona.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Xona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String bulim;

    @ManyToOne
    private Bino bino;
    private XonaTur xonaTur;
    private String info;


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
    public String getBulim() {
        return bulim;
    }
    public void setBulim(String bulim) {
        this.bulim = bulim;
    }
    public Bino getBino() {
        return bino;
    }
    public void setBino(Bino bino) {
        this.bino = bino;
    }
    public XonaTur getXonaTur() {
        return xonaTur;
    }
    public void setXonaTur(XonaTur xonaTur) {
        this.xonaTur = xonaTur;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    


}
