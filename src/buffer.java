
import java.awt.Dimension;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KRISHNA29
 */
public class buffer extends javax.swing.JFrame {

    /**
     * Creates new form buffer
     */
    public buffer() {
        initComponents();
    }
private int xStart;
private int yStart;
private int xEnd;
private int yEnd;
private int height;
private int width;
private double dside;
private double rad;
private Line2D lineBuffer;
private Rectangle2D srectangleBuffer;
private Rectangle2D rectangleBuffer;
private Ellipse2D ovalBuffer;
private Graphics2D g2;

private List<Line2D>lineContainer =new ArrayList();
private List<Rectangle2D>srectangleContainer =new ArrayList();
private List<Rectangle2D>rectangleContainer =new ArrayList();
private List<Rectangle2D>squareContainer =new ArrayList();
private List<Ellipse2D>circleContainer =new ArrayList();
private List<Ellipse2D>ovalContainer =new ArrayList();
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        line = new javax.swing.JRadioButton();
        circle = new javax.swing.JRadioButton();
        selection = new javax.swing.JRadioButton();
        square = new javax.swing.JRadioButton();
        oval = new javax.swing.JRadioButton();
        rectangle = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        buttonGroup1.add(line);
        line.setText("LINE");
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });

        buttonGroup1.add(circle);
        circle.setText("CIRCLE");

        buttonGroup1.add(selection);
        selection.setText("SELECTION TOOL");

        buttonGroup1.add(square);
        square.setText("SQUARE");

        buttonGroup1.add(oval);
        oval.setText("OVAL");
        oval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rectangle);
        rectangle.setText("RECTANGLE");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line)
                    .addComponent(oval))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(circle)
                    .addComponent(square))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rectangle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(line)
                    .addComponent(circle)
                    .addComponent(selection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(square)
                    .addComponent(rectangle)
                    .addComponent(oval))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    if(g2==null)
    {
    g2=(Graphics2D)jPanel1.getGraphics();
    }
    xStart=evt.getX();
    yStart=evt.getY();
    xEnd=evt.getX();
    yEnd=evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
    
        if(line.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          lineBuffer= new Line2D.Float((float)xStart, (float)yStart, (float)xEnd,(float)yEnd);
          DrawAll();
          g2.draw(lineBuffer);
        }
        
        if(selection.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          height=yEnd-yStart;
          width=xEnd-xStart;
          srectangleBuffer= new Rectangle2D.Float((float)xStart, (float)yStart, (float)width,(float)height);
          DrawAll();
          g2.draw(srectangleBuffer);
        }
        
        if(square.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          height=yEnd-yStart;
          width=xEnd-xStart;
          int max_dimension=height;
          if(width>height)
          {
          max_dimension=width;
          }
          srectangleBuffer= new Rectangle2D.Float((float)xStart, (float)yStart, (float)max_dimension,(float)max_dimension);
          DrawAll();
          g2.draw(srectangleBuffer);
        }
        
        if(rectangle.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          height=yEnd-yStart;
          width=xEnd-xStart;
          rectangleBuffer= new Rectangle2D.Float((float)xStart, (float)yStart, (float)width,(float)height);
          DrawAll();
          g2.draw(rectangleBuffer);
        }
        
        if(oval.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX()- xStart;
          yEnd=evt.getY()- yStart;
          ovalBuffer= new Ellipse2D.Float((float)xStart, (float)yStart, (float)xEnd, (float)yEnd);
          DrawAll();
          g2.draw(ovalBuffer);
        }
        
        if(circle.isSelected())
        {
           jPanel1.update(g2);
          xEnd=evt.getX()- xStart;
          yEnd=evt.getY()- yStart;
          int max_diameter=xEnd;
          if(yEnd>xEnd)
          {
              max_diameter=yEnd;
          }
          ovalBuffer= new Ellipse2D.Float((float)xStart, (float)yStart, (float)max_diameter, (float)max_diameter);
          DrawAll();
          g2.draw(ovalBuffer);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        
        
        if(line.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          lineBuffer= new Line2D.Float((float)xStart, (float)yStart, (float)xEnd,(float)yEnd);
          lineContainer.add(lineBuffer);
          DrawAll();
        }
        
        if(selection.isSelected())
        { jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          height=yEnd-yStart;
          width=xEnd-xStart;
          srectangleBuffer= new Rectangle2D.Float((float)xStart, (float)yStart, (float)width,(float)height);
          srectangleContainer.add(srectangleBuffer);
          DrawAll();
        }
         
        if(square.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          height=yEnd-yStart;
          width=xEnd-xStart;
          int max_dimension=height;
          if(width>height)
          {
              max_dimension=width;
          }
          rectangleBuffer= new Rectangle2D.Float((float)xStart, (float)yStart, (float)max_dimension,(float)max_dimension);
          rectangleContainer.add(rectangleBuffer);
          DrawAll();
        }
        
        if(rectangle.isSelected())
        { jPanel1.update(g2);
          xEnd=evt.getX();
          yEnd=evt.getY();
          height=yEnd-yStart;
          width=xEnd-xStart;
          rectangleBuffer= new Rectangle2D.Float((float)xStart, (float)yStart, (float)width,(float)height);
          rectangleContainer.add(rectangleBuffer);
          DrawAll();
        }
        
        if(oval.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX()- xStart;
          yEnd=evt.getY()- yStart;
          ovalBuffer= new Ellipse2D.Float((float)xStart, (float)yStart, (float)xEnd, (float)yEnd);
          ovalContainer.add(ovalBuffer);
          DrawAll();
        }
             
        if(circle.isSelected())
        {
          jPanel1.update(g2);
          xEnd=evt.getX()- xStart;
          yEnd=evt.getY()- yStart;
          int max_diameter=xEnd;
          if(yEnd>xEnd)
          {
              max_diameter=yEnd;
          }
          ovalBuffer= new Ellipse2D.Float((float)xStart, (float)yStart, (float)max_diameter, (float)max_diameter);
          ovalContainer.add(ovalBuffer);
          DrawAll();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseReleased

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        jPanel1.update(g2);
        circleContainer.clear();
        lineContainer.clear();
        ovalContainer.clear();
        squareContainer.clear();
        rectangleContainer.clear();
        srectangleContainer.clear();
// TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lineActionPerformed

    private void ovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ovalActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rectangleActionPerformed

    private void DrawAll()
    { 
        for(int i=0;i<lineContainer.size();i++)
        { 
            g2.draw(lineContainer.get(i));
        }
        for(int i=0;i<srectangleContainer.size();i++)
        { 
            g2.draw(srectangleContainer.get(i));
        }
        
        for(int i=0;i<rectangleContainer.size();i++)
        { 
            g2.draw(rectangleContainer.get(i));
        }
        
        for(int i=0;i<ovalContainer.size();i++)
        { 
            g2.draw(ovalContainer.get(i));
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
            java.util.logging.Logger.getLogger(buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buffer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton circle;
    private javax.swing.JButton clear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton line;
    private javax.swing.JRadioButton oval;
    private javax.swing.JRadioButton rectangle;
    private javax.swing.JRadioButton selection;
    private javax.swing.JRadioButton square;
    // End of variables declaration//GEN-END:variables
}