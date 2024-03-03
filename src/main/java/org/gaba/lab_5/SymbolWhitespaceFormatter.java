package org.gaba.lab_5;

public class SymbolWhitespaceFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.replaceAll("\\( ", "(")
                .replaceAll(" \\)", ")")
                .replaceAll(" \\.", ".")
                .replaceAll(" ,", ",");
    }
}
