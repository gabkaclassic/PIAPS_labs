package org.gaba.lab_7_8;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Food {
    public Point coordinates;

    public Point toPoint(){
        return new Point(coordinates.x, coordinates.y);
    }

    public void generateFood(int width, int height, LinkedList<Point> snake ) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(width);
            y = random.nextInt(height);
        } while (snake.contains(new Point(x, y)));
        coordinates = new Point(x, y);
    }
}
