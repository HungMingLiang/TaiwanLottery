package Lottery.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Lottery.Pl.play;

public class Button {

    public Button(JPanel panel,JTextArea tt){

        play p=new play();

        JButton wB=new JButton("產生");
        wB.setBounds(20,50,60,25);

        JButton dB=new JButton("產生");
        dB.setBounds(120,50,60,25);

        JButton fB=new JButton("產生");
        fB.setBounds(220,50,60,25);

        JButton gB=new JButton("產生");
        gB.setBounds(320,50,60,25);


        panel.add(wB);
        panel.add(dB);
        panel.add(fB);
        panel.add(gB);
        panel.add(tt);

        wB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               tt.setText(p.wPlay());
            }
        });

        dB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tt.setText(p.dPlay());
            }
        });

        fB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tt.setText(p.fPlay());
            }
        });

        gB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tt.setText(p.gPlay());
                }
        });

    }
}
