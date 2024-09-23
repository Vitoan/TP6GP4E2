
package Vistas;
import Clases.Categoria;
import Clases.Producto;
import Clases.Inventario;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.ToolTipManager;
import javax.swing.table.DefaultTableModel;


public class Supermercado extends javax.swing.JFrame {
public static Inventario Gestion = new Inventario(); //TreeSet donde se guardan los productos
private DefaultTableModel modelo = new DefaultTableModel(){
@Override
    public boolean isCellEditable(int f, int c){
        return false;
    }
};

    /**
     * Creates new form Supermercado
     */
    public Supermercado() {
        initComponents();
        cargarComboBox();
        bloquearCampos(Contenedor);
        armarCabeceraTabla();
        ToolTipManager.sharedInstance().setInitialDelay(0);
        jbEliminar.setToolTipText("Seleccione el código del producto.");
        jbActualizar.setToolTipText("Seleccione el código del producto.");
        jbEliminar.setEnabled(false);
        jbActualizar.setEnabled(false);
        jbGuardar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/Iconos/psychedelic.jpg"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g) {
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        principal = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbCategoriaBuscar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMenu = new javax.swing.JTable();
        Contenedor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerStock = new javax.swing.JSpinner();
        jcbRubro = new javax.swing.JComboBox<>();
        tfPrecio = new java.awt.TextField();
        tfDescripcion = new java.awt.TextField();
        tfCodigo = new java.awt.TextField();
        jbBuscar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buscarNombre = new javax.swing.JMenuItem();
        buscarPrecio = new javax.swing.JMenuItem();
        buscarRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        principal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        principal.setTitle(" De todo S.A.: Productos");
        principal.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Filtrar por Categoria:");

        jcbCategoriaBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbCategoriaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaBuscarActionPerformed(evt);
            }
        });

        tablaMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMenu);

        Contenedor.setBackground(new java.awt.Color(204, 204, 204));
        Contenedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Rubro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Stock:");

        jSpinnerStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerStock.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jcbRubro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerStock, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbBuscar)
                                .addGroup(ContenedorLayout.createSequentialGroup()
                                    .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel4))))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jbNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-producto-usado-50.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-caja-de-producto-de-pelo-corto-50.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-marca-doble-30.png"))); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-eliminar-50.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal.getContentPane());
        principal.getContentPane().setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminar))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcbCategoriaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoriaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        escritorio.setLayer(principal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 677, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 206, Short.MAX_VALUE))
        );

        jMenu1.setText("Administración");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        buscarNombre.setText("por Nombre...");
        buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreActionPerformed(evt);
            }
        });
        jMenu2.add(buscarNombre);

        buscarPrecio.setText("por Precio...");
        buscarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(buscarPrecio);

        buscarRubro.setText("por Rubro...");
        buscarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRubroActionPerformed(evt);
            }
        });
        jMenu2.add(buscarRubro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (tfCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código primero");
            return;
        }
        int codigo = Integer.parseInt(tfCodigo.getText());
        Producto p = Gestion.buscarProducto(codigo);
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Producto no encontrado.");
        } else {
            tfDescripcion.setText(p.getDescripción());
            tfPrecio.setText("" + p.getPrecio());
            jcbRubro.setSelectedItem(p.getCategoria());
            jSpinnerStock.setValue(p.getStock());
            JOptionPane.showMessageDialog(this, "Hubo una coincidencia.");
        }
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        if (validarCamposVacios(Contenedor)) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos primero");
            return;
        }
        try {//controlamos que el usuario ingrese datos correctamente.
            Actualizar();
            borrarTabla();
            filtrar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error. Ingrese los datos según corresponda.");
            limpiarCampos(Contenedor);
        }
        limpiarCampos(Contenedor);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreActionPerformed
        ListadoPorPrecio p = new ListadoPorPrecio();
        ListadoPorRubro r = new ListadoPorRubro();
        p.setVisible(false);
        r.setVisible(false);
        escritorio.repaint();
        ListadoPorNombre l = new ListadoPorNombre();
        l.setVisible(true);
        escritorio.add(l);
        escritorio.moveToFront(l);
    }//GEN-LAST:event_buscarNombreActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        activarCampos(Contenedor);
        jbGuardar.setEnabled(true);
        Gestion.remover();
        limpiarCampos(Contenedor);
        filtrar();

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (validarCamposVacios(Contenedor)) {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos correctamente");
            limpiarCampos(Contenedor);
            return;
        }
        try { //controlamos que el usuario ingrese datos correctamente.
            int codigo = Integer.parseInt(tfCodigo.getText());
            String descripcion = tfDescripcion.getText();
            double precio = Double.parseDouble(tfPrecio.getText());
            Categoria c = (Categoria) jcbRubro.getSelectedItem();
            int stock = (Integer) jSpinnerStock.getValue();
            Producto p = new Producto(codigo, descripcion, precio, stock, c);
            Gestion.agregarProducto(p);
            filtrar();

        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Error. Ingrese los datos según corresponda.");
            limpiarCampos(Contenedor);
        }
        jbEliminar.setEnabled(true);
        jbActualizar.setEnabled(true);
        limpiarCampos(Contenedor);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        eliminarProducto();
        borrarTabla();
        filtrar();
        limpiarCampos(Contenedor);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcbCategoriaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaBuscarActionPerformed
        filtrar();
    }//GEN-LAST:event_jcbCategoriaBuscarActionPerformed

    private void buscarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrecioActionPerformed
        escritorio.repaint();
        ListadoPorPrecio l = new ListadoPorPrecio();
        l.setVisible(true);
        escritorio.add(l);
        escritorio.moveToFront(l);
    }//GEN-LAST:event_buscarPrecioActionPerformed

    private void buscarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRubroActionPerformed
        
        escritorio.repaint();
        ListadoPorRubro l = new ListadoPorRubro();
        l.setVisible(true);
        escritorio.add(l);
        escritorio.moveToFront(l);
    }//GEN-LAST:event_buscarRubroActionPerformed

  
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
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supermercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JMenuItem buscarNombre;
    private javax.swing.JMenuItem buscarPrecio;
    private javax.swing.JMenuItem buscarRubro;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<Categoria> jcbCategoriaBuscar;
    private javax.swing.JComboBox<Categoria> jcbRubro;
    private javax.swing.JInternalFrame principal;
    private javax.swing.JTable tablaMenu;
    private java.awt.TextField tfCodigo;
    private java.awt.TextField tfDescripcion;
    private java.awt.TextField tfPrecio;
    // End of variables declaration//GEN-END:variables
