package com.company;

import javax.swing.*;

public class Validating {
    private String[] error = new String[5]; //For save Errors
    private String Name = "";
    private String FirstAddress = "";
    private boolean VAddress = false; //For don't write a validation code for secendAddress
    private String SecendAddress = "";
    private int Age = 0;
    private int Height = 0;
    private int Weight = 0;

    public Validating(String[] allInformation) {
        //Set and Validate of Values
        setName(allInformation[0]);
        setFirstAddress(allInformation[1], allInformation[2]);
        setAge(Integer.parseInt(allInformation[3]));
        setWeight(Integer.parseInt(allInformation[4]));
        setHeight(Integer.parseInt(allInformation[5]));
        returnInformation(); // For print Errors or Information
    }

    public void returnInformation() {
        //For chek we have Errors or not
        boolean isErrorNull = true;
        for (String index : error) {
            if (index != null) {
                isErrorNull = false;
            }
        }

        //Chek if we have Errors it Print Errors
        //Or
        //If we haven't any Errors it print Information
        if (isErrorNull == false) {
            for (String index : error) {
                if (index != null) {
                    System.out.println(index);
                }
            }
        } else {
            System.out.println("Name : " + getName());
            System.out.println("FirstAddress : " + getFirstAddress());
            System.out.println("SecendAddress : " + getSecendAddress());
            System.out.println("Age : " + getAge());
            System.out.println("Height : " + getHeight());
            System.out.println("Weight : " + getWeight());
        }
    }

    public String getName() {
        if (Name.equals("")) {
            return this.error[0];
        } else {
            return this.Name;
        }
    }

    public void setName(String name) {
        if (name.length() > 3) {
            this.Name = name;
        } else {
            this.error[0] = "نام شما کمتر از سه کاراکتر است !!";
        }
    }

    public String getFirstAddress() {
        if (VAddress == true) {
            return this.FirstAddress;
        } else {
            return this.error[1];
        }
    }

    public void setFirstAddress(String firstAddress, String secendAddress) {
        if (firstAddress.equals(secendAddress)) {
            this.error[1] = "آدرس اول و دوم نمی تواند یکی باشند!!";
        } else {
            this.FirstAddress = firstAddress;
            this.SecendAddress = secendAddress;
            this.VAddress = true;
        }
    }

    public String getSecendAddress() {
        if (VAddress == true) {
            return this.SecendAddress;
        } else {
            return this.error[1];
        }
    }


    public String getAge() {
        if (this.Age != 0) {
            return this.Age + "";
        } else {
            return error[2];
        }
    }

    public void setAge(int age) {
        if (age > 18) {
            this.Age = age;
        } else {
            this.error[2] = "سن شما کمتر از سن قانونی هست و امکان ثبت نام وجود ندارد!!";
        }
    }

    public String getHeight() {
        if (this.Height == 0) {
            return this.error[3];
        } else {
            return this.Height + "";
        }
    }

    public void setHeight(int height) {
        if (height > 100) {
            this.Height = height;
        } else {
            this.error[3] = "قد شما کمتر از 100 می باشد!!";
        }
    }

    public String getWeight() {
        if (this.Weight == 0) {
            return this.error[4];
        } else {
            return this.Weight + "";
        }
    }

    public void setWeight(int weight) {
        if (weight > 40) {
            this.Weight = weight;
        } else {
            this.error[4] = "وزن شما کمتر از 40 می باشد !!";
        }
    }
}
