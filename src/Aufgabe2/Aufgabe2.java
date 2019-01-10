package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Aufgabe2 {

    public static void main(String[] args) {

        int arraylaenge = Integer.parseInt(JOptionPane.showInputDialog("Gib die Laenge des Arrays bitte ein"));
        int[] array = new int[arraylaenge];

        Random random = new Random();

        for(int i = 0; i < size; i++)
        {
            Random random1 = new Random();

            array[i] = random1.nextInt(1000);
        }

        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }


    }
}
