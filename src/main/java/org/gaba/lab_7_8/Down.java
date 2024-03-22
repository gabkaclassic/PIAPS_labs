package org.gaba.lab_7_8;

public class Down implements Move{
    @Override
    public int[] doStep(){
        return new int[]{0, 1};
    };
}
