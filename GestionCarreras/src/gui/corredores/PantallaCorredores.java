/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.corredores;

import dto.Corredor;
import gui.TableModels.CorredoresTableModels;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Logica.*;
import gui.PantallaPrincipal;
import java.awt.HeadlessException;
import logica.LeerEscribirCSV;

/**
 *
 * @author alvar
 */
public class PantallaCorredores extends javax.swing.JDialog {

    //Atribtuos
    private LeerEscribirCSV le=new LeerEscribirCSV();
    private PantallaPrincipal pantallaPrincipal;
    /**
     * Creates new form PantallaVerCorredores
     */
    public PantallaCorredores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTableCorredores.setModel(new CorredoresTableModels(LogicaCorredores.getListaCorredores()));
        pantallaPrincipal=(PantallaPrincipal)parent;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jButtonOrdenar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonExportarCSV = new javax.swing.JButton();
        jButtonImportarCSV = new javax.swing.JButton();
        jButtonAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCorredores);

        jButtonOrdenar.setText("Ordenar");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonExportarCSV.setText("Exportar CSV");
        jButtonExportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarCSVActionPerformed(evt);
            }
        });

        jButtonImportarCSV.setText("Importar CSV");
        jButtonImportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportarCSVActionPerformed(evt);
            }
        });

        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonImportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonExportarCSV)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonImportarCSV)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonOrdenar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        try{
            //Creo un array para almacenar los corredores
            Corredor[] corredorFechas=new Corredor[Logica.LogicaCorredores.getListaCorredores().size()];
            //Paso la lista de corredores al array
            corredorFechas=Logica.LogicaCorredores.getListaCorredores().toArray(corredorFechas);
            //Ordeno el array
            Arrays.sort(corredorFechas);
            //Paso el array a un arrayList
            ArrayList<Corredor> listCorredoresOrdenados=new ArrayList<>();
            for(Corredor c: corredorFechas){
                listCorredoresOrdenados.add(c);
            }
            //llamo a table models con el nuevo arrayList
            //La paso a Corredores el nuevo orden para que lo ponga
            LogicaCorredores.setListaCorredores(listCorredoresOrdenados);
            jTableCorredores.setModel(new CorredoresTableModels(listCorredoresOrdenados));
            JOptionPane.showMessageDialog(this,"Datos ordenados","ordenar",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error al ordenar los datos","Ordenar",JOptionPane.ERROR);
        }
    }//GEN-LAST:event_jButtonOrdenarActionPerformed

    private void jButtonExportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarCSVActionPerformed
        le.abrirEscritura("corredores.csv");
        for(Corredor c:Logica.LogicaCorredores.getListaCorredores()){
            le.escribirCSVCorredor(c);
        }
        le.cerrarEscritura();
    }//GEN-LAST:event_jButtonExportarCSVActionPerformed

    private void jButtonImportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportarCSVActionPerformed
        
        Tokenizar tokenizar;
        Corredor c;
        //Vacio la lista actual;
        LogicaCorredores.setListaCorredores(new ArrayList<>());
        try{
            //Abro lectura
            le.abrirLectura("corredores.csv");
            //leo una linea
            String linea;
            linea=le.leerCSV();
            while(linea!=null){
                tokenizar=new Tokenizar(linea);
                //Creo corredor
                c=tokenizar.tokenizarCorredor();
                //Lo añado
                LogicaCorredores.aniadirCorredor(c);
                linea=le.leerCSV();
            }
            //Terminamos la lectura y cerramos
            le.cerrarLectura();
            //Actualizamos la tabla
            jTableCorredores.setModel(new CorredoresTableModels(LogicaCorredores.getListaCorredores()));
            JOptionPane.showMessageDialog(this, "Datos Importados correstamente", "Importacion", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error al importar","IMPORTAR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonImportarCSVActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        PantallaCorredoresAlta pca=new PantallaCorredoresAlta(pantallaPrincipal, true);
        pca.setVisible(true);
        jTableCorredores.setModel(new CorredoresTableModels(LogicaCorredores.getListaCorredores()));
    }//GEN-LAST:event_jButtonAltaActionPerformed

    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonExportarCSV;
    private javax.swing.JButton jButtonImportarCSV;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
