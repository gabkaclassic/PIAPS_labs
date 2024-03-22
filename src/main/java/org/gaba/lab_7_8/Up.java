package org.gaba.lab_7_8;

import java.awt.*;

public class Up implements Move{

    @Override
    public int[] doStep(){
        return new int[]{0, -1};
    };

}
