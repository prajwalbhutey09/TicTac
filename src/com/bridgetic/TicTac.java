package com.bridgetic;
import java.util.*;
public class TicTac {
    static Scanner sc =new Scanner(System.in);
    static String[] board=new String[10];
        public static void main(String[] args) {
            UC1();
            chooseLetter();
            UC3showboard();
        }
        public static void UC1(){
            for(int i = 1; i< board.length; i++){
                board[i] = String.valueOf(i);
            }
        }

    // uc 1
    public static void chooseLetter(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please choose your letter for playing (X or O)\nType letter & press Enter to continue");
   String playletter =sc.next();
   if (playletter.equals("x")){
       System.out.println("you chose X \n Now Computer will play with O");
   }
   else if (playletter.equals("o")){
       System.out.println("you chose X \n Now Computer will play with X");
   }
   else {
       System.out.println("Invalid Input");
    }
    }

    public static void UC3showboard(){
        System.out.println("| " +board[1] + " | " +board[2]+ " | " +board[3]+ " |\n-------------");
        System.out.println("| " +board[4] + " | " +board[5]+ " | " +board[6]+ " |\n-------------");
        System.out.println("| " +board[7] + " | " +board[8]+ " | " +board[9]+ " |\n-------------");
    }


}

