/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pnlsRegistro;

/**
 *
 * @author sebasgil
 */
public class VtnRegistroInternos extends javax.swing.JPanel
{

    /**
     * Creates new form VtnRegistroInternos
     */
    public VtnRegistroInternos()
    {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        raizInternos = new javax.swing.JPanel();
        nombre2 = new javax.swing.JTextField();
        btnCancelarRegInterno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JTextField();
        claveGrupo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptarRegInterno = new javax.swing.JButton();
        semestre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numControl = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(845, 483));

        raizInternos.setBackground(new java.awt.Color(204, 204, 204));

        nombre2.setBackground(new java.awt.Color(255, 255, 255));
        nombre2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nombre2ActionPerformed(evt);
            }
        });

        btnCancelarRegInterno.setBackground(new java.awt.Color(18, 179, 171));
        btnCancelarRegInterno.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarRegInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Cancelar 50.png"))); // NOI18N
        btnCancelarRegInterno.setText("Cancelar");
        btnCancelarRegInterno.setBorder(null);
        btnCancelarRegInterno.setBorderPainted(false);
        btnCancelarRegInterno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarRegInternoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clave del grupo a inscribir:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Teléfono:");

        nombre3.setBackground(new java.awt.Color(255, 255, 255));
        nombre3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nombre3ActionPerformed(evt);
            }
        });

        claveGrupo.setBackground(new java.awt.Color(255, 255, 255));
        claveGrupo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                claveGrupoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nivel:");

        direccion.setBackground(new java.awt.Color(255, 255, 255));
        direccion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                direccionActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo:");

        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nombre1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 179, 171));
        jLabel8.setText("REGISTRO");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Direccion:");

        btnAceptarRegInterno.setBackground(new java.awt.Color(18, 179, 171));
        btnAceptarRegInterno.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptarRegInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Marca de verificación 48 (1).png"))); // NOI18N
        btnAceptarRegInterno.setText("Aceptar");
        btnAceptarRegInterno.setBorder(null);
        btnAceptarRegInterno.setBorderPainted(false);
        btnAceptarRegInterno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarRegInternoActionPerformed(evt);
            }
        });

        semestre.setBackground(new java.awt.Color(255, 255, 255));
        semestre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                semestreActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Semestre:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Numero de cotrol:");

        numControl.setBackground(new java.awt.Color(255, 255, 255));
        numControl.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                numControlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout raizInternosLayout = new javax.swing.GroupLayout(raizInternos);
        raizInternos.setLayout(raizInternosLayout);
        raizInternosLayout.setHorizontalGroup(
            raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(raizInternosLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel8)
                .addGap(291, 291, 291))
            .addGroup(raizInternosLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptarRegInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(nombre3)
                        .addComponent(nombre2)
                        .addComponent(claveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(raizInternosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnCancelarRegInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(291, 291, 291))
                    .addGroup(raizInternosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(semestre, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(numControl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        raizInternosLayout.setVerticalGroup(
            raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(raizInternosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(raizInternosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(raizInternosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(raizInternosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarRegInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegInterno))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(raizInternos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(raizInternos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombre2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nombre2ActionPerformed
    {//GEN-HEADEREND:event_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre2ActionPerformed

    private void btnCancelarRegInternoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarRegInternoActionPerformed
    {//GEN-HEADEREND:event_btnCancelarRegInternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarRegInternoActionPerformed

    private void nombre3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nombre3ActionPerformed
    {//GEN-HEADEREND:event_nombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre3ActionPerformed

    private void claveGrupoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_claveGrupoActionPerformed
    {//GEN-HEADEREND:event_claveGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveGrupoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_direccionActionPerformed
    {//GEN-HEADEREND:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nombreActionPerformed
    {//GEN-HEADEREND:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nombre1ActionPerformed
    {//GEN-HEADEREND:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void btnAceptarRegInternoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarRegInternoActionPerformed
    {//GEN-HEADEREND:event_btnAceptarRegInternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarRegInternoActionPerformed

    private void semestreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_semestreActionPerformed
    {//GEN-HEADEREND:event_semestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestreActionPerformed

    private void numControlActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_numControlActionPerformed
    {//GEN-HEADEREND:event_numControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numControlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarRegInterno;
    private javax.swing.JButton btnCancelarRegInterno;
    private javax.swing.JTextField claveGrupo;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JTextField numControl;
    private javax.swing.JPanel raizInternos;
    private javax.swing.JTextField semestre;
    // End of variables declaration//GEN-END:variables
}
