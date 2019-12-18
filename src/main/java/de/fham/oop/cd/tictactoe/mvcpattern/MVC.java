package de.fham.oop.cd.tictactoe.mvcpattern;

import javax.swing.*;

public class MVC {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(MVCView::new);
    }
}