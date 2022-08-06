import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aluno {
    private JTextField txtaluno;
    private JTextField txtNota1;
    private JButton calcularButton;
    private JTextField txtNota2;
    private JTextField txtNota3;
    private JTextField txtTotal;
    private JTextField txtMedia;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aluno");
        frame.setContentPane(new Aluno().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Aluno() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,tot;
                double avg;

                m1 = Integer.parseInt(txtNota1.getText());
                m2 = Integer.parseInt(txtNota2.getText());
                m3 = Integer.parseInt(txtNota3.getText());

                tot = m1 + m2 + m3;

                txtTotal.setText(String.valueOf(tot));

                avg = tot/3;

                txtMedia.setText(String.valueOf(avg));




            }
        });
    }
}
