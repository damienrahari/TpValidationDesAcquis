/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojet;

import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class GestionEtudiants {
   private static ArrayList<Etudiant> listeEtudiants;

    public GestionEtudiants() {
        listeEtudiants= new ArrayList<>();
        
    }

    public static ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }
     
}
