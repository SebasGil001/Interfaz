/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author gerar
 */
public class VtnAdmin extends javax.swing.JFrame
{

    Color colorActivado = new Color(82,101,143);
    Color colorDesactivado = new Color(51,58,86);
    Color colorHover = colorDesactivado.darker();
    Color colorLetraActivado = new Color(255, 255, 255);
    Color colorLetraDesactivado = new Color(255, 255, 255);
    boolean seleccionadoGrupos = true;
    boolean seleccionadoAlumnos = false;
    boolean seleccionadoVista = false;
    boolean seleccionadoPrecio = false;
    Timer timer;
    int num = 0;

    /**
     * Creates new form VtnGruposAlumnos
     */
    public VtnAdmin()
    {
        initComponents();
    }

    public void showP(JPanel p, int width, int height)
    {
        p.setSize(width, height);
        p.setLocation(0, 0);
        panelCarga.removeAll();
        panelCarga.add(p, BorderLayout.CENTER);
        panelCarga.revalidate();
        panelCarga.repaint();
    }

    public void showP(JPanel p)
    {
        p.setSize(890, 470);
        p.setLocation(0, 0);
        contentP.removeAll();
        contentP.add(p, BorderLayout.CENTER);
        contentP.revalidate();
        contentP.repaint();
    }

