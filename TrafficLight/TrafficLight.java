import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TrafficLight extends JFrame implements ActionListener {
    String msg = "";
    private JLabel label;
    private JTextField display;
    private JRadioButton r1, r2, r3;
    private ButtonGroup bg;
    private Container c;

    public TrafficLight() {
        setLayout(new FlowLayout());
        c = getContentPane();
        label = new JLabel("Traffic Light");
        display = new JTextField(10);
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("GREEN");
        r3 = new JRadioButton("YELLOW");
        bg = new ButtonGroup();
        c.add(label);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(display);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        setSize(400, 400);
        setVisible(true);
        c.setBackground(Color.pink);
    }

    public void actionPerformed(ActionEvent ie) {
        msg = ie.getActionCommand();
        if (msg.equals("RED")) {
            c.setBackground(Color.RED);
            display.setText(msg + " :TURN ON");
        } else if (msg.equals("GREEN")) {
            c.setBackground(Color.GREEN);
            display.setText(msg + ":TURN ON");
        } else if (msg.equals("YELLOW")) {
            c.setBackground(Color.YELLOW);
            display.setText(msg + " :TURN ON");
        }
    }

    public static void main(String args[]) {
        TrafficLight light = new TrafficLight();
        light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}