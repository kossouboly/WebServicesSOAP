package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import model.Compte;

import java.util.Date;
import java.util.List;


@WebService
public class Bankservice {


    @WebMethod(operationName = "ConvertionEuroToFCFA")
    public double conversion(@WebParam(name = "montant") double amount) {

        return amount * 600;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {

        return new Compte(code, Math.random() * 6000, new Date());
    }

    @WebMethod
    public List<Compte> listeComptes() {


        return List.of(
                new Compte(1, Math.random() * 6000, new Date()),
                new Compte(2, Math.random() * 600, new Date()),
                new Compte(3, Math.random() * 55000, new Date())
        );
    }

}
