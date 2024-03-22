package org.gaba.lab_7_8;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGameModel {
    private final int width;
    private final int height;
    private final LinkedList<Point> snake;
    private Food apple;

    public SnakeGameModel(int width, int height) {
        this.width = width;
        this.height = height;
        snake = new LinkedList<>();
        snake.add(new Point(width / 2, height / 2));
        AbstractFactory factory = new AbstractFactory();
        AppleFactory concreteFactory = factory.getAppleFactory();
        apple = concreteFactory.create();
        apple.generateFood(width, height, snake);



    }

    public Point getSnakeHead() {
        return snake.getFirst();
    }

    public void moveSnake(Direction direction) {
        Point newHead = new Point(getSnakeHead());
        Mover mover = new Mover();
        switch (direction) {
            case UP:
                mover.setMove(new Up());
                break;
            case DOWN:
                mover.setMove(new Down());
                break;
            case LEFT:
                mover.setMove(new Left());
                break;
            case RIGHT:
                mover.setMove(new Right());
                break;
        }
        int[] temp = mover.executeMove();
        newHead.translate(temp[0], temp[1]);

        if (newHead.equals(apple.toPoint())) {
            snake.addFirst(newHead);
            apple.generateFood(width, height, snake);
        } else {
            snake.addFirst(newHead);
            snake.removeLast();
        }
    }


    public Point getFood() {
        return apple.toPoint();
    }

    public boolean isGameOver() {
        Point head = getSnakeHead();
        return head.x < 0 || head.x >= width || head.y < 0 || head.y >= height || snake.subList(1, snake.size()).contains(head);
    }

    public LinkedList<Point> getSnakeBody() {
        return new LinkedList<>(snake.subList(1, snake.size()));
    }
}
