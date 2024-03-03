package org.gaba.lab_5;

public class WhitespacesFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.replaceAll("[ ]+", " ");
    }
}
