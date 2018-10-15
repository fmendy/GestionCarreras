/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.carreras;

import Logica.Fechas;
import Logica.LogicaCarrera;
import Logica.LogicaCorredores;
import dto.Carrera;
import dto.Corredor;
import gui.TableModels.CorredoresTableModels;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class PantallaCarrerasInscribirCorredores extends javax.swing.JDialog {

    private Carrera carrera;
    private List<Corredor> corredoresInscritos;
    private List<Corredor> corredoresNoInscritos;
    /**
     * Creates new form PantallaCarrerasInscribirCorredores
     */
    public PantallaCarrerasInscribirCorredores(java.awt.Frame parent, boolean modal, Carrera c) {
        super(parent, modal);
        this.carrera=c;
        initComponents();
        cargarCorredoresInscritosYNo();  
    }
    
    
    public void cargarCorredoresInscritosYNo(){
        //Cargo en No con todos los corredores
        System.out.println("ggggg"+LogicaCorredores.getListaCorredores().size());
        corredoresNoInscritos=LogicaCorredores.getListaCorredores();
        System.out.println("bbbbb"+LogicaCorredores.getListaCorredores().size());
        //Cargo el Si con los inscritos, iterando
        Iterator ite=carrera.getCorredoresInscritos().keySet().iterator();
        corredoresInscritos=new ArrayList<>();
        while(ite.hasNext()){
            corredoresInscritos.add(carrera.getCorredoresInscritos().get(ite.next()));
        }
        //borro los inscritos del los no
        System.out.println("aaaaaa"+LogicaCorredores.getListaCorredores().size());
        corredoresNoInscritos.removeAll(corredoresInscritos);
        System.out.println("lllll"+LogicaCorredores.getListaCorredores().size());
        //meto los datos en la tabla
        jTableCorredoresInscritos.setModel(new CorredoresTableModels(corredoresInscritos));
        jTableCorredoresNoInscritos.setModel(new CorredoresTableModels(corredoresNoInscritos));
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
        jTableCorredoresNoInscritos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredoresInscritos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAniadirCorredor = new javax.swing.JButton();
        jButtonRetirarCorredor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredoresNoInscritos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCorredoresNoInscritos);

        jTableCorredoresInscritos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCorredoresInscritos);

        jLabel1.setText("Bolsa de Corredores");

        jLabel2.setText("Corredores Inscritos");

        jButtonAniadirCorredor.setText(">");
        jButtonAniadirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirCorredorActionPerformed(evt);
            }
        });

        jButtonRetirarCorredor.setText("<");
        jButtonRetirarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarCorredorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAniadirCorredor)
                    .addComponent(jButtonRetirarCorredor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButtonAniadirCorredor)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRetirarCorredor)))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAniadirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirCorredorActionPerformed
        // TODO add your handling code here:
        
        int fila=jTableCorredoresNoInscritos.getSelectedRow();
        //compruebo que haya selecionado algo
        if(fila>=0){
            //Compruebo que no se sobrepase el limite de participantes
            if(corredoresInscritos.size()<carrera.getParticipantesMaximos()){
                //creo el corredor
               String nombre=(String)jTableCorredoresNoInscritos.getValueAt(fila, 0);
               String dni=(String)jTableCorredoresNoInscritos.getValueAt(fila, 1);
               Date fecha=Fechas.stringToDate((String)(jTableCorredoresNoInscritos.getValueAt(fila, 2)));
               String direccion=(String)jTableCorredoresNoInscritos.getValueAt(fila, 3);       
               int telefono=(int)jTableCorredoresNoInscritos.getValueAt(fila, 4);  
               Corredor c1=new Corredor(nombre, dni, fecha, direccion, telefono);;
               //lo meto en inscritos
                LogicaCarrera.inscribirCorredor(carrera, c1);
                //recargo las tablas
               cargarCorredoresInscritosYNo();
            }
            else{
                JOptionPane.showMessageDialog(this, "Inscripcion completa", "Inscripcion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un corredor para inscribir", "Inscripcion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAniadirCorredorActionPerformed

    private void jButtonRetirarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarCorredorActionPerformed
        // TODO add your handling code here:
        int fila=jTableCorredoresInscritos.getSelectedRow();
        //compruebo que haya selecionado algo
        if(fila>=0){
            //Compruebo que no se sobrepase el limite de participantes

            //creo el corredor
           String nombre=(String)jTableCorredoresInscritos.getValueAt(fila, 0);
           String dni=(String)jTableCorredoresInscritos.getValueAt(fila, 1);
           Date fecha=Fechas.stringToDate((String)(jTableCorredoresInscritos.getValueAt(fila, 2)));
           String direccion=(String)jTableCorredoresInscritos.getValueAt(fila, 3);       
           int telefono=(int)jTableCorredoresInscritos.getValueAt(fila, 4);  
           Corredor c1=new Corredor(nombre, dni, fecha, direccion, telefono);

           //lo elimino de corredores  inscritos
            System.out.println(LogicaCarrera.saberDorsal(carrera, c1));
            LogicaCarrera.desinscribirCorredor(carrera, LogicaCarrera.saberDorsal(carrera, c1),c1);
            
           //lo meto en NOinscritos
           // LogicaCarrera.inscribirCorredor(carrera, c1);
            //recargo las tablas
           cargarCorredoresInscritosYNo();
                   
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un corredor para eliminar", "Inscripcion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRetirarCorredorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAniadirCorredor;
    private javax.swing.JButton jButtonRetirarCorredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredoresInscritos;
    private javax.swing.JTable jTableCorredoresNoInscritos;
    // End of variables declaration//GEN-END:variables
}