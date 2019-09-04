package Lottery.UI;

import javax.swing.*;

public class Ui {

    public Ui(JPanel panel){
        panel.setLayout(null);

        Label l=new Label(panel);
        Text t=new Text(panel);
        Button b=new Button(panel,t.getArea());

    }

}
