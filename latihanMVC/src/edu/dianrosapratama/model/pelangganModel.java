/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dianrosapratama.model;

import edu.dianrosapratama.model.event.pelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class pelangganModel {
    private String nama, email, noTelp;

    private pelangganListener pelangganlistener;

    public pelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(pelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    protected void fireOnChange(){
        if (pelangganlistener!=null) {
            pelangganlistener.onChange(this);
        }
    }
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Sukses");
    }
    
}
