package org.gaba.lab_5;

import java.util.Arrays;
import java.util.List;

public class TextFormatter implements Formatter {

    private final List<Formatter> nonTerminalFormatters;

    public TextFormatter(Formatter ... nonTerminalFormatters) {
        this.nonTerminalFormatters = Arrays.stream(nonTerminalFormatters).toList();
    }

    @Override
    public String format(String text) {
        var result = text;
        for(var formatter: nonTerminalFormatters)
            result = formatter.format(result);
        return result;
    }
}
