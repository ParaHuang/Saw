package day15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber extends JFrame{
    public static void main(String[] args) {
//        create a window
        GuessNumber window = new GuessNumber();
        window.setVisible(true);
    }
    private JTextField textField1;
    private JButton guessButton;
    private JButton restartButton;
    private JPanel panel;
    private int secret_number; //1~100
    //define a special method -> constructor
    public GuessNumber(){
        //set the size of window
        setSize(500,400);
        setContentPane(panel);

        Random random = new Random();
        secret_number = random.nextInt(1,101);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if you want anything happens when you click the button, you write it here
                //get the number out of input box
                String str = textField1.getText();
                //String->int
                int number = Integer.parseInt(str);
                //                  "12"        12
//                System.out.println(str+"-----"+number);
                if(number > secret_number){
//                    System.out.println("too big");
                    JOptionPane.showMessageDialog(GuessNumber.this,"too big");
                }else if(number < secret_number){
//                    System.out.println("too small");
                    JOptionPane.showMessageDialog(GuessNumber.this,"too small");
                }else{
//                    System.out.println("congratulations!!");
                    JOptionPane.showMessageDialog(GuessNumber.this,"congratulations!!!");
                }
            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secret_number = random.nextInt(1,101);
                textField1.setText(""); //empty the input box
            }
        });
    }
}
