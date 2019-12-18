package de.fham.oop.mvc;

public class IntModel implements Model{
    private int text = 0;

    public String getText() {
        return Integer.toString(text);
    }

    public void countUp() {
        if (text < 30) {
            text++;
        }
    }
    public void whatever() {

    }
}
