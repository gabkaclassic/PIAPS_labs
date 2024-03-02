package org.gaba.lab_4;

import javax.swing.*;
import java.awt.*;

public class EditorPanel extends JPanel {
    private Image image;
    private int boxX = 50;
    private int boxY = 50;

    private boolean visibleImage;

    public EditorPanel() {
        image = new ImageProxy();
        var handler = new MouseHandler(this);
        addMouseListener(handler);
        addMouseMotionListener(handler);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        image.draw(g, boxX, boxY, this, visibleImage);
    }

    public void setBoxX(int boxX) {
        this.boxX = boxX;
    }

    public void setBoxY(int boxY) {
        this.boxY = boxY;
    }

    public Image getImage() {
        return image;
    }

    public void changeVisible() {
        this.visibleImage = !this.visibleImage;
    }
}
