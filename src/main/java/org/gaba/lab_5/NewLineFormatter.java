package org.gaba.lab_5;

public class NewLineFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.replaceAll("\n+", "\n");
    }
}
