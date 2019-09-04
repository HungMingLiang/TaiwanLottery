package Lottery.UI;

import javax.swing.*;
import java.awt.*;

public class Text {

    public Text(JPanel panel){



    }

    public JTextArea getArea(){

        JTextArea tt=new JTextArea();

        tt.setBounds(23,100,352,50);
        tt.setEditable(false);
        tt.setBackground(Color.WHITE);




        return tt;

    }

}

