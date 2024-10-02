package PaqCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  
public class BienvenidaPanel extends JPanel {
    private JTextField txtNombre;
  

    public BienvenidaPanel() {
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
        lblDigitalStore.setBounds(200, 160, 400, 60); 
        lblDigitalStore.setHorizontalAlignment(SwingConstants.CENTER); 
        add(lblDigitalStore);

      
        JLabel lblTitulo = new JLabel("Bienvenido a la Calculadora de Vacaciones");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 20)); 
        lblTitulo.setBounds(200, 230, 400, 30); 
        lblTitulo.setForeground(Color.WHITE); 
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER); 
        add(lblTitulo);

        JLabel lblNombre = new JLabel("Ingrese su nombre:");
        lblNombre.setBounds(200, 270, 200, 30);
        lblNombre.setForeground(Color.WHITE); 
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(350, 270, 150, 30);
        txtNombre.setBackground(new Color(204, 153, 255)); 
        txtNombre.setForeground(Color.WHITE); 
        add(txtNombre);

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(200, 320, 100, 30); 
        add(btnContinuar);

        btnContinuar.addActionListener((ActionEvent e) -> {
            if (txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese su nombre.");
            } else {
                Main.showCard("Terminos");
            }
        });

        JLabel lblFooter = new JLabel("DIGITAL STORE - Estudiante: Jose Geovanny Colocho Arevalo - Curso: Programacion || - Sección: Seccion B");
        lblFooter.setBounds(50, 500, 700, 30);
        lblFooter.setForeground(Color.WHITE); 
        add(lblFooter);
    }
    
    
}