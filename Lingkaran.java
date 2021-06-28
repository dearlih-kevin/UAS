import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lingkaran");
        frame.setContentPane(new Lingkaran().LingkaranPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel LingkaranPanel;
    private JTextField tfJariJari;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;
    private JTextField tfLuas;

    public Lingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jariJari, luas;
                double pi = 3.14;

                //mengambil inputan dari text field
                jariJari = Double.parseDouble(tfJariJari.getText());

                //hitung luas
                luas = pi * (jariJari * jariJari);

                //menaruh luas
                tfLuas.setText(String.valueOf(luas));
            }
        });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfJariJari.setText("");
                tfLuas.setText("");
                tfJariJari.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
