/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojet;

/**
 *
 * @author Administrateur
 */
public class Etudiant {
    private int id;
    private String nom;
    private double moyenne;
    private String image;

    public Etudiant(int id, String nom, double moyenne, String image) {
       this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
        this.image= image;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    public boolean equals(Etudiant e1, Etudiant e2){
        return e1.id == e2.id;
    }
}
