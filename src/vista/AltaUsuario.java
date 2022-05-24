package vista;

import controlador.GestionRol;
import controlador.GestionUsuario;
import java.awt.Color;
import java.util.List;
import modelo.Rol;

public class AltaUsuario extends javax.swing.JPanel {
    FondoPanel fondo = new FondoPanel();
    GestionUsuario gestionUsuario = new GestionUsuario();
    private GestionRol gestionRol = new GestionRol();
    private List<Rol> lista;
    private Rol rol;
    
    public AltaUsuario() {
        initComponents();
        this.rol = new Rol();
        idRoles();
    }
    
    private void idRoles() {
        this.lista = gestionRol.lista();
        this.lista.stream().forEach(rol 
                -> cbxRolUsuarioAlta.addItem(rol.getNombre()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panDatosUsuarioAlta = new javax.swing.JPanel();
        lblNombreUsuarioAlta = new javax.swing.JLabel();
        lblRolUsuarioAlta = new javax.swing.JLabel();
        txtNombreUsuarioAlta = new javax.swing.JTextField();
        btnRegistrarAltaUsuario = new javax.swing.JButton();
        lblClaveAccesoUsuarioAlta = new javax.swing.JLabel();
        lblConfirmaClaveAccesoUsuarioAlta = new javax.swing.JLabel();
        cbxRolUsuarioAlta = new javax.swing.JComboBox<>();
        txtClaveAccesoUsuarioAlta = new javax.swing.JPasswordField();
        txtConfirmaClaveAccesoUsuarioAlta = new javax.swing.JPasswordField();
        lblTituloUsuarioAlta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(8, 83, 148));

        panDatosUsuarioAlta.setBackground(new java.awt.Color(182, 215, 168));
        panDatosUsuarioAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panDatosUsuarioAlta.setOpaque(false);

        lblNombreUsuarioAlta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreUsuarioAlta.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuarioAlta.setText("Nombre");

        lblRolUsuarioAlta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRolUsuarioAlta.setForeground(new java.awt.Color(255, 255, 255));
        lblRolUsuarioAlta.setText("Rol");

        btnRegistrarAltaUsuario.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarAltaUsuario.setText("Registrar");
        btnRegistrarAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAltaUsuarioActionPerformed(evt);
            }
        });

        lblClaveAccesoUsuarioAlta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClaveAccesoUsuarioAlta.setForeground(new java.awt.Color(255, 255, 255));
        lblClaveAccesoUsuarioAlta.setText("Contraseña");

        lblConfirmaClaveAccesoUsuarioAlta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmaClaveAccesoUsuarioAlta.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmaClaveAccesoUsuarioAlta.setText("Confirme contraseña");

        txtClaveAccesoUsuarioAlta.setText("jPasswordField1");

        txtConfirmaClaveAccesoUsuarioAlta.setText("jPasswordField2");

        javax.swing.GroupLayout panDatosUsuarioAltaLayout = new javax.swing.GroupLayout(panDatosUsuarioAlta);
        panDatosUsuarioAlta.setLayout(panDatosUsuarioAltaLayout);
        panDatosUsuarioAltaLayout.setHorizontalGroup(
            panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosUsuarioAltaLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosUsuarioAltaLayout.createSequentialGroup()
                        .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panDatosUsuarioAltaLayout.createSequentialGroup()
                                .addComponent(lblRolUsuarioAlta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxRolUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDatosUsuarioAltaLayout.createSequentialGroup()
                                .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreUsuarioAlta)
                                    .addComponent(lblClaveAccesoUsuarioAlta)
                                    .addComponent(lblConfirmaClaveAccesoUsuarioAlta))
                                .addGap(41, 41, 41)
                                .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConfirmaClaveAccesoUsuarioAlta)
                                    .addComponent(txtNombreUsuarioAlta)
                                    .addComponent(txtClaveAccesoUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosUsuarioAltaLayout.createSequentialGroup()
                        .addComponent(btnRegistrarAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
        );
        panDatosUsuarioAltaLayout.setVerticalGroup(
            panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosUsuarioAltaLayout.createSequentialGroup()
                .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosUsuarioAltaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreUsuarioAlta))
                        .addGap(48, 48, 48)
                        .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClaveAccesoUsuarioAlta)
                            .addComponent(txtClaveAccesoUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panDatosUsuarioAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfirmaClaveAccesoUsuarioAlta)
                            .addComponent(txtConfirmaClaveAccesoUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(cbxRolUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDatosUsuarioAltaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRolUsuarioAlta)))
                .addGap(38, 38, 38)
                .addComponent(btnRegistrarAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        lblTituloUsuarioAlta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloUsuarioAlta.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloUsuarioAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloUsuarioAlta.setText("Alta de Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloUsuarioAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panDatosUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloUsuarioAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDatosUsuarioAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAltaUsuarioActionPerformed

    }//GEN-LAST:event_btnRegistrarAltaUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAltaUsuario;
    private javax.swing.JComboBox<String> cbxRolUsuarioAlta;
    private javax.swing.JLabel lblClaveAccesoUsuarioAlta;
    private javax.swing.JLabel lblConfirmaClaveAccesoUsuarioAlta;
    private javax.swing.JLabel lblNombreUsuarioAlta;
    private javax.swing.JLabel lblRolUsuarioAlta;
    private javax.swing.JLabel lblTituloUsuarioAlta;
    private javax.swing.JPanel panDatosUsuarioAlta;
    private javax.swing.JPasswordField txtClaveAccesoUsuarioAlta;
    private javax.swing.JPasswordField txtConfirmaClaveAccesoUsuarioAlta;
    private javax.swing.JTextField txtNombreUsuarioAlta;
    // End of variables declaration//GEN-END:variables
}
