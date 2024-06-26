/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import pnlsRegistro.VtnRegistroAlum;

/**
 *
 * @author gerar
 */
public class VtnPrincipal extends javax.swing.JFrame
{

    int xMouse;
    int yMouse;
    public static MetodosMenu m = new MetodosMenu();
//    Object[] opciones = {"Grupos",
//                        "Alumnos",
//                        "Ayuda..."};

    /**
     * Creates new form VtnPrincipal
     */
    public VtnPrincipal()
    {
        initComponents();
    }

    public static boolean validaCajasnoVacias(Object... jts)
    {
        boolean bandera = true;
        for (Object x : jts)
        {
            if (x instanceof JTextField caja)
            {
                if (caja.getText().equals(""))
                {
                    bandera = false;
                    break;
                }
            }
            else if (x instanceof JComboBox lista)
            {
                if (lista.getSelectedItem().equals(lista.getItemAt(0)))
                {
                    bandera=false;
                    break;
                }
            }

        }
        return bandera;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panelRaiz = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        contendorBotones = new javax.swing.JPanel();
        pnlAdministracion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlRegistro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlDescripcionAdmin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDescripcionAdmin = new javax.swing.JList<>();
        plnDescripcionRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDescripcionRegistro = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alberca Halcones");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRaiz.setBackground(new java.awt.Color(255, 255, 255));
        panelRaiz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        panelRaiz.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                panelRaizMouseDragged(evt);
            }
        });
        panelRaiz.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                panelRaizMousePressed(evt);
            }
        });
        panelRaiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("_");
        lblMinimizar.setToolTipText("Minimizar");
        lblMinimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblMinimizarMouseExited(evt);
            }
        });
        panelRaiz.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 40));

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setToolTipText("Cerrar");
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblCerrarMouseExited(evt);
            }
        });
        panelRaiz.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, 40));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(96, 91, 91));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRaiz.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 270, 20));

        contendorBotones.setBackground(new java.awt.Color(255, 255, 255));
        contendorBotones.setForeground(new java.awt.Color(255, 255, 255));
        contendorBotones.setLayout(new java.awt.GridLayout(2, 2, 40, 10));

        pnlAdministracion.setBackground(new java.awt.Color(255, 255, 255));
        pnlAdministracion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAdministracion.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlAdministracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnlAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnlAdministracionMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración");

        javax.swing.GroupLayout pnlAdministracionLayout = new javax.swing.GroupLayout(pnlAdministracion);
        pnlAdministracion.setLayout(pnlAdministracionLayout);
        pnlAdministracionLayout.setHorizontalGroup(
            pnlAdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministracionLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlAdministracionLayout.setVerticalGroup(
            pnlAdministracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministracionLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        contendorBotones.add(pnlAdministracion);

        pnlRegistro.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnlRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnlRegistroMouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        contendorBotones.add(pnlRegistro);

        pnlDescripcionAdmin.setBackground(new java.awt.Color(255, 255, 255));
        pnlDescripcionAdmin.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(204, 204, 204));

        listDescripcionAdmin.setBorder(null);
        listDescripcionAdmin.setForeground(new java.awt.Color(178, 169, 169));
        listDescripcionAdmin.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "-Regitro grupos", "-Modificar/Editar", "-Consulta de aluimnos", "-Eliminar" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listDescripcionAdmin);

        javax.swing.GroupLayout pnlDescripcionAdminLayout = new javax.swing.GroupLayout(pnlDescripcionAdmin);
        pnlDescripcionAdmin.setLayout(pnlDescripcionAdminLayout);
        pnlDescripcionAdminLayout.setHorizontalGroup(
            pnlDescripcionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcionAdminLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );
        pnlDescripcionAdminLayout.setVerticalGroup(
            pnlDescripcionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcionAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        contendorBotones.add(pnlDescripcionAdmin);
        pnlDescripcionAdmin.setVisible(false);

        plnDescripcionRegistro.setBackground(new java.awt.Color(255, 255, 255));
        plnDescripcionRegistro.setForeground(new java.awt.Color(255, 255, 255));
        plnDescripcionRegistro.setToolTipText("");

        jScrollPane1.setBorder(null);
        jScrollPane1.setEnabled(false);

        listDescripcionRegistro.setBorder(null);
        listDescripcionRegistro.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "-Registro de almno", "-Consultar alumno" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listDescripcionRegistro.setToolTipText("");
        listDescripcionRegistro.setEnabled(false);
        jScrollPane1.setViewportView(listDescripcionRegistro);

        javax.swing.GroupLayout plnDescripcionRegistroLayout = new javax.swing.GroupLayout(plnDescripcionRegistro);
        plnDescripcionRegistro.setLayout(plnDescripcionRegistroLayout);
        plnDescripcionRegistroLayout.setHorizontalGroup(
            plnDescripcionRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnDescripcionRegistroLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        plnDescripcionRegistroLayout.setVerticalGroup(
            plnDescripcionRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plnDescripcionRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        contendorBotones.add(plnDescripcionRegistro);
        plnDescripcionRegistro.setVisible(false);

        panelRaiz.add(contendorBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 540, 320));

        jPanel5.setPreferredSize(new java.awt.Dimension(320, 550));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        panelRaiz.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 559));

        getContentPane().add(panelRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -5, 930, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelRaizMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelRaizMouseDragged
    {//GEN-HEADEREND:event_panelRaizMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelRaizMouseDragged

    private void panelRaizMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelRaizMousePressed
    {//GEN-HEADEREND:event_panelRaizMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelRaizMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        lblTitulo.setText("Sistema de control Halcoalberca");
    }//GEN-LAST:event_formWindowOpened

    private void pnlRegistroMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlRegistroMouseExited
    {//GEN-HEADEREND:event_pnlRegistroMouseExited
        plnDescripcionRegistro.setVisible(false);
        pnlRegistro.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_pnlRegistroMouseExited

    private void pnlRegistroMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlRegistroMouseEntered
    {//GEN-HEADEREND:event_pnlRegistroMouseEntered
        plnDescripcionRegistro.setVisible(true);
        pnlRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_pnlRegistroMouseEntered

    private void pnlAdministracionMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlAdministracionMouseExited
    {//GEN-HEADEREND:event_pnlAdministracionMouseExited
        pnlAdministracion.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        pnlDescripcionAdmin.setVisible(false);
    }//GEN-LAST:event_pnlAdministracionMouseExited

    private void pnlAdministracionMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlAdministracionMouseEntered
    {//GEN-HEADEREND:event_pnlAdministracionMouseEntered
        pnlDescripcionAdmin.setVisible(true);
        pnlAdministracion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_pnlAdministracionMouseEntered

    private void pnlAdministracionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlAdministracionMouseClicked
    {//GEN-HEADEREND:event_pnlAdministracionMouseClicked
//        int n = JOptionPane.showOptionDialog(this, "Seleccione la opcion de registro", "Registros", JOptionPane.YES_NO_CANCEL_OPTION, 
//                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
//        if (n == 0)
//        {
//            new VtnAñadirGrupos().setVisible(true);
//        }
        new VtnAdmin().setVisible(true);
    }//GEN-LAST:event_pnlAdministracionMouseClicked

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCerrarMouseExited
    {//GEN-HEADEREND:event_lblCerrarMouseExited
        lblCerrar.setBackground(Color.white);
        lblCerrar.setForeground(Color.black);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCerrarMouseEntered
    {//GEN-HEADEREND:event_lblCerrarMouseEntered
        lblCerrar.setBackground(Color.red);
        lblCerrar.setForeground(Color.white);
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCerrarMouseClicked
    {//GEN-HEADEREND:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblMinimizarMouseExited
    {//GEN-HEADEREND:event_lblMinimizarMouseExited
        lblMinimizar.setBackground(Color.white);
        lblMinimizar.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblMinimizarMouseEntered
    {//GEN-HEADEREND:event_lblMinimizarMouseEntered
        lblMinimizar.setBackground(Color.blue);
        lblMinimizar.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblMinimizarMouseClicked
    {//GEN-HEADEREND:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void pnlRegistroMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlRegistroMouseClicked
    {//GEN-HEADEREND:event_pnlRegistroMouseClicked
        new VtnRegistroAlum().setVisible(true);
    }//GEN-LAST:event_pnlRegistroMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel5MouseClicked
    {//GEN-HEADEREND:event_jLabel5MouseClicked
        new VtnRegistroAlum().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contendorBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listDescripcionAdmin;
    private javax.swing.JList<String> listDescripcionRegistro;
    private javax.swing.JPanel panelRaiz;
    private javax.swing.JPanel plnDescripcionRegistro;
    private javax.swing.JPanel pnlAdministracion;
    private javax.swing.JPanel pnlDescripcionAdmin;
    private javax.swing.JPanel pnlRegistro;
    // End of variables declaration//GEN-END:variables
}
