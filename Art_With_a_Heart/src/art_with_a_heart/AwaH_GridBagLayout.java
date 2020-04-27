/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art_with_a_heart;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Rasheed
 */
public class AwaH_GridBagLayout {

    public static void addComponentsToPane(Container pane) {

        pane.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();
        gBC.fill = GridBagConstraints.HORIZONTAL;
        gBC.insets = new Insets(10, 0, 0, 0);  //Padding

        JTextField customQuery = new JTextField("Custom Query");
        customQuery.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                customQuery.setText("");
            }
        });
        gBC.gridx = 0;
        gBC.gridy = 0;
        gBC.gridwidth = 3;
        customQuery.setEditable(true);
        pane.add(customQuery, gBC);

        JTextField startDate = new JTextField("Start Date");
        startDate.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                startDate.setText("");
            }
        });
        gBC.gridx = 0;
        gBC.gridy = 1;
        gBC.gridwidth = 1;
        customQuery.setEditable(true);
        pane.add(startDate, gBC);

        JTextField endDate = new JTextField("End Date");
        endDate.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                endDate.setText("");
            }
        });
        gBC.gridx = 1;
        gBC.gridy = 1;
        gBC.gridwidth = 1;
        customQuery.setEditable(true);
        pane.add(endDate, gBC);

        JComboBox jcmbSample = new JComboBox(new String[]{"Select..", "Birthdays", "Work-Anniversaries"});
        gBC.gridx = 2;
        gBC.gridy = 1;
        gBC.gridwidth = 1;
        //gBC.ipady = 0;
        //gBC.weighty = 1.0;
        //gBC.anchor = GridBagConstraints.PAGE_END;
        pane.add(jcmbSample, gBC);

        JButton jbnButton;
        jbnButton = new JButton("Submit");
        gBC.ipady = 40; //This component has more breadth compared to other buttons
        gBC.weightx = 0.0;
        gBC.gridwidth = 3;
        gBC.gridx = 0;
        gBC.gridy = 2;
        pane.add(jbnButton, gBC);

    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("GridBagLayout Source Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
