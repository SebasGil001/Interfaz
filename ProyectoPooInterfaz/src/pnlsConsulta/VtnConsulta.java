/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pnlsConsulta;

/**
 *
 * @author sebasgil
 */
public class VtnConsulta extends javax.swing.JPanel
{

    /**
     * Creates new form VtnConsulta
     */
    public VtnConsulta()
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

        contenidoBusquedas = new javax.swing.JPanel();
        raizConsulta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ingresoNom = new javax.swing.JTextField();

        contenidoBusquedas.setBackground(new java.awt.Color(232, 232, 232));
        contenidoBusquedas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                contenidoBusquedasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenidoBusquedasLayout = new javax.swing.GroupLayout(contenidoBusquedas);
        contenidoBusquedas.setLayout(contenidoBusquedasLayout);
        contenidoBusquedasLayout.setHorizontalGroup(
            contenidoBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoBusquedasLayout.setVerticalGroup(
            contenidoBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(770, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        raizConsulta.setBackground(new java.awt.Color(232, 232, 232));
        raizConsulta.setPreferredSize(new java.awt.Dimension(770, 590));

        jLabel8.setFont(new java.awt.Font("Kailasa", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 58, 86));
        jLabel8.setText("CONSULTA");

        jLabel1.setBackground(new java.awt.Color(82, 101, 143));
        jLabel1.setFont(new java.awt.Font("Kailasa", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 101, 143));
        jLabel1.setText("Nombre del alumno");

        ingresoNom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ingresoNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout raizConsultaLayout = new javax.swing.GroupLayout(raizConsulta);
        raizConsulta.setLayout(raizConsultaLayout);
        raizConsultaLayout.setHorizontalGroup(
            raizConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, raizConsultaLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(ingresoNom, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(raizConsultaLayout.createSequentialGroup()
                .addGroup(raizConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(raizConsultaLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(raizConsultaLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        raizConsultaLayout.setVerticalGroup(
            raizConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(raizConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        add(raizConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoNomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ingresoNomActionPerformed
    {//GEN-HEADEREND:event_ingresoNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNomActionPerformed

    private void contenidoBusquedasMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_contenidoBusquedasMouseClicked
    {//GEN-HEADEREND:event_contenidoBusquedasMouseClicked
        
    }//GEN-LAST:event_contenidoBusquedasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenidoBusquedas;
    private javax.swing.JTextField ingresoNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel raizConsulta;
    // End of variables declaration//GEN-END:variables
}
