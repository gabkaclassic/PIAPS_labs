package org.gaba.lab_6;

public class Deanery extends AbstractObserverSubject {

    private final String title;

    public Deanery(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Deanery [title='%s']", title);
    }
}
