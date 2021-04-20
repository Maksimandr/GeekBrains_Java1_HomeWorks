package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * улучшенный счётчик, два параметра, можно увеличивать или уменьшать на 10, значения ограничены от 1 до 100
 */

public class HomeWorkApp8 extends JFrame {

    private int valueX;
    private int valueY;
    private static final int MIN_VALUE=1;
    private static final int MAX_VALUE=100;
    private static final int STEP_VALUE=10;

    public HomeWorkApp8(int initialValueX, int initialValueY) {

        setBounds(200, 200, 800, 200);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        setLayout(new GridLayout(2, 5));

        JButton decrementTenButtonX = new JButton("-" + STEP_VALUE);
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

        JButton incrementTenButtonX = new JButton("+" + STEP_VALUE);
        incrementTenButtonX.setFont(font);
        add(incrementTenButtonX);

        JButton decrementTenButtonY = new JButton("-" + STEP_VALUE);
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

        JButton incrementTenButtonY = new JButton("+" + STEP_VALUE);
        incrementTenButtonY.setFont(font);
        add(incrementTenButtonY);

        decrementButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX > MIN_VALUE) {
                    valueX--;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        decrementTenButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX > MIN_VALUE + (STEP_VALUE - 1)) {
                    valueX -= STEP_VALUE;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        incrementButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX < MAX_VALUE) {
                    valueX++;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        incrementTenButtonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueX < MAX_VALUE - (STEP_VALUE - 1)) {
                    valueX += STEP_VALUE;
                }
                counterValueViewX.setText(String.valueOf(valueX));
            }
        });

        decrementButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY > MIN_VALUE) {
                    valueY--;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        decrementTenButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY > MIN_VALUE + (STEP_VALUE - 1)) {
                    valueY -= STEP_VALUE;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        incrementButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY < MAX_VALUE) {
                    valueY++;
                }
                counterValueViewY.setText(String.valueOf(valueY));
            }
        });

        incrementTenButtonY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (valueY < MAX_VALUE - (STEP_VALUE - 1)) {
                    valueY += STEP_VALUE;
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
