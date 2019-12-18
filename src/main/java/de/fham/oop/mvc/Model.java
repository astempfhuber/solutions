package de.fham.oop.mvc;

public class Model {
    private String text = "Whatever";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text != null) {
            this.text = text;
        }
    }
}
