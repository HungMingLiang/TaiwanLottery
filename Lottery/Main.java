package Lottery;

import Lottery.UI.*;

import javax.swing.*;

public class Main {


    public static void main(String[] args){


        JFrame frame = new JFrame("Lottery WinWin");
        frame.setSize(420, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        Ui ui=new Ui(panel);
        frame.add(panel);
        frame.setVisible(true);
    }



}
