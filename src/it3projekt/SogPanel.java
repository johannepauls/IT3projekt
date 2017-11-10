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
 * @author lenovo
 */
public class SogPanel extends JPanel{
    private GridBagLayout gb = new GridBagLayout();
    private CardLayout card;
    private String cpr;
    private JPanel panelHolder;
    private PatientPanel patientP; 
    private Arkiv arkiv;
    private String patient;

    public SogPanel(PatientPanel pp, Arkiv a, CardLayout c, JPanel p){
        initComponents();
        card=c;
        panelHolder = p;
        patientP = pp;
        arkiv=a;
    }
    
    private void initComponents() {
        setLayout(gb);
        setBackground(new java.awt.Color(255, 255, 255)); //set hvid baggrund på sogPanel
        JLabel labelSog = new JLabel("Indtast Patient CPR: ");
        JTextField textSog = new JTextField(15);
        JButton buttonSog = new JButton("Søg");

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(labelSog, constraints);

        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 1;
        add(textSog, constraints);

        constraints.anchor = GridBagConstraints.EAST;
        constraints.gridx = 2;
        constraints.gridwidth = 2;
        add(buttonSog, constraints);

        buttonSog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(panelHolder, "patientPanel");
                cpr=textSog.getText();
                patient = arkiv.getPatient(cpr);
                patientP.findPatient(patient);
            }
        });
        
       
    } 
}
