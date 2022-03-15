package net.idrok.shifoxona.entity;

import javax.persistence.*;

@Entity
public class Xodim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Lavozim lavozim;
    private String ism;
    private String familiya;
    private String sharif;
    private Boolean aktiv;
    @ManyToOne
    private Smena smena;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Lavozim getLavozim() {
        return lavozim;
    }
    public void setLavozim(Lavozim lavozim) {
        this.lavozim = lavozim;
    }
    public String getIsm() {
        return ism;
    }
    public void setIsm(String ism) {
        this.ism = ism;
    }
    public String getFamiliya() {
        return familiya;
    }
    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }
    public String getSharif() {
        return sharif;
    }
    public void setSharif(String sharif) {
        this.sharif = sharif;
    }
    public Boolean getAktiv() {
        return aktiv;
    }
    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }
    public Smena getSmena() {
        return smena;
    }
    public void setSmena(Smena smena) {
        this.smena = smena;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    private String info;
}
