/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score;

/**
 *
 * @author George Aziz
 */
public class Score {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /**
     * Takes a digit score then calculate the letter score based on it
     * @param digitScore the digit score that will determine the letter score
     * @return the letter score based on the digit score
     */
    public static char toLetterScore(double digitScore){
        if (90 <= digitScore && digitScore <= 100) {
            return 'A';
        } 
        else if (80 <= digitScore && digitScore < 90){
            return 'B';
        }
        else if (70 <= digitScore && digitScore < 80){
            return 'C';
        }
        else if (60 <= digitScore && digitScore < 70){
            return 'D';
        }
        else {
            return 'F';
        }
    }
    /**
     * Takes a letter then based on this letter it will print a message with a 
     * switch structure
     * @param letterScore the letter inputed 
     */
    public static void printMessageSwitch(char letterScore){
        switch (letterScore) {
            case 'A':
            case 'a':
                System.out.print("Excellent");
                break;
            case 'B':
            case 'b':
            case 'C':
            case 'c':
                System.out.print("Well done");
                break;
            case 'D':
            case 'd':
                System.out.print("Passed");
                break;
            default:
                System.out.print("Better try again");
        }
    }
    /**
     * Takes a letter then based on this letter it will print a message with a 
     * if else structure
     * @param letterScore the letter inputed 
     */
    public static void printMessage(char letterScore){
        if (letterScore == 'A' || letterScore == 'a') {
            System.out.print("Excellent");
        } 
        else if (letterScore == 'B' || letterScore == 'b' || letterScore == 'C' 
                || letterScore == 'c'){
            System.out.print("Well done");
        }
        else if (letterScore == 'D' || letterScore == 'd'){
            System.out.print("Passed");
        }
        else {
            System.out.print("Better try again");
        }
    }
}
