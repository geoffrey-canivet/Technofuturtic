package test;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test {
    private static int nbBalles = 0;
    private static boolean statusPannier = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lanceur de Balles de Tennis");
        JPanel panel = new JPanel();
        JTextField inputField = new JTextField(10);
        JButton launchButton = new JButton("Lancer Balles");
        JTextArea outputArea = new JTextArea(10, 30);

        outputArea.setEditable(false);
        panel.add(new JLabel("Nombre de balles :"));
        panel.add(inputField);
        panel.add(launchButton);
        panel.add(new JScrollPane(outputArea));

        launchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (statusPannier) {
                    try {
                        nbBalles = Integer.parseInt(inputField.getText());
                        lancerBalles(nbBalles, outputArea);
                    } catch (NumberFormatException ex) {
                        outputArea.append("Veuillez entrer un nombre valide.\n");
                    }
                } else {
                    outputArea.append("Il n'y a plus de balles dans le panier.\n");
                }
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void lancerBalles(int nbBalles, JTextArea outputArea) {
        if (nbBalles > 0) {
            for (int i = 0; i < nbBalles; i++) {
                outputArea.append("Lancé " + (i + 1) + "\n");
            }
            outputArea.append("Nombre de balles lancées : " + nbBalles + "\n");
            statusPannier = false; // Panier vide après le lancement
        } else {
            outputArea.append("Aucune balle à lancer.\n");
        }
    }
}
