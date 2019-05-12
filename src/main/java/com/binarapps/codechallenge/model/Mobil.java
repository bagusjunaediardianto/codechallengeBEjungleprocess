package com.binarapps.codechallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_mobil")
public class Mobil {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_mobil")
    private Long id;

    @ManyToOne
    private Rental rental;

    @Column(name = "plat_nomor")
    private String plat;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "merk")
    private String merk;

    @Column(name = "nama")
    private String nama;

    @Column(name = "tahun")
    private String tahun;

    @Column(name = "harga")
    private Integer harga;

    public Mobil() {

    }

    public Mobil(Long id, String plat, String jenis, String merk, String nama, String tahun, int harga, Long idRental) {
        super();
        this.id = id;
        this.plat = plat;
        this.jenis = jenis;
        this.merk = merk;
        this.nama = nama;
        this.tahun = tahun;
        this.harga = harga;
        this.setRental(new Rental(idRental, "", "", "", ""));
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the rental
     */
    public Rental getRental() {
        return rental;
    }

    /**
     * @param rental the rental to set
     */
    public void setRental(Rental rental) {
        this.rental = rental;
    }

    /**
     * @return the plat
     */
    public String getPlat() {
        return plat;
    }

    /**
     * @param plat the plat to set
     */
    public void setPlat(String plat) {
        this.plat = plat;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tahun
     */
    public String getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    

}