package PaqCalculadora;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static JFrame frame;
    private static CardLayout cardLayout;
    private static JPanel mainPanel;

    public static void main(String[] args) {
        frame = new JFrame("Calculadora de Vacaciones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
       

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new BienvenidaPanel(), "Bienvenida");
        mainPanel.add(new TerminosPanel(), "Terminos");
        mainPanel.add(new PrincipalPanel(), "Principal");

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void showCard(String card) {
        cardLayout.show(mainPanel, card);
    }
}