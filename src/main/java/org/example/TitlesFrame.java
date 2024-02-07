package org.example;

import javax.swing.*;
import java.awt.*;

public class TitlesFrame extends JFrame {
    public TitlesFrame() {
        this.initUI();
    }

    private void initUI() {
        this.setTitle("Криві фігури");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Задаємо значення кольорів та товщини через статичні поля ShapeFactory
        ShapeFactory.fillColor = Color.blue;
        ShapeFactory.strokeColor = Color.red;
        ShapeFactory.strokeWidth = 5;

        this.add(new TitlesPanel(38));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
        });
    }
}
