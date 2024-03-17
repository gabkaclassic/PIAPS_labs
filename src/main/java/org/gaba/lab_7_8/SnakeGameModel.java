package org.gaba.lab_7_8;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGameModel {
    private final int width;
    private final int height;
    private final LinkedList<Point> snake;
    private Point food;

    public SnakeGameModel(int width, int height) {
        this.width = width;
        this.height = height;
        snake = new LinkedList<>();
        snake.add(new Point(width / 2, height / 2));
        generateFood();
    }

    public Point getSnakeHead() {
        return snake.getFirst();
    }

    public void moveSnake(Direction direction) {
        Point newHead = new Point(getSnakeHead());
        switch (direction) {
            case UP:
                newHead.translate(0, -1);
                break;
            case DOWN:
                newHead.translate(0, 1);
                break;
            case LEFT:
                newHead.translate(-1, 0);
                break;
            case RIGHT:
                newHead.translate(1, 0);
                break;
        }

        if (newHead.equals(food)) {
            snake.addFirst(newHead);
            generateFood();
        } else {
            snake.addFirst(newHead);
            snake.removeLast();
        }
    }

    private void generateFood() {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(width);
            y = random.nextInt(height);
        } while (snake.contains(new Point(x, y)));
        food = new Point(x, y);
    }

    public Point getFood() {
        return food;
    }

    public boolean isGameOver() {
        Point head = getSnakeHead();
        return head.x < 0 || head.x >= width || head.y < 0 || head.y >= height || snake.subList(1, snake.size()).contains(head);
    }

    public LinkedList<Point> getSnakeBody() {
        return new LinkedList<>(snake.subList(1, snake.size()));
    }
}
