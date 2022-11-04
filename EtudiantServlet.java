/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.finalprojet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/etudiant")
public class EtudiantServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {          
       Etudiant etudiant1 = new Etudiant(1,"Jean",12.3,"img1.jpg");      
       Etudiant etudiant2 = new Etudiant(2,"Marie",12.9,"img2.jpg");       
       Etudiant etudiant3 = new Etudiant(3,"Amandine",16.5,"img3.jpg");
       Etudiant etudiant4 = new Etudiant(4,"Jerry",8.2,"img4.jpg");
        
        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        listeEtudiants.add(etudiant1);
        listeEtudiants.add(etudiant2);
        listeEtudiants.add(etudiant3);
        listeEtudiants.add(etudiant4);
        request.setAttribute("etudiants", listeEtudiants);
        
       request.getRequestDispatcher("WEB-INF/img").forward(request, response); 
       request.getRequestDispatcher("WEB-INF/jstlEtudiant.jsp").forward(request, response);
    }
}