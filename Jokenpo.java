package jokenpo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static int choose_computer(){
        
        Random random = new Random();
        int computer = random.nextInt(3);
        
        return computer;   
    } 
    
    public static int choose_player(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vamos jogar JOKENPÔ!");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");

        int player = input.nextInt();
        
        return player;
    }
    
    public static void winner(){
        
        List list = new ArrayList();
        list.add("Pedra");
        list.add("Papel");
        list.add("Tesoura");
                
        int player_result = choose_player();
        int computer_result = choose_computer();

        if(computer_result == player_result){
            System.out.println("Player escolheu: "+list.get(player_result));
            System.out.println("Computer escolheu: "+list.get(computer_result));
            System.out.println("Empate");
        }else if((computer_result == 0 && player_result == 1)|| 
                (computer_result == 1 && player_result == 2) ||
                (computer_result == 2 && player_result == 0)){
            System.out.println("Player escolheu: "+list.get(player_result));
            System.out.println("Computer escolheu: "+list.get(computer_result));
            System.out.println("Você Ganhou");
        }else{
            System.out.println("Player escolheu: "+list.get(player_result));
            System.out.println("Computer escolheu: "+list.get(computer_result));
            System.out.println("Computer Ganhou");
        }    
    }

    public static void main(String[] args) {
        winner();
    } 
}
