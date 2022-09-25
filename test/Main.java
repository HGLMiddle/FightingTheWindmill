package test;

import test.characters.*;

import javax.swing.*;
import java.util.Random;

public class Main
{
    public static GlobalFlags FLAGS = new GlobalFlags();
    public static Character selectRandomEnemy()
    {
        switch (new Random().nextInt(3))
        {
            case 0:
                return new Chicken();
            case 1:
                return new Roboball();
            case 2:
                return new Seagull();
            default:
                return null;
        }
    }
    public static void main(String[] arg)
    {
        JFrame frame = new JFrame("title");
        JLabel label = new JLabel("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,70);

        //进行一亿次随机红格
        double death_counter = 0;
        Suguri suguri = new Suguri(3);
//      for(int j = 1; j <= 460; j++)
//      {
            for (int i = 1; i <= 10000; i++)
            {
                suguri.battleWith(selectRandomEnemy(), 1);
                if (!suguri.isAlive)
                {
                    death_counter++;
                }
                suguri.reset();
            }
//      }
        System.out.println(death_counter);
        label.setText(String.valueOf(death_counter));
        JButton button = new JButton();
        button.addActionListener(new Interceptor1());
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
