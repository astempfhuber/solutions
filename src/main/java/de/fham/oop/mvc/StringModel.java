package de.fham.oop.mvc;

public class StringModel implements Model{
    private String text = "";

    public String getText() {
        return text;
    }

    public void countUp() {
        text = "Whatever";
    }
}
