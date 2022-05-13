/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sena.javacourse.appletactivity;

/**
 *
 * @author Jeyssson
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public String contentText;

    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearBtn = new javax.swing.JButton();
        content = new javax.swing.JLabel();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        minusBtn = new javax.swing.JButton();
        timesBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        percentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        setForeground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(435, 600));
        setPreferredSize(new java.awt.Dimension(435, 600));
        setResizable(false);

        clearBtn.setBackground(new java.awt.Color(255, 50, 50));
        clearBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(250, 250, 250));
        clearBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearBtn.setLabel("C");
        clearBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        content.setBackground(new java.awt.Color(0, 0, 0));
        content.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        content.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        content.setText("0");
        content.setToolTipText("");
        content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        content.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        content.setName(""); // NOI18N
        content.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sevenBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        eightBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        eightBtn.setText("8");
        eightBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        nineBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        nineBtn.setText("9");
        nineBtn.setBorder(null);
        nineBtn.setBorderPainted(false);
        nineBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nineBtn.setOpaque(false);

        fourBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        fourBtn.setText("4");
        fourBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        fiveBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        sixBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        sixBtn.setText("6");
        sixBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        oneBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        oneBtn.setText("1");
        oneBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        twoBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        twoBtn.setText("2");
        twoBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        threeBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        threeBtn.setText("3");
        threeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        zeroBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.setBorderPainted(false);
        zeroBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        zeroBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                zeroBtnKeyPressed(evt);
            }
        });

        dotBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        dotBtn.setText(".");
        dotBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        equalBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        plusBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        plusBtn.setText("+");
        plusBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        minusBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        minusBtn.setText("-");
        minusBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        timesBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        timesBtn.setText("*");
        timesBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        divBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        divBtn.setText("/");
        divBtn.setToolTipText("");
        divBtn.setBorderPainted(false);
        divBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        divBtn.setMinimumSize(new java.awt.Dimension(100, 50));

        percentBtn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        percentBtn.setText("%");
        percentBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(zeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getAccessibleContext().setAccessibleName("Calculadora");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equalBtnActionPerformed

    private void zeroBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zeroBtnKeyPressed
        
        
        this.content.setText("100000000001");

    }//GEN-LAST:event_zeroBtnKeyPressed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel content;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton percentBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton timesBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
