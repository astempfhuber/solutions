package de.fham.oop.mvc;

import javax.swing.*;

public class View extends JPanel {

    Model model;
    JButton jButton;
    JLabel jLabel;
    JFrame jFrame;

    public View(Model model, Controller controller){
        this.model = model;

        jFrame = new JFrame("MVC");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 200);


        jButton = new JButton("Hit me");
        jButton.addActionListener(controller);
        jButton.setSize(100, 50);
        jButton.setVisible(true);
        jFrame.add(jButton);

        jLabel = new JLabel();
        jFrame.setVisible(true);
        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

    public void update(){
        jLabel.setText(model.getText());
    }

}
