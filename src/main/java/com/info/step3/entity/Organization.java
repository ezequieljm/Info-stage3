package com.info.step3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "organizations")
public class Organization {

    /*
     * Attributes
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_org")
    private Long idOrg;

    @Column(name = "email")
    private String email;

    @Column(name = "name_org")
    private String name_org;

    @Column(name = "phone")
    private String phone;

    @Column(name = "cuit")
    private String cuit;

    @Column(name = "key_org")
    private String key_org;

    @OneToOne
    @JoinColumn(name = "id_address")
    private Address idAddress;

    /*
     * Constructors
     */
    public Organization(String email, String name_org, String phone, String cuit, String key_org, Address idAddress) {
        this.email = email;
        this.name_org = name_org;
        this.phone = phone;
        this.cuit = cuit;
        this.key_org = key_org;
        this.idAddress = idAddress;
    }

    public Organization() {
    }

    /*
     * Getters and setters
     */
    public Long getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(Long idOrg) {
        this.idOrg = idOrg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName_org() {
        return name_org;
    }

    public void setName_org(String name_org) {
        this.name_org = name_org;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getKey_org() {
        return key_org;
    }

    public void setKey_org(String key_org) {
        this.key_org = key_org;
    }

    public Address getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Address idAddress) {
        this.idAddress = idAddress;
    }
}
