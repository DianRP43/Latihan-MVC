/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dianrosapratama.controller;

import edu.dianrosapratama.model.pelangganModel;
import edu.dianrosapratama.view.Pelanggan;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class pelanganController {
    
    private pelangganModel model;

    public void setModel(pelangganModel model) {
        this.model = model;
    }
   
    
    
    public void resetForm(Pelanggan view){
    
        String nama = view.getTbNama().getText();
        String email = view.getTbEmail().getText();
        String noTlp = view.getTbNoTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")) {
            
        }else{
            model.resetForm();
        }
    }
    
    public void simpanForm(Pelanggan view){
        String nama = view.getTbNama().getText();
        String email = view.getTbEmail().getText();
        String noTlp = view.getTbNoTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih Kosong");
            
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih Kosong");
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Tlp masih Kosong");
        } else {
            model.simpanForm();
        }
    }
}
