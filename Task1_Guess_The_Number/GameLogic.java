import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    static int gen_number(){
        Random random = new Random();
        int num = random.nextInt(50) ;
        return num;
    }
    static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int gen = gen_number();
        for(int i=5 ; i!=0 ; i--){
            System.out.println("Enter your number");
            int guess = sc.nextInt();

            if (guess == gen){
                System.out.println("You guess it correctly, YOU WON!");
                cnt++;
                break;
            }else if (guess > gen){
                System.out.println("You entered a bigger number");
            }else if (guess < gen){
                System.out.println("You entered a smaller number");
            }
            System.out.println("Attempts left : "+i);
        }
        if (cnt == 0){
            System.out.println("You loose the game, The correct answer is :"+gen);
        }
    }

}
