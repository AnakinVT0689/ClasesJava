
package desafionavidenio1.igu;

import desafionavidenio1.logica.Controladora;

public class Principal extends javax.swing.JFrame {

    Controladora control = new Controladora();
    String emoji;
    String matriz[][] = new String [4][4];
    int cantEncontrados;
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPapaNoel = new javax.swing.JButton();
        btnEstrella = new javax.swing.JButton();
        btnArbolito = new javax.swing.JButton();
        btnRegalo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMatrizDibujada = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmojiElegido = new javax.swing.JTextField();
        txtCantidadElegida = new javax.swing.JTextField();
        txtEncontrados = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adivinanza Navideña");

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de veces que cree que aparece el personaje");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Elija su personaje: ");

        btnPapaNoel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnPapaNoel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavidenio1/imagenes/papanoel64x64.png"))); // NOI18N
        btnPapaNoel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapaNoelActionPerformed(evt);
            }
        });

        btnEstrella.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavidenio1/imagenes/estrella64x64.png"))); // NOI18N
        btnEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrellaActionPerformed(evt);
            }
        });

        btnArbolito.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnArbolito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavidenio1/imagenes/arbol64x64.png"))); // NOI18N
        btnArbolito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolitoActionPerformed(evt);
            }
        });

        btnRegalo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnRegalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavidenio1/imagenes/regalo64x64.png"))); // NOI18N
        btnRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegaloActionPerformed(evt);
            }
        });

        txtMatrizDibujada.setEditable(false);
        txtMatrizDibujada.setColumns(20);
        txtMatrizDibujada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        txtMatrizDibujada.setRows(5);
        jScrollPane1.setViewportView(txtMatrizDibujada);

        btnReset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavidenio1/imagenes/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Elegido:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Encontrados:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Resultado:");

        txtEmojiElegido.setEditable(false);
        txtEmojiElegido.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtEmojiElegido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmojiElegidoActionPerformed(evt);
            }
        });

        txtCantidadElegida.setEditable(false);

        txtEncontrados.setEditable(false);

        txtResultado.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidadElegida, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(txtEmojiElegido))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtEncontrados, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmojiElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadElegida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPapaNoel)
                        .addGap(55, 55, 55)
                        .addComponent(btnEstrella)
                        .addGap(52, 52, 52)
                        .addComponent(btnArbolito)
                        .addGap(52, 52, 52)
                        .addComponent(btnRegalo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstrella)
                    .addComponent(btnArbolito)
                    .addComponent(btnRegalo)
                    .addComponent(btnPapaNoel))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtEmojiElegidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmojiElegidoActionPerformed

    }//GEN-LAST:event_txtEmojiElegidoActionPerformed

    private void btnPapaNoelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapaNoelActionPerformed
        emoji = "🎅";
        completarDatos(emoji);
        
    }//GEN-LAST:event_btnPapaNoelActionPerformed

    private void btnEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrellaActionPerformed
        emoji = "⭐";
        completarDatos(emoji);
    }//GEN-LAST:event_btnEstrellaActionPerformed

    private void btnArbolitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolitoActionPerformed
         emoji = "🎄";
         completarDatos(emoji);
    }//GEN-LAST:event_btnArbolitoActionPerformed

    private void btnRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegaloActionPerformed
         emoji = "🎁";
         completarDatos(emoji);
    }//GEN-LAST:event_btnRegaloActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCantidad.setText("");
        txtCantidadElegida.setText("");
        txtEmojiElegido.setText("");
        txtEncontrados.setText("");
        txtMatrizDibujada.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void completarDatos (String emoji){
        int cantidad = Integer.parseInt(txtCantidad.getText());

        if (cantidad >= 0 && cantidad <= 16) {
            matriz = control.generarMatriz();
            cantEncontrados = control.determinarCantidadEmoji(emoji, cantidad, matriz);

            txtEncontrados.setText(String.valueOf(cantEncontrados));
            txtEmojiElegido.setText(emoji);
            txtCantidadElegida.setText(String.valueOf(cantidad));

            if (cantEncontrados == cantidad) {
                txtResultado.setText("Acerto!!!");
            } else {
                txtResultado.setText("Fallo!!!");
            }
            
            dibujarMatriz(matriz);
            
        } else {
            //cartel de aviso
        }
    }
    
    
    public void dibujarMatriz(String matriz[][]) {
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {

                txtMatrizDibujada.setText(txtMatrizDibujada.getText() + matriz[f][c] + "");

            }
            txtMatrizDibujada.setText(txtMatrizDibujada.getText() + "\n");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbolito;
    private javax.swing.JButton btnEstrella;
    private javax.swing.JButton btnPapaNoel;
    private javax.swing.JButton btnRegalo;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadElegida;
    private javax.swing.JTextField txtEmojiElegido;
    private javax.swing.JTextField txtEncontrados;
    private javax.swing.JTextArea txtMatrizDibujada;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
