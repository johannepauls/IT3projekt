/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it3projekt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author JohanneP
 */
public class Controller {

    private static JFrame ramme = new JFrame();  
    private static CardLayout card = new CardLayout();
    private static JPanel panelHolder = new JPanel();
    private static Arkiv arkiv = new Arkiv();
    private static KalenderPanel kalenderPanel = new KalenderPanel();
    private static PatientPanel patientPanel = new PatientPanel(card, panelHolder);
    private static JournalPanel journalPanel = new JournalPanel(card, panelHolder);
    private static SogPanel sogPanel = new SogPanel(patientPanel, arkiv, card, panelHolder);
    

    public static void main(String[] args) {
        init();


    }

    private static void init() {

        panelHolder.setLayout(card);

        panelHolder.add(kalenderPanel, "kalenderPanel");
        panelHolder.add(patientPanel, "patientPanel");
        panelHolder.add(journalPanel, "journalPanel");

        //card.show(panelHolder, "journalPanel");
        //tilføj sogPanel og mainPanel i rammen, se BorderLayout
        ramme.getContentPane().add(sogPanel, BorderLayout.NORTH);
        ramme.getContentPane().add(panelHolder, BorderLayout.CENTER);

        // Set en titel på rammen
        ramme.setTitle("SMART SUNDHEDSSYSTEM");
        // Gør at vinduet fylder mindst muligt
        ramme.pack();
        // Gør at programmet lukkes, når der klikkes på den røde knap
        ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Visning af rammen når programmet startes
        ramme.setVisible(true);
    }

}