//Cargamos las ComboBox con las categorias correspondientes.
    private void cargarComboBox() {
        for (Categoria c : Categoria.values()) {
            jcbCategoriaBuscar.addItem(c);
            jcbRubro.addItem(c);
            // No seleccionar ninguna opción por defecto
            jcbCategoriaBuscar.setSelectedIndex(-1);
            jcbRubro.setSelectedIndex(-1);
        }
    }

    private void armarCabeceraTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        tablaMenu.setModel(modelo);
    }

    private void borrarTabla() {
        int f = tablaMenu.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

//Cargamos la tabla según el rubro que seleccionemos en la ComboBox.
    private void filtrar() {
        Categoria c = (Categoria) jcbCategoriaBuscar.getSelectedItem();
        if (c == null) {
            return; // Si no hay ninguna categoría seleccionada, no hacer nada.
        }

        modelo.setRowCount(0);    // Limpiar la tabla antes de mostrar los productos filtrados
        for (Producto p : Gestion.getInv()) {
            if (p.getCategoria().equals(c)) {
                modelo.addRow(new Object[]{p.getCodigo(), p.getDescripción(), p.getPrecio(), p.getStock(), p.getCategoria()});
            }
        }
    }

//Recorremos el JPanel y si el componente es un TextField lo deshabilita.
    private void bloquearCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof TextField) {
                TextField t = (TextField) c;

                t.setEnabled(false);
            }
        }
    }

//Recorremos el JPanel y si el componente es un TextField lo habilita.
    private void activarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof TextField) {
                TextField t = (TextField) c;

                t.setEnabled(true);
            }
        }

    }

//Recorremos el JPanel y si hay un TextField vacío devuelve true, caso contrario devuelve false.
    private boolean validarCamposVacios(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof TextField) {
                TextField t = (TextField) c;
                if (t.getText().trim().isEmpty()) {
                    return true; //devuelve true si hay algun campo vacio
                }
            }

        }
        return false; //devuelve false todos los campos estan llenos
    }

//Recorre el JPanel y limpia los componentes.
    private void limpiarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof TextField) {
                TextField t = (TextField) c;
                t.setText("");

            } else if (c instanceof JComboBox) {
                JComboBox cb = (JComboBox) c;
                cb.setSelectedIndex(0);
            } else if (c instanceof JSpinner) {
                JSpinner s = (JSpinner) c;
                s.setValue(1);
            }
        }
    }

//Elimina los productos segun el código.
    private void eliminarProducto() {
        try{
        int row = tablaMenu.getSelectedRow(); //Obtenemos la ubicacion exacta del código seleccionado.
        int col = tablaMenu.getSelectedColumn();
        if (col != 0) { //Como todos los códigos se encuentran en la columna 0, si a col se le asigna otro número saldrá un mensaje.
            JOptionPane.showMessageDialog(this, "Debes seleccionar el código del producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         //Obtenemos el valor usando row y col, y se lo asignamos a una variable
        int codigo = (Integer) tablaMenu.getValueAt(row, col);
        Gestion.borrarProducto(codigo); //Borramos producto del TreeSet
        modelo.removeRow(tablaMenu.getSelectedRow()); //Borramos producto de la tabla
        
        }catch(ArrayIndexOutOfBoundsException | ClassCastException e){
            JOptionPane.showMessageDialog(this, "Debes seleccionar el código del producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

       

    }

//Modifica un producto a travéz del código.
    private void Actualizar() {
        Producto p = null;
       try{
            int row = tablaMenu.getSelectedRow();
            int col = tablaMenu.getSelectedColumn();
            int cod = (Integer) tablaMenu.getValueAt(row, col);
            p = Gestion.buscarProducto(cod);
        if (col != 0) { //Como todos los códigos se encuentran en la columna 0, si a col se le asigna otro número saldrá un mensaje.
            JOptionPane.showMessageDialog(this, "Debes seleccionar el código del producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
       }catch(ArrayIndexOutOfBoundsException | ClassCastException e){
            JOptionPane.showMessageDialog(this, "Debes seleccionar el código del producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (p == null) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR);
            return;
        }
        for (Producto prod : Gestion.getInv()) {
            if (prod.equals(p)) {
                try {
                    int codigo = Integer.parseInt(tfCodigo.getText());
                    String descripcion = tfDescripcion.getText();
                    double precio = Double.parseDouble(tfPrecio.getText());
                    Categoria c = (Categoria) jcbRubro.getSelectedItem();
                    int stock = (Integer) jSpinnerStock.getValue();
                    Gestion.modificarProd(prod, codigo, descripcion, precio, stock, c);
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(this, "Error. Ingrese los datos según corresponda.");
                    limpiarCampos(Contenedor);
                }
            }
        }
    }

}


