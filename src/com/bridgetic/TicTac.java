package com.bridgetic;
import java.util.*;
public class TicTac {
        public static void main(String[] args) {
            UC1();
            chooseLetter();
        }
        public static void UC1(){
            String [] board = new String[10];
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
}

