package com.info.step3.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "orderly")
public class Orderly {
    /*
     * Attributes
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrderly;

    @ManyToOne
    @JoinColumn(name = "id_event")
    private Event idEvent;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person idPerson;

    @Column(name = "orderly_date_hour")
    private Date orderlyDateHour;

    @Column(name = "alfa_code")
    private String alfaCode;

    @Column(name = "orderly_status")
    private boolean orderlyStatus;

    /*
     * Constructos
     */
    public Orderly() {
    }

    public Orderly(Long idOrderly, Event idEvent, Person idPerson, Date orderlyDateHour, String alfaCode,
            boolean orderlyStatus) {
        this.idOrderly = idOrderly;
        this.idEvent = idEvent;
        this.idPerson = idPerson;
        this.orderlyDateHour = orderlyDateHour;
        this.alfaCode = alfaCode;
        this.orderlyStatus = orderlyStatus;
    }

    /*
     * Getters and Setters
     */
    public Long getIdOrderly() {
        return idOrderly;
    }

    public void setIdOrderly(Long idOrderly) {
        this.idOrderly = idOrderly;
    }

    public Event getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

    public Person getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Person idPerson) {
        this.idPerson = idPerson;
    }

    public Date getOrderlyDateHour() {
        return orderlyDateHour;
    }

    public void setOrderlyDateHour(Date orderlyDateHour) {
        this.orderlyDateHour = orderlyDateHour;
    }

    public String getAlfaCode() {
        return alfaCode;
    }

    public void setAlfaCode(String alfaCode) {
        this.alfaCode = alfaCode;
    }

    public boolean isOrderlyStatus() {
        return orderlyStatus;
    }

    public void setOrderlyStatus(boolean orderlyStatus) {
        this.orderlyStatus = orderlyStatus;
    }

}