    public void cambiarFondoHover(JPanel p, JLabel l, boolean mismo)
    {
        if (seleccionadoGrupos)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorHover);
                l.setBackground(colorHover);
            }
        }
        if (seleccionadoAlumnos)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorHover);
                l.setBackground(colorHover);
            }
        }
        if (seleccionadoPrecio)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorHover);
                l.setBackground(colorHover);
            }
        }
        if (seleccionadoVista)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorHover);
                l.setBackground(colorHover);
            }
        }
    }

    public void cambiarFondoHoverSalida(JPanel p, JLabel l, boolean mismo)
    {
        if (seleccionadoGrupos)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorDesactivado);
                l.setBackground(colorDesactivado);
            }
        }
        if (seleccionadoAlumnos)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorDesactivado);
                l.setBackground(colorDesactivado);
            }
        }
        if (seleccionadoPrecio)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorDesactivado);
                l.setBackground(colorDesactivado);
            }
        }
        if (seleccionadoVista)
        {
            if (mismo)
            {
                p.setBackground(colorActivado);
                l.setBackground(colorActivado);
            } else
            {
                p.setBackground(colorDesactivado);
                l.setBackground(colorDesactivado);
            }
        }
    }

    public void cambiarFondoSeleccionado(JPanel p, JLabel l, JPanel[] pS, JLabel[] lS)
    {
        if (seleccionadoAlumnos)
        {
            p.setBackground(colorActivado);
            l.setBackground(colorActivado);
            l.setForeground(colorLetraActivado);
            for (JPanel pS1 : pS)
            {
                pS1.setBackground(colorDesactivado);
            }
            for (JLabel lS1 : lS)
            {
                lS1.setBackground(colorDesactivado);
                lS1.setForeground(colorLetraDesactivado);
            }

        }
        if (seleccionadoGrupos)
        {
            p.setBackground(colorActivado);
            l.setBackground(colorActivado);
            l.setForeground(colorLetraActivado);
            for (JPanel pS1 : pS)
            {
                pS1.setBackground(colorDesactivado);
            }
            for (JLabel lS1 : lS)
            {
                lS1.setBackground(colorDesactivado);
                lS1.setForeground(colorLetraDesactivado);
            }
        }
        if (seleccionadoPrecio)
        {
            p.setBackground(colorActivado);
            l.setBackground(colorActivado);
            l.setForeground(colorLetraActivado);
            for (JPanel pS1 : pS)
            {
                pS1.setBackground(colorDesactivado);
            }
            for (JLabel lS1 : lS)
            {
                lS1.setBackground(colorDesactivado);
                lS1.setForeground(colorLetraDesactivado);
            }
        }
        if (seleccionadoVista)
        {
            p.setBackground(colorActivado);
            l.setBackground(colorActivado);
            l.setForeground(colorLetraActivado);
            for (JPanel pS1 : pS)
            {
                pS1.setBackground(colorDesactivado);
            }
            for (JLabel lS1 : lS)
            {
                lS1.setBackground(colorDesactivado);
                lS1.setForeground(colorLetraDesactivado);
            }
        }

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
        contentSelect = new javax.swing.JPanel();
        lblConsultarInternos = new javax.swing.JLabel();
        lblConsultarExternos = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlVista = new javax.swing.JPanel();
        lblVista = new javax.swing.JLabel();
        pnlAlumnos = new javax.swing.JPanel();
        lblAlumnos = new javax.swing.JLabel();
        pnlGrupos = new javax.swing.JPanel();
        lbGrupos = new javax.swing.JLabel();
        pnlPrecio = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        contentP = new javax.swing.JPanel();
        panelCarga = new javax.swing.JPanel();
        barraProgresoCarga = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        panelRaiz.setBackground(new java.awt.Color(255, 255, 255));
        panelRaiz.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                panelRaizMouseClicked(evt);
            }
        });
        panelRaiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentSelect.setBackground(new java.awt.Color(255, 255, 255));
        contentSelect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConsultarInternos.setBackground(new java.awt.Color(51, 58, 86));
        lblConsultarInternos.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarInternos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultarInternos.setText("Consultar Internos");
        lblConsultarInternos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultarInternos.setOpaque(true);
        lblConsultarInternos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblConsultarInternosMouseClicked(evt);
            }
        });
        contentSelect.add(lblConsultarInternos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 234, 40));

        lblConsultarExternos.setBackground(new java.awt.Color(51, 58, 86));
        lblConsultarExternos.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarExternos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultarExternos.setText("Consulta Externos");
        lblConsultarExternos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultarExternos.setOpaque(true);
        lblConsultarExternos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblConsultarExternosMouseClicked(evt);
            }
        });
        contentSelect.add(lblConsultarExternos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 234, 40));

        panelRaiz.add(contentSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 40, 234, 80));
        contentSelect.setVisible(false);

        pnlMenu.setBackground(new java.awt.Color(51, 58, 86));
        pnlMenu.setOpaque(false);
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVista.setBackground(new java.awt.Color(51, 58, 86));
        pnlVista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlVista.setMinimumSize(new java.awt.Dimension(161, 40));
        pnlVista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlVistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnlVistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnlVistaMouseExited(evt);
            }
        });
        pnlVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVista.setBackground(new java.awt.Color(51, 58, 86));
        lblVista.setForeground(new java.awt.Color(255, 255, 255));
        lblVista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVista.setText("Mas...");
        lblVista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblVistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblVistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblVistaMouseExited(evt);
            }
        });
        pnlVista.add(lblVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 40));

        pnlMenu.add(pnlVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 0, 234, 40));

        pnlAlumnos.setBackground(new java.awt.Color(51, 58, 86));
        pnlAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAlumnos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlAlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnlAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnlAlumnosMouseExited(evt);
            }
        });
        pnlAlumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAlumnos.setBackground(new java.awt.Color(51, 58, 86));
        lblAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlumnos.setText("Alumnos");
        lblAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlumnos.setPreferredSize(new java.awt.Dimension(34, 16));
        lblAlumnos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblAlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAlumnosMouseExited(evt);
            }
        });
        pnlAlumnos.add(lblAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        pnlMenu.add(pnlAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 0, 232, 40));

        pnlGrupos.setBackground(new java.awt.Color(82, 101, 143));
        pnlGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlGrupos.setEnabled(false);
        pnlGrupos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnlGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnlGruposMouseExited(evt);
            }
        });
        pnlGrupos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbGrupos.setBackground(new java.awt.Color(0, 153, 255));
        lbGrupos.setForeground(new java.awt.Color(255, 255, 255));
        lbGrupos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGrupos.setText("Grupos");
        lbGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGrupos.setPreferredSize(new java.awt.Dimension(34, 16));
        lbGrupos.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbGruposMouseExited(evt);
            }
        });
        pnlGrupos.add(lbGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        pnlMenu.add(pnlGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 232, 40));

        pnlPrecio.setBackground(new java.awt.Color(51, 58, 86));
        pnlPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPrecio.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlPrecioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                pnlPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                pnlPrecioMouseExited(evt);
            }
        });
        pnlPrecio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrecio.setBackground(new java.awt.Color(51, 58, 86));
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("Precio");
        lblPrecio.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblPrecioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblPrecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblPrecioMouseExited(evt);
            }
        });
        pnlPrecio.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        pnlMenu.add(pnlPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 0, 232, 40));

        panelRaiz.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));
        pnlMenu.setVisible(false);

        contentP.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPLayout = new javax.swing.GroupLayout(contentP);
        contentP.setLayout(contentPLayout);
        contentPLayout.setHorizontalGroup(
            contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        contentPLayout.setVerticalGroup(
            contentPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        panelRaiz.add(contentP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 890, 470));
        contentP.setVisible(false);

        panelCarga.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelCargaLayout = new javax.swing.GroupLayout(panelCarga);
        panelCarga.setLayout(panelCargaLayout);
        panelCargaLayout.setHorizontalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        panelCargaLayout.setVerticalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        panelRaiz.add(panelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 520));

        barraProgresoCarga.setBackground(new java.awt.Color(255, 255, 255));
        barraProgresoCarga.setForeground(new java.awt.Color(0, 153, 255));
        barraProgresoCarga.setMaximum(40);
        barraProgresoCarga.setToolTipText("");
        barraProgresoCarga.setBorder(null);
        panelRaiz.add(barraProgresoCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 930, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

        PanelCarga1 carga = new PanelCarga1();
        showP(carga, 930, 556);
        timer = new Timer(40, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                num += 1;
                if (num > 40)
                {
                    timer.stop();
                    pnlMenu.setVisible(true);
                    contentP.setVisible(true);
                    PnlGrupos vtg = new PnlGrupos();
                    showP(vtg);
                    panelCarga.setVisible(false);
                    barraProgresoCarga.setVisible(false);
                } else
                {
                    barraProgresoCarga.setValue(num);
                    barraProgresoCarga.setString(num + "%");
                    System.out.println(num);
                }
            }
        });

        timer.start();


    }//GEN-LAST:event_formWindowOpened

    private void lbGruposMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbGruposMouseExited
    {//GEN-HEADEREND:event_lbGruposMouseExited

        cambiarFondoHoverSalida(pnlGrupos, lbGrupos, seleccionadoGrupos);
    }//GEN-LAST:event_lbGruposMouseExited

    private void lblVistaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblVistaMouseClicked
    {//GEN-HEADEREND:event_lblVistaMouseClicked
        contentSelect.setVisible(true);
        seleccionadoAlumnos = false;
        seleccionadoGrupos = false;
        seleccionadoVista = true;
        seleccionadoPrecio = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlGrupos;
        j[1] = pnlPrecio;
        j[2] = pnlAlumnos;
        JLabel l[] = new JLabel[3];
        l[0] = lbGrupos;
        l[1] = lblPrecio;
        l[2] = lblAlumnos;
        cambiarFondoSeleccionado(pnlVista, lblVista, j, l);
    }//GEN-LAST:event_lblVistaMouseClicked

    private void panelRaizMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_panelRaizMouseClicked
    {//GEN-HEADEREND:event_panelRaizMouseClicked

    }//GEN-LAST:event_panelRaizMouseClicked

    private void lblVistaMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblVistaMouseEntered
    {//GEN-HEADEREND:event_lblVistaMouseEntered
        cambiarFondoHover(pnlVista, lblVista, seleccionadoVista);
    }//GEN-LAST:event_lblVistaMouseEntered

    private void lblVistaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblVistaMouseExited
    {//GEN-HEADEREND:event_lblVistaMouseExited
        cambiarFondoHoverSalida(pnlVista, lblVista, seleccionadoVista);
    }//GEN-LAST:event_lblVistaMouseExited

    private void lblAlumnosMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlumnosMouseEntered
    {//GEN-HEADEREND:event_lblAlumnosMouseEntered
        cambiarFondoHover(pnlAlumnos, lblAlumnos, seleccionadoAlumnos);
    }//GEN-LAST:event_lblAlumnosMouseEntered

    private void lblAlumnosMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblAlumnosMouseExited
    {//GEN-HEADEREND:event_lblAlumnosMouseExited
        cambiarFondoHoverSalida(pnlAlumnos, lblAlumnos, seleccionadoAlumnos);
    }//GEN-LAST:event_lblAlumnosMouseExited

    private void pnlGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGruposMouseClicked
        seleccionadoGrupos = true;
        seleccionadoAlumnos = false;
        seleccionadoVista = false;
        seleccionadoPrecio = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlAlumnos;
        j[1] = pnlPrecio;
        j[2] = pnlVista;
        JLabel l[] = new JLabel[3];
        l[0] = lblAlumnos;
        l[1] = lblPrecio;
        l[2] = lblVista;

        cambiarFondoSeleccionado(pnlGrupos, lbGrupos, j, l);
        contentSelect.setVisible(false);
        PnlGrupos vtg = new PnlGrupos();
        showP(vtg);
    }//GEN-LAST:event_pnlGruposMouseClicked

    private void pnlGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGruposMouseEntered
        cambiarFondoHover(pnlGrupos, lbGrupos, seleccionadoGrupos);
    }//GEN-LAST:event_pnlGruposMouseEntered

    private void lbGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGruposMouseEntered
        cambiarFondoHover(pnlGrupos, lbGrupos, seleccionadoGrupos);
    }//GEN-LAST:event_lbGruposMouseEntered

    private void lbGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGruposMouseClicked
        seleccionadoGrupos = true;
        seleccionadoAlumnos = false;
        seleccionadoVista = false;
        seleccionadoPrecio = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlAlumnos;
        j[1] = pnlPrecio;
        j[2] = pnlVista;
        JLabel l[] = new JLabel[3];
        l[0] = lblAlumnos;
        l[1] = lblPrecio;
        l[2] = lblVista;

        contentSelect.setVisible(false);
        cambiarFondoSeleccionado(pnlGrupos, lbGrupos, j, l);
        PnlGrupos vtg = new PnlGrupos();
        showP(vtg);
    }//GEN-LAST:event_lbGruposMouseClicked

    private void pnlGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGruposMouseExited
        cambiarFondoHoverSalida(pnlGrupos, lbGrupos, seleccionadoGrupos);
    }//GEN-LAST:event_pnlGruposMouseExited

    private void pnlVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVistaMouseClicked
        contentSelect.setVisible(true);
        seleccionadoAlumnos = false;
        seleccionadoGrupos = false;
        seleccionadoVista = true;
        seleccionadoPrecio = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlGrupos;
        j[1] = pnlPrecio;
        j[2] = pnlAlumnos;
        JLabel l[] = new JLabel[3];
        l[0] = lbGrupos;
        l[1] = lblPrecio;
        l[2] = lblAlumnos;
        cambiarFondoSeleccionado(pnlVista, lblVista, j, l);
    }//GEN-LAST:event_pnlVistaMouseClicked

    private void pnlVistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVistaMouseEntered
        cambiarFondoHover(pnlVista, lblVista, seleccionadoVista);
    }//GEN-LAST:event_pnlVistaMouseEntered

    private void pnlVistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVistaMouseExited
        cambiarFondoHoverSalida(pnlVista, lblVista, seleccionadoVista);
    }//GEN-LAST:event_pnlVistaMouseExited

    private void pnlAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseEntered
        cambiarFondoHover(pnlAlumnos, lblAlumnos, seleccionadoAlumnos);
    }//GEN-LAST:event_pnlAlumnosMouseEntered

    private void pnlAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseClicked
        seleccionadoAlumnos = true;
        seleccionadoGrupos = false;
        seleccionadoVista = false;
        seleccionadoPrecio = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlGrupos;
        j[1] = pnlPrecio;
        j[2] = pnlVista;
        JLabel l[] = new JLabel[3];
        l[0] = lbGrupos;
        l[1] = lblPrecio;
        l[2] = lblVista;
        contentSelect.setVisible(false);
        cambiarFondoSeleccionado(pnlAlumnos, lblAlumnos, j, l);
        PnlAlumnos vda = new PnlAlumnos();
        showP(vda);
    }//GEN-LAST:event_pnlAlumnosMouseClicked

    private void lblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnosMouseClicked
        seleccionadoAlumnos = true;
        seleccionadoGrupos = false;
        seleccionadoVista = false;
        seleccionadoPrecio = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlGrupos;
        j[1] = pnlPrecio;
        j[2] = pnlVista;
        JLabel l[] = new JLabel[3];
        l[0] = lbGrupos;
        l[1] = lblPrecio;
        l[2] = lblVista;
        contentSelect.setVisible(false);
        cambiarFondoSeleccionado(pnlAlumnos, lblAlumnos, j, l);
        PnlAlumnos vda = new PnlAlumnos();
        showP(vda);
    }//GEN-LAST:event_lblAlumnosMouseClicked

    private void pnlAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlumnosMouseExited
        cambiarFondoHoverSalida(pnlAlumnos, lblAlumnos, seleccionadoAlumnos);
    }//GEN-LAST:event_pnlAlumnosMouseExited

    private void pnlPrecioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlPrecioMouseClicked
    {//GEN-HEADEREND:event_pnlPrecioMouseClicked
        seleccionadoPrecio = true;
        seleccionadoAlumnos = false;
        seleccionadoGrupos = false;
        seleccionadoVista = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlGrupos;
        j[1] = pnlAlumnos;
        j[2] = pnlVista;
        JLabel l[] = new JLabel[3];
        l[0] = lbGrupos;
        l[1] = lblAlumnos;
        l[2] = lblVista;
        contentSelect.setVisible(false);
        cambiarFondoSeleccionado(pnlPrecio, lblPrecio, j, l);
        PnlPrecio vda = new PnlPrecio();
        showP(vda);
    }//GEN-LAST:event_pnlPrecioMouseClicked

    private void pnlPrecioMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlPrecioMouseEntered
    {//GEN-HEADEREND:event_pnlPrecioMouseEntered
        cambiarFondoHover(pnlPrecio, lblPrecio, seleccionadoPrecio);
    }//GEN-LAST:event_pnlPrecioMouseEntered

    private void lblPrecioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPrecioMouseClicked
    {//GEN-HEADEREND:event_lblPrecioMouseClicked
        seleccionadoPrecio = true;
        seleccionadoAlumnos = false;
        seleccionadoGrupos = false;
        seleccionadoVista = false;
        JPanel j[] = new JPanel[3];
        j[0] = pnlGrupos;
        j[1] = pnlAlumnos;
        j[2] = pnlVista;
        JLabel l[] = new JLabel[3];
        l[0] = lbGrupos;
        l[1] = lblAlumnos;
        l[2] = lblVista;
        contentSelect.setVisible(false);
        cambiarFondoSeleccionado(pnlPrecio, lblPrecio, j, l);
        PnlPrecio vda = new PnlPrecio();
        showP(vda);
    }//GEN-LAST:event_lblPrecioMouseClicked

    private void lblPrecioMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPrecioMouseEntered
    {//GEN-HEADEREND:event_lblPrecioMouseEntered
        cambiarFondoHover(pnlPrecio, lblPrecio, seleccionadoPrecio);
    }//GEN-LAST:event_lblPrecioMouseEntered

    private void pnlPrecioMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlPrecioMouseExited
    {//GEN-HEADEREND:event_pnlPrecioMouseExited
        cambiarFondoHoverSalida(pnlPrecio, lblPrecio, seleccionadoPrecio);
    }//GEN-LAST:event_pnlPrecioMouseExited

    private void lblPrecioMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblPrecioMouseExited
    {//GEN-HEADEREND:event_lblPrecioMouseExited
        cambiarFondoHoverSalida(pnlPrecio, lblPrecio, seleccionadoPrecio);
    }//GEN-LAST:event_lblPrecioMouseExited

    private void lblConsultarInternosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblConsultarInternosMouseClicked
    {//GEN-HEADEREND:event_lblConsultarInternosMouseClicked
        contentSelect.setVisible(false);
        PnlAlumnosInternos vda = new PnlAlumnosInternos();
        showP(vda);
    }//GEN-LAST:event_lblConsultarInternosMouseClicked

    private void lblConsultarExternosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblConsultarExternosMouseClicked
    {//GEN-HEADEREND:event_lblConsultarExternosMouseClicked
        contentSelect.setVisible(false);
        PnlAlumnosExternos vda = new PnlAlumnosExternos();
        showP(vda);
    }//GEN-LAST:event_lblConsultarExternosMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgresoCarga;
    private javax.swing.JPanel contentP;
    private javax.swing.JPanel contentSelect;
    private javax.swing.JLabel lbGrupos;
    private javax.swing.JLabel lblAlumnos;
    private javax.swing.JLabel lblConsultarExternos;
    private javax.swing.JLabel lblConsultarInternos;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblVista;
    private javax.swing.JPanel panelCarga;
    private javax.swing.JPanel panelRaiz;
    private javax.swing.JPanel pnlAlumnos;
    private javax.swing.JPanel pnlGrupos;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrecio;
    private javax.swing.JPanel pnlVista;
    // End of variables declaration//GEN-END:variables
}
