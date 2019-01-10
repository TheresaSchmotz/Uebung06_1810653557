package Aufgabe3;

import javax.swing.*;
import java.util.Random;

public class Aufgabe3 {

    public static void main(String[] args) {

        Random random2 = new Random();
        int[] array = new int[100];


        for (int i = 0; i < array.length; i++)
            array[i] = random2.nextInt(1000);

        while (true)
        {
            String indexinput = JOptionPane.showInputDialog("Gib mir einen Index");
            if (!isNumeric(indexinput))
            {
                break;
            }

            int index = Integer.parseInt(indexinput);
            int result = JOptionPane.showConfirmDialog(null, "Value is: " + array[index], "Bestätige", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION)
            {
                int newValue = Integer.parseInt(JOptionPane.showInputDialog("Gib einen neunen Wert an"));
                array[index] = newValue;
            }
        }
    }

    private static boolean isNumeric(String s)
    {
        try
        {
            int zahl = Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
    }
    }
