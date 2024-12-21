import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.PlayGame\t2.Exit");
			System.out.print("Enter your Choice:");
			int ch=sc.nextInt();
			switch(ch){
			case 1:numberGuess();
				   break;
			case 2:System.exit(0);
			default:System.out.println("enter the correct menu....!!!!");
			}
		}	
	}
	public static void numberGuess(){
		int currentdif,score=10;
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int val=r.nextInt(100);
		for(int i=1;i<=10;i++){
			System.out.print("Enter you guess between 0 and 100:");
			int guess=sc.nextInt();
			if(guess>val){
				System.out.println("Too high....");
				score-=1;
			}else if(guess<val){
				System.out.println("Too low....");
				score-=1;
			}else{
				System.out.println("You won the Game!.....");
				System.out.println("After "+(10-score+1)+" you guessed number and you got "+(score*10)+"% score");
				break;
			}
			System.out.println(score+" is your remaining guess chances");
			if(score==0){
				System.out.println("You lost the Game, Better luck next time!...........");
			}
		}
	}
}