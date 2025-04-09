/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cf12;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/**
 *
 * @author riofe
 */
public class CF12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Data Mahasiswa");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String[] columnNames = {"Nama", "NIM"};
        DefaultTableModel model = new DefaultTableModel (columnNames, 0);
        JTable table = new JTable(model);
        
        JButton addButton = new JButton("Tambah");
        JTextField nameField = new JTextField(10);
        JTextField nimField = new JTextField(10);
        
        addButton.addActionListener(e -> {
            model.addRow(new Object[] {nameField.getText(), nimField.getText()});
        });
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nama:"));
        panel.add(nameField);
        panel.add(new JLabel("NIM:"));
        panel.add(nimField);
        panel.add(addButton);
        
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
