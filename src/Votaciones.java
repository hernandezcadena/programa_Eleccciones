import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Votaciones extends javax.swing.JFrame {


    public Votaciones() {
        initComponents();
         Votaciones Objvotaciones= new Votaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtced = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lstcan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lstpar = new javax.swing.JComboBox<>();
        btninsertar = new javax.swing.JToggleButton();
        btnenlistar = new javax.swing.JToggleButton();
        btneliminar = new javax.swing.JToggleButton();
        btnconsultar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VOTACIONES PARA PRECIDENTE");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CEDULA :");

        txtced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedActionPerformed(evt);
            }
        });

        jLabel4.setText("CANDIDATO :");

        lstcan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "voto en Blanco", "Gustavo Petro", "Sergio Fajardo", "German Vargas Lleras", "Juan Carlos Pinzon", "Humberto de la Calle" }));
        lstcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstcanActionPerformed(evt);
            }
        });

        jLabel5.setText("PARTIDO :");

        lstpar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "voto en blanco", "alianza verde", "partido liberal", "partido de la U", "movimiento politico MIRA" }));

        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btnenlistar.setText("ENLISTAR");
        btnenlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenlistarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnom)
                            .addComponent(txtced)
                            .addComponent(lstcan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lstpar, 0, 154, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btninsertar)
                        .addGap(18, 18, 18)
                        .addComponent(btnenlistar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconsultar)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lstcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lstpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar)
                    .addComponent(btnenlistar)
                    .addComponent(btneliminar)
                    .addComponent(btnconsultar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        Electores per =new Electores ();
      per.insertarElectores(Integer.parseInt(txtced.getText()), txtnom.getText(),lstcan.getSelectedItem().toString(),lstpar.getSelectedItem().toString());
    }//GEN-LAST:event_btninsertarActionPerformed

    private void txtcedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedActionPerformed
        
    }//GEN-LAST:event_txtcedActionPerformed

    private void btnenlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenlistarActionPerformed
        Electores per=new Electores();
        String lista = per.listarElectores();
        JOptionPane.showMessageDialog(null, lista);
    }//GEN-LAST:event_btnenlistarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Electores per = new Electores(); 
    int  identificacion = Integer.parseInt(txtced.getText());
    boolean lista = per.eliminarElectores(identificacion,"","","");
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
         Electores cli = new Electores();  
    int  identificacion = Integer.parseInt(txtced.getText());
    String lista = cli.consultarElectores(identificacion,"","","");
    JOptionPane.showMessageDialog(null, lista);
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void lstcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstcanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstcanActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Votaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnconsultar;
    private javax.swing.JToggleButton btneliminar;
    private javax.swing.JToggleButton btnenlistar;
    private javax.swing.JToggleButton btninsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> lstcan;
    private javax.swing.JComboBox<String> lstpar;
    private javax.swing.JTextField txtced;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables

  
}
