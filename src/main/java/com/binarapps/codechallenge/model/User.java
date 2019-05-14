package com.binarapps.codechallenge.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_user")
    private Long idUser;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Driver driver;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Penyewa penyewa;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Rental rental;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public User(){

    }

    public User(Long idUser, String email, String password, String role){
        super();
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    /**
     * @return the idUser
     */
    public Long getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    
}