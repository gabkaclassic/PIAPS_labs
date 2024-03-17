package org.gaba.lab_7_8;

import java.awt.*;
import java.util.LinkedList;

public class SnakeGameController {
    private final SnakeGameModel model;

    public SnakeGameController(int width, int height) {
        model = new SnakeGameModel(width, height);
    }

    public void update(Direction direction) {
        model.moveSnake(direction);
    }

    public boolean isGameOver() {
        return model.isGameOver();
    }

    public Point getSnakeHead() {
        return model.getSnakeHead();
    }

    public LinkedList<Point> getSnakeBody() {
        return model.getSnakeBody();
    }

    public Point getFood() {
        return model.getFood();
    }
}
