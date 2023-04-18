import java.util.Random;
import java.util.Scanner;
public class rock_paper_scisor {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int u=3;
        System.out.println("Lets play the game : ");
        System.out.println("0->rock\n1->paper\n2->scisor");
        System.out.print("your play is : ");
        int P2=s.nextInt();
        System.out.print("computer play is : ");
        int P1=r.nextInt(u);
        System.out.println(P1);
        if(P1==P2){
            System.out.println("Tye :");
        }
        else if (P1==0 && P2==1 || P1==1 && P2==2 || P1==2 && P2==0) {
            System.out.println("You win : ");
        }
        else if (P1==0 && P2==2 || P1==1 && P2==0 || P1==2 && P2==1) {
            System.out.println("computer win : ");
        }
        else {
            System.out.println("invalid entry : ");
        }
    }
}
