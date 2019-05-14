package com.binarapps.codechallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_transaksi")
public class Transaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaksi")
    private Long idTransaksi;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Mobil mobil;

    @ManyToOne
    private Penyewa penyewa;

    @Column(name = "tgl_sewa")
    private String tglSewa;

    @Column(name = "tgl_kembali")
    private String tglKembali;

    @Column(name = "total")
    private int total;

    @Column(name = "denda")
    private int denda;

    public Transaksi () {

    }

    public Transaksi (Long idTransaksi, String tglSewa, String tglKembali,Integer total, Integer denda, Driver driver, Mobil mobil, Penyewa penyewa){
        super();
        this.idTransaksi = idTransaksi;
        this.tglSewa = tglSewa;
        this.tglKembali = tglKembali;
        this.total = total;
        this.denda = denda;
        this.driver = driver;
        this.mobil = mobil;
        this.penyewa = penyewa;
      }

    /**
     * @return the idTransaksi
     */
    public Long getIdTransaksi() {
        return idTransaksi;
    }

    /**
     * @param idTransaksi the idTransaksi to set
     */
    public void setIdTransaksi(Long idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    /**
     * @return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    /**
     * @return the mobil
     */
    public Mobil getMobil() {
        return mobil;
    }

    /**
     * @param mobil the mobil to set
     */
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    /**
     * @return the penyewa
     */
    public Penyewa getPenyewa() {
        return penyewa;
    }

    /**
     * @param penyewa the penyewa to set
     */
    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    /**
     * @return the tglSewa
     */
    public String getTglSewa() {
        return tglSewa;
    }

    /**
     * @param tglSewa the tglSewa to set
     */
    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    /**
     * @return the tglKembali
     */
    public String getTglKembali() {
        return tglKembali;
    }

    /**
     * @param tglKembali the tglKembali to set
     */
    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        this.denda = denda;
    }
}