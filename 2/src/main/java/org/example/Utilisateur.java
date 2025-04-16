package org.example;

public class Utilisateur {
    private String nom;
    private String email;
    private String prenon;

    public Utilisateur(String nom, String prenon,String email) {
        this.nom = nom;
        this.email = email;
        this.prenon=prenon;

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
