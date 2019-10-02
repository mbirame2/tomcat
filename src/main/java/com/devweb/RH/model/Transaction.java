package com.devweb.RH.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Column(length = 30)
    private String nomcomplet;



    @NotBlank
    @Column(length = 50)
    private String telephone;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date dateEnvoie;
    @NotBlank
    @Column(length = 50)
    private String nomcompletReceveur;
    @NotBlank
    @Column(length = 50)
    private String cni;

    @NotBlank
    @Column(length = 50)
    private String adresse;
    @NotBlank
    @Column(length = 15)
    private String status;
    @NotBlank
    @Column(length = 100)
    private String montantaverser;


    @NotBlank
    @Column(length = 50)
    private String cniReceveur;

    @NotBlank
    @Column(length = 50)
    private String codeTransfert;

    @Column(length = 50)
    private String envoitarif;
    @NotBlank
    @Column(length = 50)
    private String receveurtarif;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateEnvoie() {
        return dateEnvoie;
    }

    public void setDateEnvoie(Date dateEnvoie) {
        this.dateEnvoie = dateEnvoie;
    }

    public String getNomcompletReceveur() {
        return nomcompletReceveur;
    }

    public void setNomcompletReceveur(String nomcompletReceveur) {
        this.nomcompletReceveur = nomcompletReceveur;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMontantaverser() {
        return montantaverser;
    }

    public void setMontantaverser(String montantaverser) {
        this.montantaverser = montantaverser;
    }

    public String getCniReceveur() {
        return cniReceveur;
    }

    public void setCniReceveur(String cniReceveur) {
        this.cniReceveur = cniReceveur;
    }

    public String getCodeTransfert() {
        return codeTransfert;
    }

    public void setCodeTransfert(String codeTransfert) {
        this.codeTransfert = codeTransfert;
    }

    public String getEnvoitarif() {
        return envoitarif;
    }

    public void setEnvoitarif(String envoitarif) {
        this.envoitarif = envoitarif;
    }

    public String getReceveurtarif() {
        return receveurtarif;
    }

    public void setReceveurtarif(String receveurtarif) {
        this.receveurtarif = receveurtarif;
    }
}