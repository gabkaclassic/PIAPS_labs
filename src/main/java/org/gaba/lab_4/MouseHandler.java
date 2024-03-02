package org.gaba.lab_4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {

    private final EditorPanel panel;

    public MouseHandler(EditorPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3 && e.getClickCount() == 2) {
            panel.changeVisible();
            panel.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        panel.setBoxX(e.getX());
        panel.setBoxY(e.getY());
        panel.repaint();
    }
}