package org.gaba.lab_5;

public class QuotesFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.replaceAll("“", "«").replaceAll("”", "»");
    }
}
