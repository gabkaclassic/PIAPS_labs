package org.gaba.lab_7_8;

public class Mover {
    Move move;

    public void setMove(Move move) {
        this.move = move;
    }

    public int[] executeMove(){
        return move.doStep();
    }
}
