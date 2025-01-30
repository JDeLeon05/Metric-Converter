import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class MetricConverter{
    Scanner scnr = new Scanner(System.in);
    public void main(String args[]) throws Exception{
        Menu();

      
    }

    public void Menu(){
        //program informs the user on how it functions and gives instructions on how to use it
        System.out.println("Welcome to Metric Converter, this app will convert different metrics");
        System.out.println("Simply request a certain conversion based on our options, input a value,");
        System.out.println("and the program will convert it");
        System.out.println("");

        //program gives user 4 options based between 4 different metric conversions
        System.out.println("Our following options are below, to choose one, simply input the corresponding number:");
        System.out.println("1. Miles and Kilometers");
        System.out.println("2. Fahrenheit and Celsius");
        System.out.println("3. Pounds and Kilograms");
        System.out.println("4. Feet and Meters");

        //user inputs an answer based on the options
        int answer = scnr.nextInt();
        System.out.println("");
        switch (answer) {
            case 1:
                MilesKilometers();
                break;
            case 2:
                FahrenheitCelsius();
                break;
            case 3:
                PoundsKilograms();
                break;
            default :
                FeetMeters();
                break;
        }

        System.out.println("");

        Restart();
    }

    public void FahrenheitCelsius(){
        //variables
        Float output;
        Float input;

        //program asks user which way to convert
        System.out.println("You have chosen Fahrenheit and Celsius. But more specifically,");
        System.out.println("would you like to convert:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int answer = scnr.nextInt();
        System.out.println("");
        
        //program asks user for a value to convert
        System.out.print("Now enter the amount you'd like to convert: ");
        input = scnr.nextFloat();

        if(answer == 1){
            //program converts Fahrenheit to Celsius and prints out the value
            output = (input - 32f)  / 1.8f;
            System.out.println(input + " degrees Fahrenheit is equal to " + output + " degrees Celsius");
        }else{
            //program converts Celsius to Fahrenheit and prints out the value
            output = (input * 1.8f) + 32f;
            System.out.println(input + " degrees Celsius is the same as " + output + " Fahrenheit");
        }

    }

    public void MilesKilometers(){
        //variables
        Float output;
        Float input;

        //program asks user which way to convert
        System.out.println("You have chosen miles and kilometers. But more specifically,");
        System.out.println("would you like to convert:");
        System.out.println("1. Miles to Kilometers");
        System.out.println("2. Kilometers to Miles");
        int answer = scnr.nextInt();
        System.out.println("");
        
        //program asks user for a value to convert
        System.out.print("Now enter the amount you'd like to convert: ");
        input = scnr.nextFloat();

        if(answer == 1){
            //program converts from Miles to Kilometers
            output = input * 1.6094f;

            System.out.println(input + " Miles is equals " + output + " Kilometers");
        }else{
            //program converts from Kilometers to Miles
            output = input / 1.6094f;
            System.out.println(input + " Kilometers is the equivalent of " + output + " Miles");
        }

    }

    public void PoundsKilograms(){
        //variables
        Float output;
        Float input;

        //program asks user which way to convert
        System.out.println("You have chosen Pounds and Kilograms. But more specifically,");
        System.out.println("would you like to convert:");
        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        int answer = scnr.nextInt();
        System.out.println("");
        
        //program asks user for a value to convert
        System.out.print("Now enter the amount you'd like to convert: ");
        input = scnr.nextFloat();

        if(answer == 1){
            //program converts from Pounds to Kilograms
            output = input / 2.2046f;

            System.out.println(input + " Pounds is equals " + output + " Kilograms");
        }else{
            //program converts from Kilograms to Pounds
            output = input * 2.2046f;
            System.out.println(input + " Kilograms is the equivalent of " + output + " Pounds");
        }

    }

    public void FeetMeters(){
        //variables
        Float output;
        Float input;

        //program asks user which way to convert
        System.out.println("You have chosen Feet and Meters. But more specifically,");
        System.out.println("would you like to convert:");
        System.out.println("1. Feet to Meters");
        System.out.println("2. Meters to Feet");
        int answer = scnr.nextInt();
        System.out.println("");
        
        //program asks user for a value to convert
        System.out.print("Now enter the amount you'd like to convert: ");
        input = scnr.nextFloat();

        if(answer == 1){
            //program converts from Feet to Meters
            output = input / 3.2808f;

            System.out.println(input + " Feet is similar to " + output + " Meters");
        }else{
            //program converts from Meters to Feet
            output = input * 3.2808f;
            System.out.println(input + " Meters is the of equal value to " + output + " Feet");
        }
    }

    public void Restart(){
        //program asks user wether or nat they'd like to go a gain, starts the program over if they respond with 1
        System.out.println("Would you like to go again? if so, press 1");
        int answer = scnr.nextInt();

        if(answer == 1){
            Menu();
        }else{
            System.out.println("thanks for playing!");
        }
    }
}