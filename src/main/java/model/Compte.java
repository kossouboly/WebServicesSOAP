package model;

import java.util.Date;
import java.util.List;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {

        return code;
    }



}
