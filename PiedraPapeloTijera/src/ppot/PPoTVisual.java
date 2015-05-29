
package ppot;
import java.util.Scanner;
import java.util.Random;
public class PPoTVisual extends javax.swing.JFrame {
    public PPoTVisual() {
        initComponents();
        lbl_piedra.setVisible(false);
        lbl_papel.setVisible(false);
        lbl_tijera.setVisible(false);
        lbl_piedra2.setVisible(false);
        lbl_papel2.setVisible(false);
        lbl_tijera2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btn_piedra = new javax.swing.JButton();
        btn_papel = new javax.swing.JButton();
        btn_tijera = new javax.swing.JButton();
        lbl_piedra = new javax.swing.JLabel();
        lbl_papel = new javax.swing.JLabel();
        lbl_tijera = new javax.swing.JLabel();
        lbl_piedra2 = new javax.swing.JLabel();
        lbl_papel2 = new javax.swing.JLabel();
        lbl_tijera2 = new javax.swing.JLabel();
        lbl_bloquear = new javax.swing.JLabel();
        lbl_ganador = new javax.swing.JLabel();
        btn_reiniciar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_piedra.setText("Piedra");
        btn_piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_piedraActionPerformed(evt);
            }
        });
        getContentPane().add(btn_piedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 208, 73, 67));

        btn_papel.setText("Papel");
        btn_papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_papelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 286, 73, 67));

        btn_tijera.setText("Tijera");
        btn_tijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tijeraActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tijera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 364, 73, 67));

        lbl_piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/piedra r.jpg"))); // NOI18N
        getContentPane().add(lbl_piedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 300, -1));

        lbl_papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/papel 2.jpg"))); // NOI18N
        lbl_papel.setText("jLabel1");
        lbl_papel.setMaximumSize(new java.awt.Dimension(292, 250));
        lbl_papel.setMinimumSize(new java.awt.Dimension(292, 250));
        lbl_papel.setPreferredSize(new java.awt.Dimension(292, 250));
        getContentPane().add(lbl_papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        lbl_tijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tijera 2.jpg"))); // NOI18N
        lbl_tijera.setText("jLabel2");
        getContentPane().add(lbl_tijera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 292, -1));

        lbl_piedra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/piedra r.jpg"))); // NOI18N
        getContentPane().add(lbl_piedra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 320, 250));

        lbl_papel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/papel 2.jpg"))); // NOI18N
        lbl_papel2.setText("jLabel1");
        getContentPane().add(lbl_papel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 330, 310));

        lbl_tijera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tijera 2.jpg"))); // NOI18N
        lbl_tijera2.setText("jLabel2");
        getContentPane().add(lbl_tijera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 316, -1));

        lbl_bloquear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_bloquear.setText("Player 1");
        getContentPane().add(lbl_bloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        lbl_ganador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 280, 47));

        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reiniciarMouseClicked(evt);
            }
        });
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 67));

        pack();
    }// </editor-fold>                        

    private void btn_piedraActionPerformed(java.awt.event.ActionEvent evt) {                                           
    
    if(lbl_bloquear.getText().equals("Player 1")){    
    //Scanner chooseUrDestiny = new Scanner(System.in);
    Random ran = new Random();
    lbl_piedra.setVisible(true);
    //String realdestiny = "";//jugador
    //String computerdestiny = "";//computadora
     
	//la computadora escoge su destino…
	int computer_choice = ran.nextInt(2)+1;
        
        switch (computer_choice)
	{
            case 1:
            lbl_piedra2.setVisible(true);
            break;

            case 2:
            lbl_papel2.setVisible(true);
            break;

            case 3:
            lbl_tijera2.setVisible(true);
           break;
        }
        if(computer_choice == 1){
            lbl_ganador.setText("Empatados!");
        } else if (computer_choice == 2){
            lbl_ganador.setText("El Ganador fue la computadora!");
        } else if (computer_choice == 3){
            lbl_ganador.setText("El Ganador fuiste tu!");

        }
           lbl_bloquear.setText("Terminado");
    }
    }                                          

    private void btn_tijeraActionPerformed(java.awt.event.ActionEvent evt) {                                           
    
    if(lbl_bloquear.getText().equals("Player 1")){
    //Scanner chooseUrDestiny = new Scanner(System.in);
    Random ran = new Random(); 
    lbl_tijera.setVisible(true);
    //String realdestiny = "";//jugador
    //String computerdestiny = "";//computadora

	//la computadora escoge su destino…
	int computer_choice = ran.nextInt(2)+1;
        
        switch (computer_choice)
	{
            case 1:
            lbl_piedra2.setVisible(true);
            break;

            case 2:
            lbl_papel2.setVisible(true);
            break;

            case 3:
            lbl_tijera2.setVisible(true);
           break;
        }
         if(computer_choice == 1){
            lbl_ganador.setText("El Ganador fue la computadora!");
        } else if (computer_choice == 2){
            lbl_ganador.setText("El Ganador fuiste tu!");
        } else if (computer_choice == 3){
            lbl_ganador.setText("Empatados!");
        }
         lbl_bloquear.setText("Terminado");
    }  
    }                                          

    private void btn_papelActionPerformed(java.awt.event.ActionEvent evt) {                                          
    
    if(lbl_bloquear.getText().equals("Player 1")){
    //Scanner chooseUrDestiny = new Scanner(System.in);
    Random ran = new Random();   
    lbl_papel.setVisible(true);
    //String realdestiny = "";//jugador
    //String computerdestiny = "";//computadora

	//la computadora escoge su destino…
	int computer_choice = ran.nextInt(2)+1;
        
        switch (computer_choice)
	{
            case 1:
            lbl_piedra2.setVisible(true);
            break;

            case 2:
            lbl_papel2.setVisible(true);
            break;

            case 3:
            lbl_tijera2.setVisible(true);
           break;

	}
         if(computer_choice == 1){
            lbl_ganador.setText("El Ganador fuiste tu!");
        } else if (computer_choice == 2){
            lbl_ganador.setText("Empatados!");
        } else if (computer_choice == 3){
            lbl_ganador.setText("El Ganador fue la computadora!");
        }
         lbl_bloquear.setText("Terminado");
    }
    }                                         

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(lbl_bloquear.getText().equals("Terminado")){
        lbl_piedra.setVisible(false);
        lbl_papel.setVisible(false);
        lbl_tijera.setVisible(false);
        lbl_piedra2.setVisible(false);
        lbl_papel2.setVisible(false);
        lbl_tijera2.setVisible(false);
        lbl_ganador.setText("Juego Reiniciado");
        lbl_bloquear.setText("Player 1");
        }
    }                                             

    private void btn_reiniciarMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    public static void main(String args[]) {



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
            java.util.logging.Logger.getLogger(PPoTVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPoTVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPoTVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPoTVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPoTVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_papel;
    private javax.swing.JButton btn_piedra;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JButton btn_tijera;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lbl_bloquear;
    private javax.swing.JLabel lbl_ganador;
    private javax.swing.JLabel lbl_papel;
    private javax.swing.JLabel lbl_papel2;
    private javax.swing.JLabel lbl_piedra;
    private javax.swing.JLabel lbl_piedra2;
    private javax.swing.JLabel lbl_tijera;
    private javax.swing.JLabel lbl_tijera2;
    // End of variables declaration                   
}



