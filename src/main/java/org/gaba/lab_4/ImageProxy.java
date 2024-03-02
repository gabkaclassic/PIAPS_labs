package org.gaba.lab_4;

import java.awt.*;

class ImageProxy implements Image {
    private RealImage image;
    private final String filename = "src/main/java/org/gaba/lab_4/Proxy.png";

    private int height, width;

    ImageProxy() {
        var image = new RealImage(filename);
        height = image.getHeight();
        width = image.getWidth();
    }

    public void loadImage() {
        image = new RealImage(filename);
    }

    public boolean isLoaded() {
        return image!= null;
    }

    @Override
    public void draw(Graphics g, int x, int y, Component c, boolean visible) {

        if (visible) {
            if(image == null) {
                image = new RealImage(filename);
            }
            image.draw(g, x, y, c, visible);
        }
        else {
            g.drawRect(x, y, width, height);
        }
    }
}
