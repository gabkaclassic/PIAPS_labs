package org.gaba.lab_5;

public class TabularFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.replaceAll("\t", "    ");
    }
}
