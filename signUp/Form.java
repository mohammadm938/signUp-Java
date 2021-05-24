package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form implements ActionListener {

    JFrame frame;
    JTextField textFieldName;
    JTextField textFieldFirstAddress;
    JTextField textFieldSecendAddress;
    JTextField textFieldAge;
    JTextField textFieldHeight;
    JTextField textFieldWeight;
    JButton button;
    String[] allInformation = new String[6]; // for save information on textField

    public Form() {

    }

    public void setupAndShow() {
        frame = new JFrame("Signup Form");
        frame.setSize(400, 600);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }

    public void createAndShowFormLabel() {
        //Create textFields
        textFieldName = new JTextField();
        textFieldFirstAddress = new JTextField();
        textFieldSecendAddress = new JTextField();
        textFieldAge = new JTextField();
        textFieldHeight = new JTextField();
        textFieldWeight = new JTextField();

        //Get Size and place that textFields need to show
        textFieldName.setBounds(40, 70, 320, 36);
        textFieldFirstAddress.setBounds(40, 126, 320, 36);
        textFieldSecendAddress.setBounds(40, 182, 320, 36);
        textFieldAge.setBounds(40, 238, 320, 36);
        textFieldHeight.setBounds(40, 294, 320, 36);
        textFieldWeight.setBounds(40, 350, 320, 36);

        //Values of textFields Like PlaceHolder
        textFieldName.setText("نام...");
        textFieldFirstAddress.setText("آدرس اول ...");
        textFieldSecendAddress.setText("آدرس دوم ...");
        textFieldAge.setText("سن ...");
        textFieldHeight.setText("قد ...");
        textFieldWeight.setText("وزن ...");

        //Font Size
        textFieldName.setFont(new Font("Arial", Font.PLAIN, 16));
        textFieldFirstAddress.setFont(new Font("Arial", Font.PLAIN, 16));
        textFieldSecendAddress.setFont(new Font("Arial", Font.PLAIN, 16));
        textFieldAge.setFont(new Font("Arial", Font.PLAIN, 16));
        textFieldHeight.setFont(new Font("Arial", Font.PLAIN, 16));
        textFieldWeight.setFont(new Font("Arial", Font.PLAIN, 16));

        //To Show it on App
        frame.add(textFieldName);
        frame.add(textFieldFirstAddress);
        frame.add(textFieldSecendAddress);
        frame.add(textFieldAge);
        frame.add(textFieldHeight);
        frame.add(textFieldWeight);
    }

    public void createAndShowButton() {
        button = new JButton();
        button.addActionListener(this);
        button.setBounds(140, 406, 120, 50);
        button.setText("ثبت نام");
        button.setBackground(Color.WHITE);//Background Color
        button.setFont(new Font("Arial", Font.PLAIN, 18)); //Font Size and Style
        button.setBorder(new LineBorder(Color.black)); //Border
        button.setForeground(Color.BLUE); // Font Color
        frame.add(button);
    }

    public void forShowAllThings() {
        // Impotent you must call it on the Main on End Lind before (}) of public Main
        // باید اخرین تابع صدا زده بشه وگرنه برنامه باگ میگیره
        // که همه ایتم نشون نمیده باید روشون بزنید تا نشون بده
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //Insert Value to an Array
        this.allInformation[0] = textFieldName.getText();
        this.allInformation[1] = textFieldFirstAddress.getText();
        this.allInformation[2] = textFieldSecendAddress.getText();
        this.allInformation[3] = textFieldAge.getText();
        this.allInformation[4] = textFieldWeight.getText();
        this.allInformation[5] = textFieldHeight.getText();
        // Pass the Array to the Validation Class to validate and show by constructor class
        Validating validatingClass = new Validating(this.allInformation);
    }
}