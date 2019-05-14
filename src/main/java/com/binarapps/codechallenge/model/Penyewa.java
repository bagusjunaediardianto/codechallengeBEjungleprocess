package com.binarapps.codechallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_penyewa")
public class Penyewa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="id_penyewa")
    private Long idPenyewa;

    @OneToOne
    @MapsId
    private User user;

    @Column(name = "no_ktp")
    private String ktp;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat", columnDefinition = "TEXT")
    private String alamat;

    @Column(name = "telepon")
    private String telepon;

    public Penyewa() {

    }

    public Penyewa(Long idPenyewa, String ktp, String nama, String alamat, String telepon, User user) {
        super();
        this.idPenyewa = idPenyewa;
        this.ktp = ktp;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.user = user;
    }

    /**
     * @return the idPenyewa
     */
    public Long getIdPenyewa() {
        return idPenyewa;
    }

    /**
     * @param idPenyewa the idPenyewa to set
     */
    public void setIdPenyewa(Long idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the ktp
     */
    public String getKtp() {
        return ktp;
    }

    /**
     * @param ktp the ktp to set
     */
    public void setKtp(String ktp) {
        this.ktp = ktp;
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
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}