package org.gaba.lab_5;

public class DashesFormatter implements Formatter {
    @Override
    public String format(String text) {
        return text.replaceAll("-", "—");
    }
}
