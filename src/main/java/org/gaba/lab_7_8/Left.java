package org.gaba.lab_7_8;

public class Left implements Move{
    @Override
    public int[] doStep(){
        return new int[]{-1, 0};
    };
}
