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
@Table(name = "tb_rental")
public class Rental {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rental")
    private Long idRental;

    @OneToOne
    @MapsId
    private User user;

    @Column(name = "no_npwp")
    private String npwp;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat", columnDefinition = "TEXT")
    private String alamat;

    @Column(name = "telepon")
    private String telepon;

    public Rental(){

    }

    public Rental(Long idRental, String npwp, String nama, String alamat, String telepon, User user){
        super();
        this.idRental = idRental;
        this.npwp = npwp;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.user = user;
    }

    /**
     * @return the idRental
     */
    public Long getIdRental() {
        return idRental;
    }

    /**
     * @param idRental the idRental to set
     */
    public void setIdRental(Long idRental) {
        this.idRental = idRental;
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
     * @return the npwp
     */
    public String getNpwp() {
        return npwp;
    }

    /**
     * @param npwp the npwp to set
     */
    public void setNpwp(String npwp) {
        this.npwp = npwp;
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