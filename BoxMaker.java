
import java.util.Scanner;

public class BoxMaker
{
public static void main(String[] args) {
 Scanner Sc = new Scanner(System.in);   
 System.out.println("Input x");
 int x = Sc.nextInt();
 System.out.println("Input Y");
 int y = Sc.nextInt();
 BoxMaker(x,y);
}

public static int BoxMaker(int x,int y){
    for(int i = 0; i < y; i++){
       for(int z = 0; z < x; z++){
         System.out.print("$");  
        }
        System.out.println("");
    }
    return x;
 }

}
