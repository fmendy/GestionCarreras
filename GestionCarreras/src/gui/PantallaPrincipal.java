/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import Logica.GuardadoAutomatico;
import Logica.LeerEscribirObjetos;
import Logica.LookAndFeel;
import gui.carreras.PantallaCarreras;
import gui.corredores.PantallaCorredores;
import gui.informes.PantallaInformes;
import gui.opciones.PantallaOpciones;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.ImageIcon;

/**
 *
 * @author alvar
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    private LeerEscribirObjetos leo=new LeerEscribirObjetos();
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() throws IOException, ClassNotFoundException, UnsupportedClassVersionError {
        initComponents();
        leo.cargar();
        //Establecemos Icono
        this.establecerIcono();
        //Empieza el autoguardado
         GuardadoAutomatico.guardar();   
         //Cargar las ayudas
         mostrarAyuda();
         //Establecmos el pais de la aplicacion
         Locale.setDefault(new Locale("es","ES"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButtonCorredores = new javax.swing.JButton();
        jButtonCarreras = new javax.swing.JButton();
        jButtonOpciones = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemMenuAyuda = new javax.swing.JMenuItem();
        jMenuItemCorredor = new javax.swing.JMenuItem();
        jMenuItemCarrera = new javax.swing.JMenuItem();
        jMenuItemCarreraCorriendo = new javax.swing.JMenuItem();
        jMenuInformes = new javax.swing.JMenu();
        jMenuItemInformes = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCorredores.setText("Corredores");
        jButtonCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresActionPerformed(evt);
            }
        });

        jButtonCarreras.setText("Carreras");
        jButtonCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarrerasActionPerformed(evt);
            }
        });

        jButtonOpciones.setText("Opciones");
        jButtonOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpcionesActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jMenuAyuda.setText("Ayuda...");

        jMenuItemMenuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMenuAyuda.setText("Menu Ayuda");
        jMenuAyuda.add(jMenuItemMenuAyuda);

        jMenuItemCorredor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCorredor.setText("Corredor");
        jMenuAyuda.add(jMenuItemCorredor);

        jMenuItemCarrera.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCarrera.setText("Carrera");
        jMenuAyuda.add(jMenuItemCarrera);

        jMenuItemCarreraCorriendo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCarreraCorriendo.setText("CarreraCorriendo");
        jMenuAyuda.add(jMenuItemCarreraCorriendo);

        jMenuBar1.add(jMenuAyuda);

        jMenuInformes.setText("Informes...");

        jMenuItemInformes.setText("Ver Informes");
        jMenuItemInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInformesActionPerformed(evt);
            }
        });
        jMenuInformes.add(jMenuItemInformes);

        jMenuBar1.add(jMenuInformes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCorredores)
                    .addComponent(jButtonCarreras))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCorredores)
                    .addComponent(jButtonOpciones))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarreras)
                    .addComponent(jButtonSalir))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresActionPerformed
        // TODO add your handling code here:
        PantallaCorredores pantallaVerCorredores=new PantallaCorredores(this, true);
        pantallaVerCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonCorredoresActionPerformed

    private void jButtonCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarrerasActionPerformed
        // TODO add your handling code here:
        PantallaCarreras pc=new PantallaCarreras(this, true);
        pc.setVisible(true);
    }//GEN-LAST:event_jButtonCarrerasActionPerformed

    private void jButtonOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpcionesActionPerformed
        // TODO add your handling code here:
        PantallaOpciones po=new PantallaOpciones(this, true);
        po.setVisible(true);
        //Al volver de la pantalla de opciones, se recarga el lookandfell
        LookAndFeel.actulizarLookAndFeel(this);
    }//GEN-LAST:event_jButtonOpcionesActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        leo.guardar();
        GuardadoAutomatico.cerrarGuardado();

        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInformesActionPerformed
        // TODO add your handling code here:
        PantallaInformes pi = new PantallaInformes(this, true);
        pi.setVisible(true);
    }//GEN-LAST:event_jMenuItemInformesActionPerformed

    public void establecerIcono(){
        ImageIcon imageIcon=new ImageIcon("src/gui/Imagenes/race.png");
        Image img=imageIcon.getImage();
        this.setIconImage(img);            
    }
    public  void mostrarAyuda(){
        //Se carga el fichero de ayuda
        File file=new File("JavaHelp"+File.separator+"help_set.hs");
        try {
            URL url=file.toURI().toURL();

            System.out.println(url);
            
            try {
                //Se crea el helpset
                HelpSet helpset=new HelpSet(getClass().getClassLoader(), url);
                //Se crea el helpBroker
                HelpBroker hb=helpset.createHelpBroker();
                
                //cargar las ayudas
                hb.enableHelpOnButton(jMenuItemMenuAyuda, "indice", helpset);
                hb.enableHelpKey(getRootPane(), "indice", helpset);
                hb.enableHelpOnButton(jMenuItemCorredor, "ayuda_corredor", helpset);
                hb.enableHelpOnButton(jMenuItemCarrera, "ayuda_carrera", helpset);
                hb.enableHelpOnButton(jMenuItemCarreraCorriendo, "ayuda_carrera_corriendo", helpset);
                
                
                
            } catch (HelpSetException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PantallaPrincipal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarreras;
    private javax.swing.JButton jButtonCorredores;
    private javax.swing.JButton jButtonOpciones;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInformes;
    private javax.swing.JMenuItem jMenuItemCarrera;
    private javax.swing.JMenuItem jMenuItemCarreraCorriendo;
    private javax.swing.JMenuItem jMenuItemCorredor;
    private javax.swing.JMenuItem jMenuItemInformes;
    private javax.swing.JMenuItem jMenuItemMenuAyuda;
    // End of variables declaration//GEN-END:variables
}
