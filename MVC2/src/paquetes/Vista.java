
package paquetes;



public class Vista extends javax.swing.JFrame {

    public Vista() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jButtonRestar = new javax.swing.JButton();
        jButtonSumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vista");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora MVC");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 260, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Numero 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 140, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Numero 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 130, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Resultado");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 80, 170, 30);

        jTextFieldNumero1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldNumero1);
        jTextFieldNumero1.setBounds(10, 80, 130, 31);

        jTextFieldResultado.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldResultado);
        jTextFieldResultado.setBounds(200, 120, 130, 28);

        jTextFieldNumero2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPanel1.add(jTextFieldNumero2);
        jTextFieldNumero2.setBounds(10, 150, 130, 31);

        jButtonRestar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonRestar.setText("Restar");
        jPanel1.add(jButtonRestar);
        jButtonRestar.setBounds(200, 210, 90, 31);

        jButtonSumar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonSumar.setText("Sumar");
        jPanel1.add(jButtonSumar);
        jButtonSumar.setBounds(80, 210, 90, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonRestar;
    public javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldNumero1;
    public javax.swing.JTextField jTextFieldNumero2;
    public javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
