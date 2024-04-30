/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import FormFilm.FormNoviFilm;
import FormFilm.FormPretragaFilma;
import FormTermin.FormPretragaTermina;
import controller.ClientController;
import domain.Administrator;
import domain.Film;
import domain.Gledalac;
import domain.Karta;
import domain.Sala;
import domain.Termin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.TableModelKarte;
import session.Session;

/**
 *
 * @author Ari
 */
public class MainForm extends javax.swing.JFrame {

    private Administrator ulogovani;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        this.ulogovani = Session.getInstance().getUlogovani();
        lblUlogovani.setText("Ulogovani administrator: " + ulogovani);
        setTitle("Klijentska forma");
        popuniFilmove();
        popuniSale();
        popuniGledaoce();
        tblKarte.setModel(new TableModelKarte());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUlogovani = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbGledalac = new javax.swing.JComboBox();
        txtSediste = new javax.swing.JTextField();
        btnDodajKartu = new javax.swing.JButton();
        btnObrisiKartu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKarte = new javax.swing.JTable();
        btnSacuvaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbFilm = new javax.swing.JComboBox();
        cmbSala = new javax.swing.JComboBox();
        txtCenaKarte = new javax.swing.JFormattedTextField();
        cmbProjekcija = new javax.swing.JComboBox<>();
        txtDatumVreme = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        miNoviFilm = new javax.swing.JMenuItem();
        miPretragaFilma = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        miPretragaTermina = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        miOdjava = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUlogovani.setText("Ulogovani");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Termin"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Karte"));

        jLabel6.setText("Gledalac:");

        jLabel7.setText("Sediste:");

        cmbGledalac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtSediste.setText("A1");

        btnDodajKartu.setText("Dodaj kartu");
        btnDodajKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKartuActionPerformed(evt);
            }
        });

        btnObrisiKartu.setText("Obrisi kartu");
        btnObrisiKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiKartuActionPerformed(evt);
            }
        });

        tblKarte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblKarte);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGledalac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSediste))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDodajKartu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisiKartu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbGledalac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSediste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodajKartu)
                    .addComponent(btnObrisiKartu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSacuvaj.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSacuvaj.setText("Sacuvaj film");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        jLabel1.setText("Film:");

        jLabel2.setText("Sala:");

        jLabel3.setText("Cena karte:");

        jLabel4.setText("Projekcija:");

        jLabel5.setText("Datum i vreme:");

        cmbFilm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCenaKarte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCenaKarte.setText("1200");

        cmbProjekcija.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2D", "3D", "iMAX" }));

        txtDatumVreme.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm"))));
        txtDatumVreme.setText("11.07.2024 21:15");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(85, 85, 85)
                                .addComponent(cmbFilm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCenaKarte)
                                    .addComponent(cmbSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbProjekcija, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDatumVreme)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCenaKarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbProjekcija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDatumVreme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu6.setText("Film");

        miNoviFilm.setText("Novi film");
        miNoviFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoviFilmActionPerformed(evt);
            }
        });
        jMenu6.add(miNoviFilm);

        miPretragaFilma.setText("Pretraga filma");
        miPretragaFilma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaFilmaActionPerformed(evt);
            }
        });
        jMenu6.add(miPretragaFilma);

        jMenuBar1.add(jMenu6);

        jMenu8.setText("Termin");

        miPretragaTermina.setText("Pretraga termina");
        miPretragaTermina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaTerminaActionPerformed(evt);
            }
        });
        jMenu8.add(miPretragaTermina);

        jMenuBar1.add(jMenu8);

        jMenu7.setText("Odjava");

        miOdjava.setText("Odjavi se");
        miOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOdjavaActionPerformed(evt);
            }
        });
        jMenu7.add(miOdjava);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUlogovani))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUlogovani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNoviFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoviFilmActionPerformed
        new FormNoviFilm(this, true).setVisible(true);
    }//GEN-LAST:event_miNoviFilmActionPerformed

    private void miPretragaFilmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaFilmaActionPerformed
        new FormPretragaFilma(this, true).setVisible(true);
    }//GEN-LAST:event_miPretragaFilmaActionPerformed

    private void miOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOdjavaActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da "
                + "se odjavite?", "Konfirmacija", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.NO_OPTION) {
            return;
        }

        if (result == JOptionPane.YES_OPTION) {
            try {
                ClientController.getInstance().logout(ulogovani);
                new LoginForma().setVisible(true);
                Session.getInstance().setUlogovani(null);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_miOdjavaActionPerformed

    private void miPretragaTerminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaTerminaActionPerformed
        new FormPretragaTermina(this, true).setVisible(true);
    }//GEN-LAST:event_miPretragaTerminaActionPerformed

    private void btnDodajKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKartuActionPerformed

        if (txtSediste.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Morate uneti sediste!");
            return;
        }

        Gledalac gledalac = (Gledalac) cmbGledalac.getSelectedItem();
        String sediste = txtSediste.getText();

        Karta k = new Karta(null, null, gledalac, sediste);

        TableModelKarte tm = (TableModelKarte) tblKarte.getModel();

        if (tm.postojiSediste(sediste)) {
            JOptionPane.showMessageDialog(this, "Sediste " + sediste + " je vec zauzeto!");
            return;
        }

        tm.dodajKartu(k);

    }//GEN-LAST:event_btnDodajKartuActionPerformed

    private void btnObrisiKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiKartuActionPerformed

        int row = tblKarte.getSelectedRow();

        if (row >= 0) {
            TableModelKarte tm = (TableModelKarte) tblKarte.getModel();
            tm.obrisiKartu(row);
        }

    }//GEN-LAST:event_btnObrisiKartuActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed

        try {
            if (txtCenaKarte.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Morate uneti cenu karte!");
                return;
            }

            Film film = (Film) cmbFilm.getSelectedItem();
            Sala sala = (Sala) cmbSala.getSelectedItem();
            double cenaKarte = Double.parseDouble(txtCenaKarte.getText());
            String projekcija = (String) cmbProjekcija.getSelectedItem();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date datumVreme = sdf.parse(txtDatumVreme.getText());

            TableModelKarte tm = (TableModelKarte) tblKarte.getModel();

            Termin t = new Termin(null, datumVreme, cenaKarte,
                    projekcija, film, sala, ulogovani, tm.getLista());

            ClientController.getInstance().addTermin(t);
            txtCenaKarte.setText("");
            txtDatumVreme.setText("");
            txtSediste.setText("");
            tm.getLista().clear();
            tm.fireTableDataChanged();
            JOptionPane.showMessageDialog(this, "Uspesno sacuvan termin!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
//            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSacuvajActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajKartu;
    private javax.swing.JButton btnObrisiKartu;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox cmbFilm;
    private javax.swing.JComboBox cmbGledalac;
    private javax.swing.JComboBox<String> cmbProjekcija;
    private javax.swing.JComboBox cmbSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUlogovani;
    private javax.swing.JMenuItem miNoviFilm;
    private javax.swing.JMenuItem miOdjava;
    private javax.swing.JMenuItem miPretragaFilma;
    private javax.swing.JMenuItem miPretragaTermina;
    private javax.swing.JTable tblKarte;
    private javax.swing.JFormattedTextField txtCenaKarte;
    private javax.swing.JFormattedTextField txtDatumVreme;
    private javax.swing.JTextField txtSediste;
    // End of variables declaration//GEN-END:variables

    public void popuniFilmove() {
        try {
            ArrayList<Film> filmovi = ClientController.getInstance().getAllFilm();

            cmbFilm.removeAllItems();

            for (Film film : filmovi) {
                cmbFilm.addItem(film);
            }

        } catch (Exception ex) {
            Logger.getLogger(FormNoviFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniSale() {
        try {
            ArrayList<Sala> sale = ClientController.getInstance().getAllSala();

            cmbSala.removeAllItems();

            for (Sala sala : sale) {
                cmbSala.addItem(sala);
            }

        } catch (Exception ex) {
            Logger.getLogger(FormNoviFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniGledaoce() {
        try {
            ArrayList<Gledalac> gledaoci = ClientController.getInstance().getAllGledalac();

            cmbGledalac.removeAllItems();

            for (Gledalac gledalac : gledaoci) {
                cmbGledalac.addItem(gledalac);
            }

        } catch (Exception ex) {
            Logger.getLogger(FormNoviFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
