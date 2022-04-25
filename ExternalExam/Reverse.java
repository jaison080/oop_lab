import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener {
    JButton b1;
    JTextField tx, tx1;
    JLabel l1, l2;
    Container c;

    Frame() {
        c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("Enter the String");
        l1.setBounds(50, 100, 200, 50);
        c.add(l1);

        tx = new JTextField();
        tx.setBounds(200, 100, 150, 30);
        c.add(tx);

        l2 = new JLabel("Reversed");
        l2.setBounds(50, 150, 150, 50);
        c.add(l2);

        tx1 = new JTextField();
        tx1.setBounds(200, 150, 150, 30);
        c.add(tx1);

        b1 = new JButton("REVERSE");
        b1.addActionListener(this);
        b1.setBounds(150, 200, 100, 50);
        c.add(b1);

    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str == "REVERSE") {
            String s = tx.getText();
            int i = s.length() - 1;
            int start, end = i + 1;
            String result = "";

            while (i >= 0) {
                if (s.charAt(i) == ' ') {
                    start = i + 1;
                    while (start != end)
                        result += s.charAt(start++);

                    result += ' ';

                    end = i;
                }
                i--;
            }

            start = 0;
            while (start != end)
                result += s.charAt(start++);
            tx1.setText(result);
        }
        if (str == "Cancel") {
            System.exit(0);
        }
    }

}

class Reverse {
    public static void main(String args[]) {
        Frame f = new Frame();

        f.setTitle("REVERSE");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}