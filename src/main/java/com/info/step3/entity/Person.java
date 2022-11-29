package com.info.step3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "person")
public class Person {
    /*
     * Attributes
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;

    @Column(name = "key_person")
    private String keyPerson;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "person_status")
    private boolean personStatus;

    @Column(name = "dni")
    private int dni;

    /*
     * Constructors
     */
    public Person() {
    }

    public Person(Long idPerson, String keyPerson, String firstname, String lastname, boolean personStatus, int dni) {
        this.idPerson = idPerson;
        this.keyPerson = keyPerson;
        this.firstname = firstname;
        this.lastname = lastname;
        this.personStatus = personStatus;
        this.dni = dni;
    }

    /*
     * Getters and Setters
     */
    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getKeyPerson() {
        return keyPerson;
    }

    public void setKeyPerson(String keyPerson) {
        this.keyPerson = keyPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(boolean personStatus) {
        this.personStatus = personStatus;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
