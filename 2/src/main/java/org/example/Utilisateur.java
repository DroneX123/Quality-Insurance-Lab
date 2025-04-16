package org.example;

public class Utilisateur {
    private String nom;
    private String email;
    private String prenon;
    public int ID;

    public Utilisateur(String nom, String prenon,String email,int ID) {
        this.nom = nom;
        this.email = email;
        this.prenon=prenon;
       this.ID=ID;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
