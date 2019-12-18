package de.fham.oop.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Model model;
    View view;

    public static void main(String[] args) {
        new Controller();
    }

    public Controller(){
        model = new IntModel();
        view = new View(model, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.countUp();
        view.update();
    }
}
