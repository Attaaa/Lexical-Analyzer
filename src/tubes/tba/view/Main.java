/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tba.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import tubes.tba.*;

/**
 *
 * @author Atta
 */
public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        valid.setVisible(false);
        Nvalid.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jString = new javax.swing.JTextField();
        jOutput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tOutput = new javax.swing.JLabel();
        tOutput1 = new javax.swing.JLabel();
        valid = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Nvalid = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jString.setBackground(new java.awt.Color(255, 255, 255));
        jString.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jString.setForeground(new java.awt.Color(102, 102, 102));
        jString.setText(" Masukkan String Lexic");
        jString.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jString.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStringMouseClicked(evt);
            }
        });
        jString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStringActionPerformed(evt);
            }
        });

        jOutput.setBackground(new java.awt.Color(204, 204, 204));
        jOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jOutput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOutputMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hasil");

        javax.swing.GroupLayout jOutputLayout = new javax.swing.GroupLayout(jOutput);
        jOutput.setLayout(jOutputLayout);
        jOutputLayout.setHorizontalGroup(
            jOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jOutputLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jOutputLayout.setVerticalGroup(
            jOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jOutputLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jRadioButton1.setText("jRadioButton1");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Help");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(5, 5, 5))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("About");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tOutput.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tOutput.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(tOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 13, -1, -1));

        tOutput1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tOutput1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(tOutput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, -1, -1));

        valid.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-checkmark-24.png"))); // NOI18N
        jLabel3.setText("VALID");

        javax.swing.GroupLayout validLayout = new javax.swing.GroupLayout(valid);
        valid.setLayout(validLayout);
        validLayout.setHorizontalGroup(
            validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, validLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );
        validLayout.setVerticalGroup(
            validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, 40));

        Nvalid.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-multiply-24.png"))); // NOI18N
        jLabel5.setText("TIDAK VALID");

        javax.swing.GroupLayout NvalidLayout = new javax.swing.GroupLayout(Nvalid);
        Nvalid.setLayout(NvalidLayout);
        NvalidLayout.setHorizontalGroup(
            NvalidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NvalidLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(10, 10, 10))
        );
        NvalidLayout.setVerticalGroup(
            NvalidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(Nvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jString, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jString, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStringActionPerformed

    private void jOutputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOutputMouseClicked
        String S = jString.getText();
        Check C = new Check();
        String[] SS = new String[99];
        String[] SSS;
        int i = 0, j = 0, k = 0, l = 0, m = 0;
        
        //Memisahkan tiap string lexical analyzer tiap spasi atau kurung
        
        try {
            while (i < S.length()){
                while (i < S.length() && (C.CheckSpace(S.charAt(i)) || C.CheckKrg(S.charAt(i)))){
                    if (C.CheckKrg(S.charAt(i))){
                        SS[j] = Character.toString(S.charAt(i));
                        j++;
                    }
                    i++;
                }
                while (i < S.length() && !C.CheckSpace(S.charAt(i)) && !C.CheckKrg(S.charAt(i))){
                    if (SS[j] == null){
                        SS[j] = Character.toString(S.charAt(i));
                    } else {
                        SS[j] = SS[j] + S.charAt(i);
                    }
                    i++;
                }
                j++;
            }

            //end

            for (m = 0; m < j ; m++) {
                if (SS[m] == null){
                    j = j - 1;
                }   
            }

            SSS = new String[j];

            //Check type of String Lexical

            for (m = 0; m < j; m++) {
                if (C.CheckNum(SS[m])) {
                    SSS[m] = "Number";
                } else if (C.CheckOpr(SS[m])) {
                    SSS[m] = "Operator";
                } else if (C.CheckKrg(SS[m].charAt(0))) {
                    SSS[m] = "Kur"+C.getT();  
                } else {
                    SSS[m] = "Error";
                    break;
                }
            }

            //End Check

            //Output Layout

            int x = SSS.length;

            for (k = 1; k < SSS.length; k++) {
                if (SSS[k] == null){
                    x = x - 1;
                }
            }
            String A = SSS[0];
            for (k = 1; k < x; k++) {
                A = A + "   |   " + SSS[k];
                if (A.length() >= 90){
                    break;
                }
            }
            String B = null;
            k++;
            if (A.length() >= 90 && k < x){
                B = SSS[k];
                for (int p = k+1; p < x; p++) {
                    B = B + "   |   " + SSS[p];   
                }
            }

            tOutput.setText("");
            tOutput.setText(A);
            tOutput1.setText("");

            if (A.length() >= 90 && k < x){   
                tOutput1.setText(B);
            }
        } catch (Exception e){
            
        }
        
        //End Output Layout
        
        try {
            if (C.CheckValid(SS,j)){
                Nvalid.setVisible(false);
                valid.setVisible(true);
            } else {
                valid.setVisible(false);
                Nvalid.setVisible(true);
            }
        } catch (Exception e){
            
        }
        
    }//GEN-LAST:event_jOutputMouseClicked

    private void jStringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStringMouseClicked
        jString.setText("");
        valid.setVisible(false);
        Nvalid.setVisible(false);
    }//GEN-LAST:event_jStringMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        setVisible(false);
        About L = new About();
        L.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        L.setLocation(dim.width/2-L.getSize().width/2, dim.height/2-L.getSize().height/2);
        L.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        setVisible(false);
        Help L = new Help();
        L.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        L.setLocation(dim.width/2-L.getSize().width/2, dim.height/2-L.getSize().height/2);
        L.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Nvalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jOutput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jString;
    private javax.swing.JLabel tOutput;
    private javax.swing.JLabel tOutput1;
    private javax.swing.JPanel valid;
    // End of variables declaration//GEN-END:variables
}
