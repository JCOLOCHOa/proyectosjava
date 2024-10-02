package PaqCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPanel extends JPanel {
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtResultado;
    private JComboBox<String> cbDepartamento;
    private JComboBox<String> cbAntiguedad;

    public PrincipalPanel() {
        setLayout(null);
        setBackground(Color.DARK_GRAY);

        
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\karyn\\OneDrive\\Documentos\\NetBeansProjects\\Parcial2\\src\\resourses\\icon.jpeg"); 
        Image originalImage = originalIcon.getImage();

       
        Image scaledImage = originalImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);


        JLabel lblImage = new JLabel(scaledIcon);
        lblImage.setBounds(10, 10, 150, 150); 
        add(lblImage);

       
        JLabel lblDigitalStore = new JLabel("DIGITAL STORE");
        lblDigitalStore.setFont(new Font("Arial", Font.BOLD, 48)); 
        lblDigitalStore.setForeground(Color.WHITE);
        lblDigitalStore.setBounds(200, 20, 400, 60); 
        lblDigitalStore.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblDigitalStore);

       
        JLabel lblTitulo = new JLabel("Cálculo de Días de Vacaciones");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24)); 
        lblTitulo.setBounds(200, 90, 400, 30); 
        lblTitulo.setForeground(Color.WHITE); 
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER); 
        add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(200, 130, 150, 30);
        lblNombre.setForeground(Color.WHITE); 
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(320, 130, 150, 30);
        txtNombre.setBackground(new Color(204, 153, 255)); 
        txtNombre.setForeground(Color.WHITE); 
        add(txtNombre);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(200, 170, 150, 30);
        lblApellidos.setForeground(Color.WHITE); 
        add(lblApellidos);

        txtApellidos = new JTextField();
        txtApellidos.setBounds(320, 170, 150, 30);
        txtApellidos.setBackground(new Color(204, 153, 255)); 
        txtApellidos.setForeground(Color.WHITE); 
        add(txtApellidos);

        JLabel lblDepartamento = new JLabel("Departamento:");
        lblDepartamento.setBounds(200, 210, 150, 30);
        lblDepartamento.setForeground(Color.WHITE); 
        add(lblDepartamento);

        cbDepartamento = new JComboBox<>(new String[]{"Atención al Cliente", "Logística", "Gerente"});
        cbDepartamento.setBounds(320, 210, 150, 30);
        cbDepartamento.setForeground(Color.WHITE); 
        cbDepartamento.setBackground(new Color(204, 153, 255)); 
        add(cbDepartamento);

        JLabel lblAntiguedad = new JLabel("Antigüedad (años):");
        lblAntiguedad.setBounds(200, 250, 150, 30);
        lblAntiguedad.setForeground(Color.WHITE); 
        add(lblAntiguedad);

        cbAntiguedad = new JComboBox<>(new String[]{"1", "2-6", "7+"});
        cbAntiguedad.setBounds(320, 250, 150, 30);
        cbAntiguedad.setForeground(Color.WHITE); 
        cbAntiguedad.setBackground(new Color(204, 153, 255)); 
        add(cbAntiguedad);

        JButton btnCalcular = new JButton("Calcular Vacaciones");
        btnCalcular.setBounds(200, 290, 190, 30);
        
         add(btnCalcular);

         txtResultado = new JTextField();
         txtResultado.setEditable(false);
         txtResultado.setBounds(400 ,290 ,150 ,30 );
         txtResultado.setBackground(new Color(204 ,153 ,255)); 
         txtResultado.setForeground(Color.WHITE); 
         add(txtResultado);

         btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularVacaciones();
            }
         });

         JButton btnLimpiar = new JButton("Limpiar");
         btnLimpiar.setBounds(200 ,330 ,100 ,30 );
         add(btnLimpiar);

         btnLimpiar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 limpiarCampos();
             }
          });

          JButton btnRegresar = new JButton("Regresar");
          btnRegresar.setBounds(350 ,330 ,100 ,30 );
          add(btnRegresar);

          btnRegresar.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  Main.showCard("Bienvenida");
              }
          });

          JLabel lblFooter = new JLabel("DIGITAL STORE - Estudiante: Jose Geovanny Colocho Arevalo - Curso: Programacion || - Sección: Seccion B");
          lblFooter.setBounds(50 ,500 ,700 ,30 );
          lblFooter.setForeground(Color.WHITE); 
          add(lblFooter);
    }

    private void calcularVacaciones() {
         String departamento = (String) cbDepartamento.getSelectedItem();
         String antiguedad = (String) cbAntiguedad.getSelectedItem();
         
         int diasVacaciones = calcularDias(departamento ,antiguedad);
         
         if(diasVacaciones >0){
             txtResultado.setText(diasVacaciones + " días de vacaciones.");
          }else{
              txtResultado.setText("Error en el cálculo.");
          }
     }

     private int calcularDias(String departamento ,String antiguedad) {
          switch (departamento) {
              case "Atención al Cliente":
                  switch (antiguedad) {
                      case "1":
                          return 6;
                      case "2-6":
                          return 14;
                      case "7+":
                          return 20;
                  }
                  break;
              case "Logística":
                  switch (antiguedad) {
                      case "1":
                          return 7;
                      case "2-6":
                          return 15;
                      case "7+":
                          return 22;
                  }
                  break;
              case "Gerente":
                  switch (antiguedad) {
                      case "1":
                          return 10;
                      case "2-6":
                          return 20;
                      case "7+":
                          return 30;
                  }
                  break;
          }
          return -1; 
      }

      private void limpiarCampos() {
          txtNombre.setText("");
          txtApellidos.setText("");
          cbDepartamento.setSelectedIndex(0);
          cbAntiguedad.setSelectedIndex(0);
          txtResultado.setText("");
      }
}