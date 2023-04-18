import java.util.Scanner;
import java.util.Random;
class Game{
    int m,n;
    int noOfGuess=0;
//    public int getNoOfGuess() {
//        return noOfGuess;
//    }
//    public void setNoOfGuess(int noOfGuess) {
//        this.noOfGuess = noOfGuess;
//    }
    public Game(){
        Random r=new Random();
        n=r.nextInt(100);
    }
    public void takeUserNo(){
        System.out.println("enter your guess...");
        Scanner s=new Scanner(System.in);
        m=s.nextInt();
    }
    public boolean isCorrect() {
        noOfGuess++;
        if (n ==m) {
            System.out.format("you guessed right,it was %d \ngussed in %d attempts",n,noOfGuess);
            return true;
        }
        else if(n>m){
            System.out.println("low no...");
        }
        else if(n<m){
            System.out.println("high no...");
        }
        return false;
    }
}
public class GuessTheNo {
    public static void main(String[] args) {
        Game o=new Game();
        boolean b=false;
        while (! b) {
            o.takeUserNo();
            b = o.isCorrect();
        }
    }
}
