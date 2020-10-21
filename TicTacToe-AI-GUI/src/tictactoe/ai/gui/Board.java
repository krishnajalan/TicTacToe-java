/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.ai.gui;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author krish
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Board
     */
    static byte chance = 0;
    static TicTacToe gameObj = new TicTacToe();
    static boolean AI = false;
    
    public Board(boolean ai){
        initComponents();
        chance = 0;
        gameObj = new TicTacToe();
        AI = ai;
    }
    public Board() {
        initComponents();
        chance = 0;
        gameObj = new TicTacToe();
        AI = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        displayBoard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        b8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jButton10.setText("reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        displayBoard.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        displayBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayBoard.setText("Player 1 chance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(displayBoard))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(displayBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void buttonActions(int pos){
        switch(pos){
            case 1: 
                    b1.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            case 2:
                    b2.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            
            case 3:
                    b3.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            case 4:
                    b4.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            case 5:
                    b5.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            
            case 6:
                    b6.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            case 7:
                    b7.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            case 8:
                    b8.setText(gameObj.getMarker());
                    ifWinner();
                    break;
            case 9:
                    b9.setText(gameObj.getMarker());
                    ifWinner();
                    break;
        }
    }
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
      
        if (move(6)){
            buttonActions(6);
            moveAI();
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if (move(7)){
            buttonActions(7);
            moveAI();
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if (move(1))
            buttonActions(1);
            moveAI();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if (move(2)){
            buttonActions(2);
            moveAI();
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if (move(3)){
            buttonActions(3);
            moveAI();
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if (move(8)){
            buttonActions(8);
            moveAI();
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Thanks for Playing");
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Board(AI).play();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if (move(9)){
            buttonActions(9);
            moveAI();
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if (move(4)){
            buttonActions(4);
            moveAI();
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if (move(5)){
            buttonActions(5);
            moveAI();
        }
    }//GEN-LAST:event_b5ActionPerformed

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
        */
        new Board(true).play();
    }
    
    void play(){
        this.setVisible(true);
    }
    
    boolean move(int pos){
        
        if (!AI && gameObj.on){
            if (gameObj.chance==0){
                if (gameObj.moveable(pos)){
                    gameObj.chance ^= 1;
                    gameObj.availpos--;
                    gameObj.moves[pos] = 1;
                    gameObj.p1.movePlayed[pos] = 1;
                    output("Player 2 Chance");
                    return true;
                }
            }
            else{
                if (gameObj.moveable(pos)){
                    gameObj.chance ^= 1;
                    gameObj.availpos--;
                    gameObj.p2.movePlayed[pos] = 1;
                    gameObj.moves[pos] = 1;
                    output("Player 1 Chance");
                    return true;
                }
            }
        }
        else if (gameObj.on && AI){
            if (gameObj.chance==0){
                if (gameObj.moveable(pos)){
                    gameObj.chance ^= 1;
                    gameObj.availpos--;
                    gameObj.moves[pos] = 1;
                    gameObj.p1.movePlayed[pos] = 1;
                    return true;
                }
                
            }
        }
        return false;
    }
    
    void moveAI(){
        if (AI && gameObj.on){
            int pos =  bestPlay();
            gameObj.chance ^= 1;
            gameObj.availpos--;
            gameObj.p2.movePlayed[pos] = 1;
            gameObj.moves[pos] = 1;
            buttonActions(pos);
            
            ifWinner();
        }
    }
    
    void output(String msg){
        displayBoard.setText(msg);
    }
    
    void ifWinner(){
        String out1 = gameObj.checkWin();
        //System.out.println(Arrays.toString(gameObj.p1.movePlayed));
        if (out1.length()!=0){
            gameObj.on = false;
            if (AI && out1 == "Player 2")
                output("Computer" + " wins!");
            else
                output(out1 + " wins!");
                
        }
        if (gameObj.availpos==0){
            gameObj.on = false;
            output("   Game Draws");
        }
    }
    
    int bestPlay(){
        int bestScore = -1000;
        int bestPosition = -1;
        for (int i=1; i<10; i++){
            if (gameObj.moves[i] == 0){
                gameObj.moves[i] = 1;
                gameObj.availpos--;
                gameObj.p2.movePlayed[i] = 1;
                int currentScore = miniMax(0, false);
                if (currentScore > bestScore){
                    bestScore = currentScore;
                    bestPosition = i;
                }
                gameObj.moves[i] = 0;
                gameObj.availpos++;
                gameObj.p2.movePlayed[i] = 0;
            }
        }
        
        return bestPosition;
    }
    
    
    int miniMax(int depth,boolean isMaxmus){
        int bestPosition = -1;
        int bestScore = 0;
        if (gameObj.p1.win())
            return -10 + depth;
        if (gameObj.p2.win())
            return  10 - depth;
        if (gameObj.availpos == 0)
            return 0;
    
        else{
            
            if (isMaxmus){
                bestScore = -1000;
                for (int i=1; i<10; i++){
                    if (gameObj.moves[i] == 0){
                        
                        gameObj.moves[i] = 1;
                        gameObj.availpos--;
                        gameObj.p2.movePlayed[i] = 1;
                        int currentScore = miniMax(depth+1, false);
                        if (currentScore > bestScore){
                            bestScore = currentScore;
                            bestPosition = i;
                        }
                        gameObj.moves[i] = 0;
                        gameObj.availpos++;
                        gameObj.p2.movePlayed[i] = 0;
                    }
                }
            }
                        
            else{
                bestScore = 1000;
                for (int i=1; i<10; i++){
                    if (gameObj.moves[i] == 0){
                        
                        gameObj.moves[i] = 1;
                        gameObj.availpos--;
                        gameObj.p1.movePlayed[i] = 1;
                        int currentScore = miniMax(depth+1, true);
                        if (currentScore < bestScore){
                            bestScore = currentScore;
                            bestPosition = i;
                        }
                        gameObj.moves[i] = 0;
                        gameObj.availpos++;
                        gameObj.p1.movePlayed[i] = 0;
                    }
                }
             
            }
            return bestScore;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel displayBoard;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    // End of variables declaration//GEN-END:variables
}