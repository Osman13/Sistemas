
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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

        btn_piedra.setText("Piedra");
        btn_piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_piedraActionPerformed(evt);
            }
        });

        btn_papel.setText("Papel");
        btn_papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_papelActionPerformed(evt);
            }
        });

        btn_tijera.setText("Tijera");
        btn_tijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tijeraActionPerformed(evt);
            }
        });

        lbl_piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/piedra r.jpg"))); // NOI18N

        lbl_papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/papel 2.jpg"))); // NOI18N
        lbl_papel.setText("jLabel1");
        lbl_papel.setMaximumSize(new java.awt.Dimension(292, 250));
        lbl_papel.setMinimumSize(new java.awt.Dimension(292, 250));
        lbl_papel.setPreferredSize(new java.awt.Dimension(292, 250));

        lbl_tijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tijera 2.jpg"))); // NOI18N
        lbl_tijera.setText("jLabel2");

        lbl_piedra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/piedra r.jpg"))); // NOI18N

        lbl_papel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/papel 2.jpg"))); // NOI18N
        lbl_papel2.setText("jLabel1");

        lbl_tijera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tijera 2.jpg"))); // NOI18N
        lbl_tijera2.setText("jLabel2");

        lbl_bloquear.setText("Player 1");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_piedra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_papel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_ganador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_tijera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_bloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_piedra)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_piedra2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_papel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tijera, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tijera2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_papel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lbl_bloquear)
                .addGap(18, 18, 18)
                .addComponent(btn_piedra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_papel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tijera, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_piedra)
                    .addComponent(lbl_piedra2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_papel2)
                    .addComponent(lbl_papel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tijera2)
                    .addComponent(lbl_tijera))
                .addGap(0, 87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_piedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_piedraActionPerformed
    
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
        lbl_bloquear.setText("Bloquear");

    }
    }//GEN-LAST:event_btn_piedraActionPerformed

    private void btn_tijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tijeraActionPerformed
    
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
    }  
        lbl_bloquear.setText("Bloquear");
    }//GEN-LAST:event_btn_tijeraActionPerformed

    private void btn_papelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_papelActionPerformed
    
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
    }
    lbl_bloquear.setText("Bloquear");
    }//GEN-LAST:event_btn_papelActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
        if(lbl_bloquear.getText().equals("Bloquear")){
        lbl_piedra.setVisible(false);
        lbl_papel.setVisible(false);
        lbl_tijera.setVisible(false);
        lbl_piedra2.setVisible(false);
        lbl_papel2.setVisible(false);
        lbl_tijera2.setVisible(false);
        lbl_ganador.setText("");
        lbl_bloquear.setText("Player 1");
        }
    }//GEN-LAST:event_btn_reiniciarActionPerformed

    private void btn_reiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reiniciarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reiniciarMouseClicked

    public static void main(String args[]) {
       /* Scanner chooseUrDestiny = new Scanner(System.in);
		Random rng_jesus = new Random(0);
		int destiny;//seleccion de jugador
		String otravez;
                lbl_piedra.setVisible(false);
		do
		{

			//Jugador escoge su destino…
			while (true)
			{			
				System.out.print("\nSeleccione: \n1.Piedra \n2.Papel \n3.Tijera? \nSelección: ");
				destiny = chooseUrDestiny.nextInt();
				if (destiny == 1 || destiny == 2 || destiny ==3)
					break;
				else
					System.out.println("Selección inválida.");//crashea si ingresa texto, no números. :/ oh well.

			}
			// fin de selección

			//Strings que le dan nombres a las selecciones
			String realdestiny = "";//jugador
			String computerdestiny = "";//computadora

			//la computadora escoge su destino…
			int computer_choice;
			computer_choice = rng_jesus.nextInt(3)+1;

			//Se le asigna nombre a la selección de la computadora
			switch (computer_choice)
			{
				case 1:
				computerdestiny = "Piedra";
				break;

				case 2:
				computerdestiny = "Papel";
				break;

				case 3:
				computerdestiny = "Tijera";
				break;

			}
			System.out.print("\n\n");//separa el texto cause muh aesthetics

			//asigna nombre a selección de jugador y define el ganador.
			switch (destiny)
			{
				case 1://jugador escoge piedra
					realdestiny = "Piedra";
					System.out.println("Ha escogido: "+realdestiny+".");
					System.out.println("La computadora ha escogido: "+computerdestiny+".");
					switch (computer_choice)
					{
						case 1: //	ai escoge piedra
							System.out.println("Empate.");
							break;
						case 2: //	ai escoge papel
							System.out.println("Gana la computadora.");
							break;
						case 3: //	ai escoge tijera
							System.out.println("Gana el jugador.");
							break;	

					}	
						break;


				case 2://jugador escoge papel
					realdestiny = "Papel";
					System.out.println("Ha escogido: "+realdestiny+".");
					System.out.println("La computadora ha escogido: "+computerdestiny+".");
					switch (computer_choice)
					{
						case 1: //	ai escoge piedra
							System.out.println("Gana el jugador.");
							break;
						case 2: //	ai escoge papel
							System.out.println("Empate.");
							break;
						case 3: //	ai escoge tijera
							System.out.println("Gana la computadora.");
							break;	

					}
					break;


				case 3://jugador escoge tijera
					realdestiny = "Tijera";
					System.out.println("La computadora ha escogido: "+computerdestiny+".");
					System.out.println("Ha escogido: "+realdestiny+".");	

					switch (computer_choice)
					{
						case 1: //	ai escoge piedra
							System.out.println("Gana la computadora.");
							break;
						case 2: //	ai escoge papel
							System.out.println("Gana el jugador.");
							break;
						case 3: //	ai escoge tijera
							System.out.println("Empate.");
							break;	
					}
					break;
			}
			//¿otra vez?
			while(true)
			{
				System.out.print("\nOtra vez? "); 
				otravez = chooseUrDestiny.next().toUpperCase();
				if(!otravez.equals("SI") && !otravez.equals("NO"))
					System.out.print("Selección inválida.\n");
				else
					break;
			}

		}while (otravez.equals("SI"));
		//fin del "otravez"	
	}
}*/


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

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}

