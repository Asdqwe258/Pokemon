import java.util.Scanner;
public class PokemonBattleSimulator{
        public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please choose the first Pokemon type: If you want to choose a Grass type press 1, if you want to choose a Fire type press 2, if you want to choose a Water type press 3");
        FirstPokemonType = keyboard.nextInt();
        System.out.print("Please choose the second Pokemon type: If you want to choose a Grass type press 1, if you want to choose a Fire type press 2, if you want to choose a Water type press 3");
        SecondPokemonType = keyboard.nextInt();
        int advantage = 0;
        if(FirstPokemonType == SecondPokemonType){
                advantage = 1;
        }
        if((FirstPokemonType == 1 && SecondPokemonType == 3)||(FirstPokemonType == 2 && SecondPokemonType == 1) || (FirstPokemonType == 3 && SecondPokemonType == 2)){
                advantage = 2;
        }
        if((FirstPokemonType == 3 && SecondPokemonType == 1)||(FirstPokemonType == 1 && SecondPokemonType == 2) || (FirstPokemonType == 2 && SecondPokemonType == 3))
                advantage = .5;
        }

