/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it3projekt;

import java.sql.*;

/**
 *
 * @author lenovo
 */
public class Arkiv {

    private Connection conn;
    private Statement stmt;
    private ResultSet rset;
    private String patient;

    public Arkiv() {
         /*try {

           Class.forName("com.mysql.jdbc.Driver").newInstance();					// tilknyt driver

            String url = "jdbc:mysql://su3.eduhost.dk/";						// URL: "JDBC:DBMS://maskinnavn/databasenavn"
            String userName = "admin";									// MySQL brugernavn
            String password = "healerrearpattern";                                                      // MySQL adgangskode

            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            //stmt2 = conn.prepareStatement("INSERT INTO maaling (value,type,tid) VALUES (?,?,NOW())");

        } catch (Exception e) {
            System.out.println("jtest undtagelse: " + e.getMessage());					// udskriv fejlmeddelelse
            e.printStackTrace();
        }*/
    }

    public String getPatient(String c) {
        patient = c;
        /*//denne kode virker i teorien men er ikke brug, da kolonnenavn osv. ikke er afstemt med den faktiske database
        String navn;
        String cpr = c;
        String tlfnr;
        String adresse;
        String by;

        try {
            rset = stmt.executeQuery("SELECT * FROM hospital.cprRegister WHERE CPR = '" + cpr + "'");

            navn = rset.getString("navn");
            tlfnr = rset.getString("tlfnr");
            adresse = rset.getString("adresse");
            by = rset.getString("by");

            patient = navn + "&" + cpr + "&" + tlfnr + "&" + adresse + "&" + by;
        } catch (Exception e) {
            System.out.println("jtest undtagelse: " + e.getMessage());					// udskriv fejlmeddelelse
            e.printStackTrace();
        }
        */
        
        return patient;
    }
    
    public void getIndkaldelse(){
        /*metode, der skal hente hente fra databasen og viser dem på kalenderPanel*/
    }
    
    public void getJournal(){
        /*metode, der skal hente poster fra journalen og vise dem på patientPanel*/
    }
    
    
}
