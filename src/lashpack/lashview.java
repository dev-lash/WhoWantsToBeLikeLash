/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lashpack;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Sir Lash
 */
public class lashview extends javax.swing.JFrame {
    
    private int a, b, c, d, e, h, i;
    private int j = 0;
    private int f = 0;
    private int g = 0;
    

    /**
     * Creates new form lashview
     */
    public lashview() {
        initComponents();
    }
    
    
    public void resetftn()
    {
        BtnA.setText("");
        BtnB.setText("");
        BtnC.setText("");
        BtnD.setText("");
        questionTxt.setText("");
    }
    
    public void generateQuestion() 
    {
        if(j < 13)
        {
            Random ran = new Random();
        
            
            a = getH() + ran.nextInt(getI());
            b = getH() + ran.nextInt(getI());

            c = a*b;

            questionTxt.setText(String.valueOf(a + " x " + b));

            jLabel1.setBackground(Color.BLACK);
            jLabel1.setForeground(Color.WHITE);

            j++; //counting questions

            d = 1 + ran.nextInt(4);
            if(d == 1)
            {
                BtnA.setText(String.valueOf(c));
                BtnB.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnC.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnD.setText(String.valueOf(ran.nextInt((getI() * getI()))));
            }
            else if(d == 2)
            {
                BtnA.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnB.setText(String.valueOf(c));
                BtnC.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnD.setText(String.valueOf(ran.nextInt((getI() * getI()))));
            }
            else if(d == 3)
            {
                BtnA.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnB.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnC.setText(String.valueOf(c));
                BtnD.setText(String.valueOf(ran.nextInt((getI() * getI()))));
            }
            else if(d == 4)
            {
                BtnA.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnB.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnC.setText(String.valueOf(ran.nextInt((getI() * getI()))));
                BtnD.setText(String.valueOf(c));
            }
        }
        else
        {
            double p = (g / 13) * 100;
            JOptionPane.showMessageDialog(null, "Thanks for taking the quiz, you got " + p + "% correctly", "Result", WIDTH);
            resetftn();
        }
    }
    
    public void validateAnswerA()
    {
        e = Integer.parseInt(BtnA.getText());
        
        if(e != c)
        {
            JOptionPane.showMessageDialog(null, "Wrong", "Wrong Answer", JOptionPane.ERROR_MESSAGE);
            f++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Correct", "Right Answer", JOptionPane.INFORMATION_MESSAGE);
            g++;
        }
        
    }
    
    public void validateAnswerB()
    {
        e = Integer.parseInt(BtnB.getText());
        
        if(e != c)
        {
            JOptionPane.showMessageDialog(null, "Wrong", "Wrong Answer", JOptionPane.ERROR_MESSAGE);
            f++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Correct", "Right Answer", JOptionPane.INFORMATION_MESSAGE);
            g++;
        }
        
    }
    
    public void validateAnswerC()
    {
        e = Integer.parseInt(BtnC.getText());
        
        if(e != c)
        {
            JOptionPane.showMessageDialog(null, "Wrong", "Wrong Answer", JOptionPane.ERROR_MESSAGE);
            f++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Correct", "Right Answer", JOptionPane.INFORMATION_MESSAGE);
            g++;
        }
        
    }
    
    public void validateAnswerD()
    {
        e = Integer.parseInt(BtnD.getText());
        
        if(e != c)
        {
            JOptionPane.showMessageDialog(null, "Wrong", "Wrong Answer", JOptionPane.ERROR_MESSAGE);
            f++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Correct", "Right Answer", JOptionPane.INFORMATION_MESSAGE);
            g++;
        }
        
    }
    
    public void prizeMoney()
    {
        if(g == 0)
        {
            jLabel1.setBackground(Color.BLACK);
            jLabel1.setForeground(Color.WHITE);
        }
        else if(g == 1)
        {
            jLabel2.setBackground(Color.BLACK);
            jLabel2.setForeground(Color.WHITE);
        }
        else if(g == 2)
        {
            jLabel3.setBackground(Color.BLACK);
            jLabel3.setForeground(Color.WHITE);
        }
        else if(g == 3)
        {
            jLabel4.setBackground(Color.BLACK);
            jLabel4.setForeground(Color.WHITE);
        }
        else if(g == 4)
        {
            jLabel5.setBackground(Color.BLACK);
            jLabel5.setForeground(Color.WHITE);
        }
        else if(g == 5)
        {
            jLabel9.setBackground(Color.BLACK);
            jLabel9.setForeground(Color.WHITE);
        }
        else if(g == 6)
        {
            jLabel8.setBackground(Color.BLACK);
            jLabel8.setForeground(Color.WHITE);
        }
        else if(g == 7)
        {
            jLabel7.setBackground(Color.BLACK);
            jLabel7.setForeground(Color.WHITE);
        }
        else if(g == 8)
        {
            jLabel11.setBackground(Color.BLACK);
            jLabel11.setForeground(Color.WHITE);
        }
        else if(g == 9)
        {
            jLabel10.setBackground(Color.BLACK);
            jLabel10.setForeground(Color.WHITE);
        }
        else if(g == 10)
        {
            jLabel6.setBackground(Color.BLACK);
            jLabel6.setForeground(Color.WHITE);
        }
        else if(g == 11)
        {
            jLabel12.setBackground(Color.BLACK);
            jLabel12.setForeground(Color.WHITE);
        }
        else if(g == 12)
        {
            jLabel13.setBackground(Color.BLACK);
            jLabel13.setForeground(Color.WHITE);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnA = new javax.swing.JButton();
        BtnStart = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnB = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnD = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        questionTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Play");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("N1,000");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("N2,000");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("N3,000");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N5,000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("N10,000");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("N150,000");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("N40,000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("N25,000");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("N15,000");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("N100,000");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("N70,000");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("N250,000");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("N500,000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        BtnA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAActionPerformed(evt);
            }
        });

        BtnStart.setText("START");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        BtnReset.setText("RESET");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        BtnB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBActionPerformed(evt);
            }
        });

        BtnC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });

        BtnD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnStart)
                .addGap(53, 53, 53)
                .addComponent(BtnReset)
                .addGap(132, 132, 132))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BtnA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnD, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        questionTxt.setEditable(false);
        questionTxt.setBackground(new java.awt.Color(255, 255, 204));
        questionTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        questionTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(questionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(questionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        // TODO add your handling code here:
        j = 0;
        f = 0;
        g = 0;
        generateQuestion();
        
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAActionPerformed
        // TODO add your handling code here:
        
        validateAnswerA();
        prizeMoney();
        generateQuestion();
        
        
    }//GEN-LAST:event_BtnAActionPerformed

    private void BtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBActionPerformed
         // TODO add your handling code here:
        
        validateAnswerB();
        prizeMoney();
        generateQuestion();
    }//GEN-LAST:event_BtnBActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        // TODO add your handling code here:
        
        validateAnswerC();
        prizeMoney();
        generateQuestion();
    }//GEN-LAST:event_BtnCActionPerformed

    private void BtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDActionPerformed
        // TODO add your handling code here:
        
        validateAnswerD();
        prizeMoney();
        generateQuestion();
    }//GEN-LAST:event_BtnDActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        
        f = 0;
        g = 0;
        resetftn();
    }//GEN-LAST:event_BtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(lashview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lashview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lashview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lashview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lashview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnA;
    private javax.swing.JButton BtnB;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnD;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField questionTxt;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

}
