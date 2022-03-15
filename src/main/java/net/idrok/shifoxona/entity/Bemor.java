package net.idrok.shifoxona.entity;

import javax.persistence.*;

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

    private Viloyat viloyat;

    @ManyToOne
    private Tuman tuman;

    public Bemor() {
    }

    public Bemor(Long id, @NotNull String ism, @NotNull String familiya, @NotNull String sharf, @NotNull String manzil,
            Viloyat viloyat, Tuman tuman) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharf = sharf;
        this.manzil = manzil;
        this.viloyat = viloyat;
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
        return viloyat;
    }

    public void setValoyat(Viloyat valoyat) {
        this.viloyat = valoyat;
    }

    public Tuman getTuman() {
        return tuman;
    }

    public void setTuman(Tuman tuman) {
        this.tuman = tuman;
    }

}