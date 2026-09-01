package tp2.pkgnew;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String hnumber = String.valueOf((int)(Math.random() * 900) + 100);
        Window window = new Window();
        window.setVisible(true);
        window.hnum = hnumber;
    }
    
}