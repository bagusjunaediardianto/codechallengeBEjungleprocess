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
@Table(name = "tb_driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_driver")
    private Long id;

    @OneToOne
    @MapsId
    private User User;

    @Column(name = "no_sim")
    private String sim;

    @Column(name = "no_ktp")
    private String ktp;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat", columnDefinition = "TEXT")
    private String alamat;

    @Column(name = "telepon")
    private String telepon;

    public Driver(){

    }

    public Driver(Long id, String sim, String ktp, String nama, String alamat ,String telepon){
        super();
        this.id = id;
        this.sim = sim;
        this.ktp = ktp;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
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
     * @return the user
     */
    public User getUser() {
        return User;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        User = user;
    }

    /**
     * @return the sim
     */
    public String getSim() {
        return sim;
    }

    /**
     * @param sim the sim to set
     */
    public void setSim(String sim) {
        this.sim = sim;
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