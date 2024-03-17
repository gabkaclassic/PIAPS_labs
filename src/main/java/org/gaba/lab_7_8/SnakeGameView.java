package org.gaba.lab_7_8;

import java.awt.*;
import java.util.LinkedList;

public class SnakeGameView {
    public static void drawGame(int width, int height, Point snakeHead, LinkedList<Point> snakeBody, Point food) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (snakeHead.equals(new Point(x, y))) {
                    System.out.print("O");
                } else if (snakeBody.contains(new Point(x, y))) {
                    System.out.print("o");
                } else if (food.equals(new Point(x, y))) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}