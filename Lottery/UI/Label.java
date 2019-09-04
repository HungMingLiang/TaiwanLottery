package Lottery.UI;

import javax.swing.*;

public class Label {

    public Label(JPanel panel){

        JLabel wlabel=new JLabel("威力彩");
        wlabel.setBounds(33,0,50,50);

        JLabel dlabel=new JLabel("大樂透");
        dlabel.setBounds(133,0,50,50);

        JLabel flabel=new JLabel("今彩539");
        flabel.setBounds(233,0,50,50);

        JLabel glabel=new JLabel("刮刮樂");
        glabel.setBounds(333,0,50,50);


        panel.add(wlabel);
        panel.add(dlabel);
        panel.add(flabel);
        panel.add(glabel);

    }
}
