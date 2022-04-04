package com.rplbo.tocm;

public class Main_71200660 {
    public static double FeetIncToCm(int inch){
        double toCm = 0;
        if(inch<=0){
            return -1;
        }else if(inch > 12){
            double inchRemain = 0;
            double feetVal = 0;

            feetVal = inch/12;
            inchRemain = inch % 12;

            toCm += feetVal * 30.48;
            toCm += inchRemain * 2.54;

            System.out.println(inch + " inc = " + feetVal + " feet " + inchRemain + " inc");
        }else{
            FeetIncToCm(0,inch);
        }

        System.out.println("Nilai dalam centimeter: "+toCm + " cm");
        return toCm;
    }

    public static double FeetIncToCm(double feet, double inch){
        double toCm = 0;
        if(feet<=0 && inch <=0 && inch > 12){
            return -1;
        }else{
            toCm += feet * 30.48;
            toCm += inch * 2.54;
        }
        System.out.println("Nilai dalam centimeter: "+toCm + " cm");
        return toCm;
    }

    public static void main(String[] args) {
        double hasil1 = FeetIncToCm(12,5);
        double hasil2 = FeetIncToCm(30);


    }
}
