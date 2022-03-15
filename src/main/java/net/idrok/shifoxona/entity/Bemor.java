package net.idrok.shifoxona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Bemor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 30)
    private String ism;

    @NotNull
    private String familiya;

    @NotNull
    private String sharf;

    @NotNull
    private String manzil;

    private Viloyat valoyat;

    private Tuman tuman;

    public Bemor() {
    }

    public Bemor(Long id, @NotNull String ism, @NotNull String familiya, @NotNull String sharf, @NotNull String manzil,
            Viloyat valoyat, Tuman tuman) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharf = sharf;
        this.manzil = manzil;
        this.valoyat = valoyat;
        this.tuman = tuman;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSharf() {
        return sharf;
    }

    public void setSharf(String sharf) {
        this.sharf = sharf;
    }

    public String getManzil() {
        return manzil;
    }

    public void setManzil(String manzil) {
        this.manzil = manzil;
    }

    public Viloyat getValoyat() {
        return valoyat;
    }

    public void setValoyat(Viloyat valoyat) {
        this.valoyat = valoyat;
    }

    public Tuman getTuman() {
        return tuman;
    }

    public void setTuman(Tuman tuman) {
        this.tuman = tuman;
    }

}