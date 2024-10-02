package PaqCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerminosPanel extends JPanel {
    private JCheckBox chkAceptar;

    public TerminosPanel() {
        setLayout(null);
        setBackground(Color.DARK_GRAY);

        
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\karyn\\OneDrive\\Documentos\\NetBeansProjects\\Parcial2\\src\\resourses\\icon.jpeg"); 
        Image originalImage = originalIcon.getImage();

        
        Image scaledImage = originalImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        
        JLabel lblImage = new JLabel(scaledIcon);
        lblImage.setBounds(10, 10, 150, 150); 
        add(lblImage);

        JLabel lblTerminos = new JLabel("Términos y Condiciones");
        lblTerminos.setBounds(389, 20, 400, 30);
        lblTerminos.setForeground(Color.WHITE); 
        add(lblTerminos);

        JTextArea txtTerminos = new JTextArea("Al realizar una compra en Digital Store, usted acepta que todos los pedidos están sujetos a disponibilidad y confirmación del precio. Los métodos de pago aceptados incluyen tarjetas de crédito y PayPal. Tiene derecho a devolver productos dentro de los 14 días naturales tras la entrega, siempre que estén en su estado original. Nos comprometemos a proteger su información personal conforme a la legislación vigente. Para cualquier disputa, se aplicarán las leyes del país donde está registrada Digital Store.");
        txtTerminos.setBounds(200, 70, 500, 300);
        txtTerminos.setLineWrap(true);
        txtTerminos.setWrapStyleWord(true);
        txtTerminos.setEditable(false);
        txtTerminos.setBackground(new Color(204, 153, 255)); 
        txtTerminos.setForeground(Color.black); 
        add(txtTerminos);

        chkAceptar = new JCheckBox("Acepto los términos y condiciones");
        chkAceptar.setBounds(200, 390, 300, 30);
        chkAceptar.setForeground(Color.black); 
        add(chkAceptar);

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(200, 430, 100, 30);
        btnContinuar.setEnabled(false); 
        add(btnContinuar);

        chkAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnContinuar.setEnabled(chkAceptar.isSelected());
            }
        });

        btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.showCard("Principal");
            }
        });

        JButton btnNoAceptar = new JButton("No Aceptar");
        btnNoAceptar.setBounds(300, 430, 100, 30);
        add(btnNoAceptar);

        btnNoAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.showCard("Bienvenida");
            }
        });
        
        JLabel lblFooter = new JLabel("DIGITAL STORE - Estudiante: Jose Geovanny Colocho Arevalo - Curso: Programacion || - Sección: Seccion B");
        lblFooter.setBounds(50, 500, 700, 30);
        lblFooter.setForeground(Color.WHITE); 
        add(lblFooter);
    }
}