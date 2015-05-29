/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogra1;
import java.io.File;
import java.io.FileInputStream;
import java.lang.*;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.util.Random;

/**
 *
 * @author Osman Oliva
 */
public class Juego extends javax.swing.JFrame {
    Random ran = new Random();
   

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        int turno = ran.nextInt(2)+1;
        if (turno == 1){
            lbl_turno.setText("Jugador 1");
            btn_ataque1_jugador1.setEnabled(true);
            btn_ataque2_jugador1.setEnabled(true);
            btn_ataque3_jugador1.setEnabled(true);
            btn_ataque1_jugador2.setEnabled(false);
            btn_ataque2_jugador2.setEnabled(false);
            btn_ataque3_jugador2.setEnabled(false);
        } else if (turno == 2){
            lbl_turno.setText("Jugador 2");
            btn_ataque1_jugador1.setEnabled(false);
            btn_ataque2_jugador1.setEnabled(false);
            btn_ataque3_jugador1.setEnabled(false);
            btn_ataque1_jugador2.setEnabled(true);
            btn_ataque2_jugador2.setEnabled(true);
            btn_ataque3_jugador2.setEnabled(true);
        
        }
        bar_jugador1.setValue(100);
        bar_jugador2.setValue(100);
        lbl_game_over.setText("");
        AtaqueJugador1.setVisible(false);
        AtaqueJugador2.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AtaqueJugador1 = new javax.swing.JLabel();
        AtaqueJugador2 = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JLabel();
        btn_ataque1_jugador1 = new javax.swing.JToggleButton();
        btn_ataque2_jugador1 = new javax.swing.JToggleButton();
        btn_ataque3_jugador1 = new javax.swing.JButton();
        btn_ataque1_jugador2 = new javax.swing.JButton();
        btn_ataque2_jugador2 = new javax.swing.JButton();
        btn_ataque3_jugador2 = new javax.swing.JButton();
        lbl_vida_jugador1 = new javax.swing.JLabel();
        lbl_vida_jugador2 = new javax.swing.JLabel();
        Turno = new javax.swing.JLabel();
        lbl_turno = new javax.swing.JLabel();
        lbl_game_over = new javax.swing.JLabel();
        bar_jugador1 = new javax.swing.JProgressBar();
        bar_jugador2 = new javax.swing.JProgressBar();
        Vida_Player1 = new javax.swing.JLabel();
        Vida_Player2 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JToggleButton();
        btn_exit = new javax.swing.JToggleButton();
        lbl_condicion1_jugador1 = new javax.swing.JLabel();
        lbl_condicion2_jugador1 = new javax.swing.JLabel();
        lbl_condicion3_jugador1 = new javax.swing.JLabel();
        Condicion1Player1 = new javax.swing.JLabel();
        Condicion2Player1 = new javax.swing.JLabel();
        Condicion3Player1 = new javax.swing.JLabel();
        lbl_condicion1_jugador2 = new javax.swing.JLabel();
        lbl_condicion2_jugador2 = new javax.swing.JLabel();
        lbl_condicion3_jugador2 = new javax.swing.JLabel();
        Condicion1Player2 = new javax.swing.JLabel();
        Condicion1Player3 = new javax.swing.JLabel();
        Condicion1Player4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AtaqueJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PieceDjinnAtkG.png"))); // NOI18N
        getContentPane().add(AtaqueJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 370, 280));

        AtaqueJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PieceDragonAtkG.png"))); // NOI18N
        getContentPane().add(AtaqueJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 230, 340, 230));

        Jugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PieceValkiriabltG.png"))); // NOI18N
        getContentPane().add(Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        Jugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PieceDragonbltG.png"))); // NOI18N
        getContentPane().add(Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, 390));

        btn_ataque1_jugador1.setText("Rayo Gama");
        btn_ataque1_jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ataque1_jugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ataque1_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 556, 120, -1));

        btn_ataque2_jugador1.setText("Ataque Vikingo");
        btn_ataque2_jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ataque2_jugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ataque2_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 590, 120, -1));

        btn_ataque3_jugador1.setText("Espadazo Mortal");
        btn_ataque3_jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ataque3_jugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ataque3_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 624, 120, -1));

        btn_ataque1_jugador2.setText("Colazo Cosmico");
        btn_ataque1_jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ataque1_jugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ataque1_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 556, 170, -1));

        btn_ataque2_jugador2.setText("Llama de Fuego");
        btn_ataque2_jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ataque2_jugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ataque2_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 590, 170, -1));

        btn_ataque3_jugador2.setText("Aliento de Dragon Mortal");
        btn_ataque3_jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ataque3_jugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ataque3_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 624, 170, -1));

        lbl_vida_jugador1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_vida_jugador1.setText("100");
        getContentPane().add(lbl_vida_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, 20));

        lbl_vida_jugador2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_vida_jugador2.setText("100");
        getContentPane().add(lbl_vida_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, 30, 20));

        Turno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turno.setText("TURNO:");
        getContentPane().add(Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, -1));

        lbl_turno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_turno.setText("Jugador 1");
        getContentPane().add(lbl_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 200, 20));

        lbl_game_over.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(lbl_game_over, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 210, 30));

        bar_jugador1.setValue(100);
        getContentPane().add(bar_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        bar_jugador2.setValue(100);
        getContentPane().add(bar_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        Vida_Player1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Vida_Player1.setText("Vida:");
        getContentPane().add(Vida_Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 30, 20));

        Vida_Player2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Vida_Player2.setText("Vida:");
        getContentPane().add(Vida_Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 30, 20));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 90, -1));

        lbl_condicion1_jugador1.setText("10");
        getContentPane().add(lbl_condicion1_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 560, 50, -1));

        lbl_condicion2_jugador1.setText("6");
        getContentPane().add(lbl_condicion2_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 40, 20));

        lbl_condicion3_jugador1.setText("3");
        getContentPane().add(lbl_condicion3_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 624, 40, 20));

        Condicion1Player1.setText("/  10");
        getContentPane().add(Condicion1Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 30, -1));

        Condicion2Player1.setText("/  6");
        getContentPane().add(Condicion2Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, 20));

        Condicion3Player1.setText("/  3");
        getContentPane().add(Condicion3Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 624, 30, 20));

        lbl_condicion1_jugador2.setText("10");
        getContentPane().add(lbl_condicion1_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 30, -1));

        lbl_condicion2_jugador2.setText("6");
        getContentPane().add(lbl_condicion2_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 10, 20));

        lbl_condicion3_jugador2.setText("3");
        getContentPane().add(lbl_condicion3_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, 20, -1));

        Condicion1Player2.setText("/ 3");
        getContentPane().add(Condicion1Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 26, -1));

        Condicion1Player3.setText("/ 10");
        getContentPane().add(Condicion1Player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 20, -1));

        Condicion1Player4.setText("/ 6");
        getContentPane().add(Condicion1Player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 26, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PopUp Battle Background.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ataque3_jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ataque3_jugador1ActionPerformed
        if(lbl_turno.getText().equals("Jugador 1"))
        {
            int condicion = Integer.parseInt(lbl_condicion3_jugador1.getText());
            if(condicion>=1){
                condicion--;
            int ataque_jugador1 = ran.nextInt(20)+1;
            int vida_jugador2 = Integer.parseInt(lbl_vida_jugador2.getText());
            vida_jugador2 -= ataque_jugador1;
            bar_jugador2.setValue(vida_jugador2);
            AtaqueJugador1.setVisible(true);
            AtaqueJugador2.setVisible(false);
            if(vida_jugador2<=0)
            {
                vida_jugador2 = 0;
                lbl_game_over.setText("El Jugador 1 ha ganado!");
                AtaqueJugador1.setVisible(false);
                AtaqueJugador2.setVisible(false);
            }
            lbl_vida_jugador2.setText(""+vida_jugador2);
            lbl_turno.setText("Jugador 2");
            lbl_condicion3_jugador1.setText(""+condicion);
            btn_ataque1_jugador1.setEnabled(false);
            btn_ataque2_jugador1.setEnabled(false);
            btn_ataque3_jugador1.setEnabled(false);
            btn_ataque1_jugador2.setEnabled(true);
            btn_ataque2_jugador2.setEnabled(true);
            btn_ataque3_jugador2.setEnabled(true);
            if(lbl_game_over.getText().equals("El Jugador 1 ha ganado!")){
                btn_ataque1_jugador1.setEnabled(false);
                btn_ataque2_jugador1.setEnabled(false);
                btn_ataque3_jugador1.setEnabled(false);
                btn_ataque1_jugador2.setEnabled(false);
                btn_ataque2_jugador2.setEnabled(false);
                btn_ataque3_jugador2.setEnabled(false);
                Jugador2.setVisible(false);
                lbl_turno.setText("Terminado");
                InputStream music;
                try{
                music = new FileInputStream(new File("src\\assets\\andross-neverdefme.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                }
            }
            } 
        }  
    }//GEN-LAST:event_btn_ataque3_jugador1ActionPerformed

    private void btn_ataque3_jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ataque3_jugador2ActionPerformed
       if(lbl_turno.getText().equals("Jugador 2"))
        {
            int condicion = Integer.parseInt(lbl_condicion3_jugador2.getText());
            if(condicion>=1){
                condicion--;
            int ataque_jugador2 = ran.nextInt(20)+1;
            int vida_jugador1 = Integer.parseInt(lbl_vida_jugador1.getText());
            vida_jugador1 -= ataque_jugador2;
            bar_jugador1.setValue(vida_jugador1);
            AtaqueJugador1.setVisible(false);
            AtaqueJugador2.setVisible(true);
            if(vida_jugador1<=0)
            {
                vida_jugador1 = 0;
                lbl_game_over.setText("El Jugador 2 ha ganado!");
                AtaqueJugador1.setVisible(false);
                AtaqueJugador2.setVisible(false);
            }
            lbl_vida_jugador1.setText(""+vida_jugador1);
            lbl_turno.setText("Jugador 1");
            lbl_condicion3_jugador2.setText(""+condicion);
            btn_ataque1_jugador1.setEnabled(true);
            btn_ataque2_jugador1.setEnabled(true);
            btn_ataque3_jugador1.setEnabled(true);
            btn_ataque1_jugador2.setEnabled(false);
            btn_ataque2_jugador2.setEnabled(false);
            btn_ataque3_jugador2.setEnabled(false);
            if(lbl_game_over.getText().equals("El Jugador 2 ha ganado!")){
                btn_ataque1_jugador1.setEnabled(false);
                btn_ataque2_jugador1.setEnabled(false);
                btn_ataque3_jugador1.setEnabled(false);
                btn_ataque1_jugador2.setEnabled(false);
                btn_ataque2_jugador2.setEnabled(false);
                btn_ataque3_jugador2.setEnabled(false);
                Jugador1.setVisible(false);
                lbl_turno.setText("Terminado");
                InputStream music;
                try{
                music = new FileInputStream(new File("src\\assets\\andross-neverdefme.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                }
            }
            } 
        }  
    }//GEN-LAST:event_btn_ataque3_jugador2ActionPerformed

    private void btn_ataque1_jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ataque1_jugador2ActionPerformed
        if(lbl_turno.getText().equals("Jugador 2"))
        {
            int condicion = Integer.parseInt(lbl_condicion1_jugador2.getText());
            if(condicion>=1){
                condicion--;
            int ataque_jugador2 = ran.nextInt(10)+1;
            int vida_jugador1 = Integer.parseInt(lbl_vida_jugador1.getText());
            vida_jugador1 -= ataque_jugador2;
            bar_jugador1.setValue(vida_jugador1);
            AtaqueJugador1.setVisible(false);
            AtaqueJugador2.setVisible(true);
            if(vida_jugador1<=0)
            {
                vida_jugador1 = 0;
                lbl_game_over.setText("El Jugador 2 ha ganado!");
                AtaqueJugador1.setVisible(false);
                AtaqueJugador2.setVisible(false);
            }
            lbl_vida_jugador1.setText(""+vida_jugador1);
            lbl_turno.setText("Jugador 1");
            lbl_condicion1_jugador2.setText(""+condicion);
            btn_ataque1_jugador1.setEnabled(true);
            btn_ataque2_jugador1.setEnabled(true);
            btn_ataque3_jugador1.setEnabled(true);
            btn_ataque1_jugador2.setEnabled(false);
            btn_ataque2_jugador2.setEnabled(false);
            btn_ataque3_jugador2.setEnabled(false);
            if(lbl_game_over.getText().equals("El Jugador 2 ha ganado!")){
                btn_ataque1_jugador1.setEnabled(false);
                btn_ataque2_jugador1.setEnabled(false);
                btn_ataque3_jugador1.setEnabled(false);
                btn_ataque1_jugador2.setEnabled(false);
                btn_ataque2_jugador2.setEnabled(false);
                btn_ataque3_jugador2.setEnabled(false);
                Jugador1.setVisible(false);
                lbl_turno.setText("Terminado");
                InputStream music;
                try{
                music = new FileInputStream(new File("src\\assets\\andross-neverdefme.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                }
            }
            } 
        }  
    }//GEN-LAST:event_btn_ataque1_jugador2ActionPerformed

    private void btn_ataque2_jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ataque2_jugador2ActionPerformed
        if(lbl_turno.getText().equals("Jugador 2"))
        {
            int condicion = Integer.parseInt(lbl_condicion2_jugador2.getText());
            if(condicion>=1){
                condicion--;
            int ataque_jugador2 = ran.nextInt(15)+1;
            int vida_jugador1 = Integer.parseInt(lbl_vida_jugador1.getText());
            vida_jugador1 -= ataque_jugador2;
            bar_jugador1.setValue(vida_jugador1);
            AtaqueJugador1.setVisible(false);
            AtaqueJugador2.setVisible(true);
            if(vida_jugador1<=0)
            {
                vida_jugador1 = 0;
                lbl_game_over.setText("El Jugador 2 ha ganado!");
                AtaqueJugador1.setVisible(false);
                AtaqueJugador2.setVisible(false);
            }
            lbl_vida_jugador1.setText(""+vida_jugador1);
            lbl_turno.setText("Jugador 1");
            lbl_condicion2_jugador2.setText(""+condicion);
            btn_ataque1_jugador1.setEnabled(true);
            btn_ataque2_jugador1.setEnabled(true);
            btn_ataque3_jugador1.setEnabled(true);
            btn_ataque1_jugador2.setEnabled(false);
            btn_ataque2_jugador2.setEnabled(false);
            btn_ataque3_jugador2.setEnabled(false);
            if(lbl_game_over.getText().equals("El Jugador 2 ha ganado!")){
                btn_ataque1_jugador1.setEnabled(false);
                btn_ataque2_jugador1.setEnabled(false);
                btn_ataque3_jugador1.setEnabled(false);
                btn_ataque1_jugador2.setEnabled(false);
                btn_ataque2_jugador2.setEnabled(false);
                btn_ataque3_jugador2.setEnabled(false);
                Jugador1.setVisible(false);
                lbl_turno.setText("Terminado");
                InputStream music;
                try{
                music = new FileInputStream(new File("src\\assets\\andross-neverdefme.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                }
            }
            } 
        }  
    }//GEN-LAST:event_btn_ataque2_jugador2ActionPerformed

    private void btn_ataque1_jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ataque1_jugador1ActionPerformed
        if(lbl_turno.getText().equals("Jugador 1"))
        {
            int condicion = Integer.parseInt(lbl_condicion1_jugador1.getText());
            if(condicion>=1){
                condicion--;
            int ataque_jugador1 = ran.nextInt(10)+1;
            int vida_jugador2 = Integer.parseInt(lbl_vida_jugador2.getText());
            vida_jugador2 -= ataque_jugador1;
            bar_jugador2.setValue(vida_jugador2);
            AtaqueJugador1.setVisible(true);
            AtaqueJugador2.setVisible(false);
            if(vida_jugador2<=0)
            {
                vida_jugador2 = 0;
                lbl_game_over.setText("El Jugador 1 ha ganado!");
                AtaqueJugador1.setVisible(false);
                AtaqueJugador2.setVisible(false);
            }
            lbl_vida_jugador2.setText(""+vida_jugador2);
            lbl_turno.setText("Jugador 2");
            lbl_condicion1_jugador1.setText(""+condicion);
            btn_ataque1_jugador1.setEnabled(false);
            btn_ataque2_jugador1.setEnabled(false);
            btn_ataque3_jugador1.setEnabled(false);
            btn_ataque1_jugador2.setEnabled(true);
            btn_ataque2_jugador2.setEnabled(true);
            btn_ataque3_jugador2.setEnabled(true);
            if(lbl_game_over.getText().equals("El Jugador 1 ha ganado!")){
                btn_ataque1_jugador1.setEnabled(false);
                btn_ataque2_jugador1.setEnabled(false);
                btn_ataque3_jugador1.setEnabled(false);
                btn_ataque1_jugador2.setEnabled(false);
                btn_ataque2_jugador2.setEnabled(false);
                btn_ataque3_jugador2.setEnabled(false);
                Jugador2.setVisible(false);
                lbl_turno.setText("Terminado");
                InputStream music;
                try{
                music = new FileInputStream(new File("src\\assets\\andross-neverdefme.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                }
            }
            } 
        }    
    }//GEN-LAST:event_btn_ataque1_jugador1ActionPerformed

    private void btn_ataque2_jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ataque2_jugador1ActionPerformed
        if(lbl_turno.getText().equals("Jugador 1"))
        {
            int condicion = Integer.parseInt(lbl_condicion2_jugador1.getText());
            if(condicion>=1){
                condicion--;
            int ataque_jugador1 = ran.nextInt(15)+1;
            int vida_jugador2 = Integer.parseInt(lbl_vida_jugador2.getText());
            vida_jugador2 -= ataque_jugador1;
            bar_jugador2.setValue(vida_jugador2);
            AtaqueJugador1.setVisible(true);
            AtaqueJugador2.setVisible(false);
            if(vida_jugador2<=0)
            {
                vida_jugador2 = 0;
                lbl_game_over.setText("El Jugador 1 ha ganado!");
                AtaqueJugador1.setVisible(false);
                AtaqueJugador2.setVisible(false);
            }
            lbl_vida_jugador2.setText(""+vida_jugador2);
            lbl_turno.setText("Jugador 2");
            lbl_condicion2_jugador1.setText(""+condicion);
            btn_ataque1_jugador1.setEnabled(false);
            btn_ataque2_jugador1.setEnabled(false);
            btn_ataque3_jugador1.setEnabled(false);
            btn_ataque1_jugador2.setEnabled(true);
            btn_ataque2_jugador2.setEnabled(true);
            btn_ataque3_jugador2.setEnabled(true);
            if(lbl_game_over.getText().equals("El Jugador 1 ha ganado!")){
                btn_ataque1_jugador1.setEnabled(false);
                btn_ataque2_jugador1.setEnabled(false);
                btn_ataque3_jugador1.setEnabled(false);
                btn_ataque1_jugador2.setEnabled(false);
                btn_ataque2_jugador2.setEnabled(false);
                btn_ataque3_jugador2.setEnabled(false);
                Jugador2.setVisible(false);
                lbl_turno.setText("Terminado");
                InputStream music;
                try{
                music = new FileInputStream(new File("src\\assets\\andross-neverdefme.wav"));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                }
            }
            }   
        } 
    }//GEN-LAST:event_btn_ataque2_jugador1ActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        bar_jugador1.setValue(100);
        bar_jugador2.setValue(100);
        int vida_jugador1 = 100;
        lbl_vida_jugador1.setText(""+vida_jugador1);
        int vida_jugador2 = 100;
        lbl_vida_jugador2.setText(""+vida_jugador2);
        lbl_game_over.setText("");
        AtaqueJugador1.setVisible(false);
        AtaqueJugador2.setVisible(false);
        Jugador1.setVisible(true);
        Jugador2.setVisible(true);
        
        int condicion1_player1 = 10;
        lbl_condicion1_jugador1.setText(""+condicion1_player1);
        int condicion2_player1 = 6;
        lbl_condicion2_jugador1.setText(""+condicion2_player1);
        int condicion3_player1 = 3;
        lbl_condicion3_jugador1.setText(""+condicion3_player1);
        int condicion1_player2 = 10;
        lbl_condicion1_jugador2.setText(""+condicion1_player2);
        int condicion2_player2 = 6;
        lbl_condicion2_jugador2.setText(""+condicion2_player2);
        int condicion3_player2 = 3;
        lbl_condicion3_jugador2.setText(""+condicion3_player2);
        
        int turno = ran.nextInt(2)+1;
        if (turno == 1){
            lbl_turno.setText("Jugador 1");
            btn_ataque1_jugador1.setEnabled(true);
            btn_ataque2_jugador1.setEnabled(true);
            btn_ataque3_jugador1.setEnabled(true);
            btn_ataque1_jugador2.setEnabled(false);
            btn_ataque2_jugador2.setEnabled(false);
            btn_ataque3_jugador2.setEnabled(false);
        } else if (turno == 2){
            lbl_turno.setText("Jugador 2");
            btn_ataque1_jugador1.setEnabled(false);
            btn_ataque2_jugador1.setEnabled(false);
            btn_ataque3_jugador1.setEnabled(false);
            btn_ataque1_jugador2.setEnabled(true);
            btn_ataque2_jugador2.setEnabled(true);
            btn_ataque3_jugador2.setEnabled(true);
        }
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtaqueJugador1;
    private javax.swing.JLabel AtaqueJugador2;
    private javax.swing.JLabel Condicion1Player1;
    private javax.swing.JLabel Condicion1Player2;
    private javax.swing.JLabel Condicion1Player3;
    private javax.swing.JLabel Condicion1Player4;
    private javax.swing.JLabel Condicion2Player1;
    private javax.swing.JLabel Condicion3Player1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Jugador1;
    private javax.swing.JLabel Jugador2;
    private javax.swing.JLabel Turno;
    private javax.swing.JLabel Vida_Player1;
    private javax.swing.JLabel Vida_Player2;
    private javax.swing.JProgressBar bar_jugador1;
    private javax.swing.JProgressBar bar_jugador2;
    private javax.swing.JToggleButton btn_ataque1_jugador1;
    private javax.swing.JButton btn_ataque1_jugador2;
    private javax.swing.JToggleButton btn_ataque2_jugador1;
    private javax.swing.JButton btn_ataque2_jugador2;
    private javax.swing.JButton btn_ataque3_jugador1;
    private javax.swing.JButton btn_ataque3_jugador2;
    private javax.swing.JToggleButton btn_exit;
    private javax.swing.JToggleButton btn_reset;
    private javax.swing.JLabel lbl_condicion1_jugador1;
    private javax.swing.JLabel lbl_condicion1_jugador2;
    private javax.swing.JLabel lbl_condicion2_jugador1;
    private javax.swing.JLabel lbl_condicion2_jugador2;
    private javax.swing.JLabel lbl_condicion3_jugador1;
    private javax.swing.JLabel lbl_condicion3_jugador2;
    private javax.swing.JLabel lbl_game_over;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JLabel lbl_vida_jugador1;
    private javax.swing.JLabel lbl_vida_jugador2;
    // End of variables declaration//GEN-END:variables
}