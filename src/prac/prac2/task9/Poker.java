package prac.prac2.task9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int cardsForPlayer = 5;
        int players = 0;
        String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
        int n = suits.length * rank.length;

        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол-во игроков: ");
            players = sc.nextInt();
            if((cardsForPlayer * players <=n) && (cardsForPlayer*players>0) ){
                break;
            }
            else{
                if(players == 0){
                    System.out.println("Game Over!");
                }
                else if(players < 0){
                    System.out.println("Число игроков не может быть меньше нуля!");
                }
                else{
                    System.out.println("Слишком много игроков!");
                }
            }
        }

        String[] deck = new String[n];
        for(int i=0; i< rank.length;i++){
            for(int j=0; j< suits.length; j++){
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        for(int i=0; i<n;i++){
            int r = i + (int)(Math.random()*(n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for(int i=0; i< players*cardsForPlayer;i++){
            System.out.println(deck[i]);
            if(i%cardsForPlayer == cardsForPlayer -1){
                System.out.println();
            }
        }
    }
}