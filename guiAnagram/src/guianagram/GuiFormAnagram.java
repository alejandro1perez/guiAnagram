/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guianagram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author alejandro.perez
 */
public class GuiFormAnagram extends javax.swing.JFrame {
     static ArrayList<String> list = new ArrayList();
     static Random rnd = new Random();
     String original;
     int counter = 0;
     int count = 1;
     int delay = 1000;
    ActionListener al = new ActionListener(){
      @Override
       public void actionPerformed(ActionEvent e) {  
       txtTimer.setText(""+count++);
       if (count == 60)
       {
           t.stop();
           txtTimer.setText(""+0);
           txtShuffled.setText(original);
           txtScore.setText("" + counter);
           txtWord.setText("");
           txtWord.setEnabled(false); 
           btnSubmit.setEnabled(false); 
       }
       
    }
        };
        Timer t = new Timer (delay,al);
        
    
     //static String temp = "";
     public static void LoadDictionary()
    {
        String s;
        File f = new File("words.txt");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while ((s = br.readLine()) != null)
            {
               list.add(s);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    public static String randomWord(ArrayList<String> a)
    {
        return a.get(rnd.nextInt(a.size()));
    }
   public static String shuffleString(String s)
   {
       char[] c = s.toCharArray() ;
       for(int i = 0 ; i < s.length()-1; i++ )
            {
                int b = (char)(Math.random() * c.length);
                char temp = c[i]; 
                c[i] = c[b];  
                c[b] = temp;
            }
       return new String(c);
    }
 
    
    public GuiFormAnagram() {
        initComponents();
        LoadDictionary();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        txtShuffled = new javax.swing.JTextField();
        txtWord = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        txtScore = new javax.swing.JTextField();
        txtTimer = new javax.swing.JTextField();
        btnRestart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubmit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtShuffled.setEditable(false);
        txtShuffled.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        txtWord.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        btnStart.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(1, 100, 32));
        btnStart.setText("Start");
        btnStart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        txtScore.setEditable(false);
        txtScore.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        txtScore.setForeground(new java.awt.Color(0, 0, 250));
        txtScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScore.setBorder(null);

        txtTimer.setEditable(false);
        txtTimer.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        txtTimer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimer.setBorder(null);

        btnRestart.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(240, 0, 0));
        btnRestart.setText("Restart Game");
        btnRestart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("How to play:\n\n1 minute to solve anagram.\n+1 if you solve the anagram.\n\nGood Luck And Have Fun!");
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea2);

        btnShow.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnShow.setText("Show Word");
        btnShow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txtTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtShuffled, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtShuffled))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)))
                .addGap(45, 45, 45)
                .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
         original = randomWord(list);
         String s = shuffleString(original);
         txtShuffled.setText(s);
         System.out.println(original);
         t.start();
         txtWord.setEnabled(true);
         btnStart.setEnabled(false);
         btnSubmit.setEnabled(true);
         btnShow.setEnabled(true);
         counter=0;
         txtScore.setText("" + counter);
    }//GEN-LAST:event_btnStartActionPerformed

    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       String s = txtWord.getText();
        if(s.equals(original))
        {
           counter++;
           txtScore.setText(" " + counter);
           txtTimer.setText(""+0);
           t.stop();
           count=0;
           t.start();
           original = randomWord(list);
           s = shuffleString(original);
           txtShuffled.setText(s);
           txtWord.setText("");
           System.out.println(original);
        }    
        else
        {
            txtScore.setText("Try Again!");
            txtWord.setText("");
        }
        btnStart.setEnabled(false);
              
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        txtTimer.setText(""+0);
        count = 0;
        t.stop();
        txtShuffled.setText("");
        txtWord.setText("");
        txtWord.setEnabled(false);
        counter=1;
        txtScore.setText("");
        txtScore.setEnabled(true);
        btnStart.setEnabled(true);
        btnSubmit.setEnabled(false);
        btnShow.setEnabled(false);
        
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        txtShuffled.setText(original);
        txtTimer.setText(""+0);
        t.stop();
        counter=1;
        txtWord.setEnabled(false);
        btnStart.setEnabled(false);
        btnSubmit.setEnabled(false);
        
        
    }//GEN-LAST:event_btnShowActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFormAnagram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFormAnagram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFormAnagram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFormAnagram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFormAnagram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtShuffled;
    private javax.swing.JTextField txtTimer;
    private javax.swing.JTextField txtWord;
    // End of variables declaration//GEN-END:variables
}
