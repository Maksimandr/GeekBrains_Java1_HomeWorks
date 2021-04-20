package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWorkApp8 extends JFrame {

    private int valueX;
    private int valueY;

    public HomeWorkApp8(int initialValueX, int initialValueY) {

        setBounds(200, 200, 800, 200);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        setLayout(new GridLayout(2, 5));

        JButton decrementTenButtonX = new JButton("-10");
        decrementTenButtonX.setFont(font);
        add(decrementTenButtonX);

        JButton decrementButtonX = new JButton("<");
        decrementButtonX.setFont(font);
        add(decrementButtonX);

        JLabel counterValueViewX = new JLabel();
        counterValueViewX.setFont(font);
        counterValueViewX.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueViewX);
        valueX = initialValueX;
        counterValueViewX.setText(String.valueOf(valueX));

        JButton incrementButtonX = new JButton(">");
        incrementButtonX.setFont(font);
        add(incrementButtonX);

        JButton incrementTenButtonX = new JButton("+10");
        incrementTenButtonX.setFont(font);
        add(incrementTenButtonX);

        JButton decrementTenButtonY = new JButton("-10");
        decrementTenButtonY.setFont(font);
        add(decrementTenButtonY);

        JButton decrementButtonY = new JButton("<");
        decrementButtonY.setFont(font);
        add(decrementButtonY);

        JLabel counterValueViewY = new JLabel();
        counterValueViewY.setFont(font);
        counterValueViewY.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueViewY);
        valueY = initialValueY;
        counterValueViewY.setText(String.valueOf(valueY));

        JButton incrementButtonY = new JButton(">");
        incrementButtonY.setFont(font);
        add(incrementButtonY);

        JButton incrementTenButtonY = new JButton("+10");
        incrementTenButtonY.setFont(font);
        add(incrementTenButtonY);

        decrementButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX > 0) {
                    valueX--;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        decrementTenButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX > 9) {
                    valueX -= 10;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        incrementButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX < 100) {
                    valueX++;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        incrementTenButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX < 91) {
                    valueX += 10;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        decrementButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY > 0) {
                    valueY--;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        decrementTenButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY > 9) {
                    valueY -= 10;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        incrementButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY < 100) {
                    valueY++;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        incrementTenButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY < 91) {
                    valueY += 10;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        HomeWorkApp8 obj = new HomeWorkApp8(3, 3);
    }
}
