package forPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class forPractice {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(5);
        int i;
        a.add(12);
        a.add(13);
        a.add(20);
        a.add(30);
        a.add(50);
        Scanner s1 = new Scanner(System.in);
        int data = s1.nextInt();
        for(i = 0;i<5;i++){
            if(a.get(i)== data){
                System.out.println("Index Found at " + i);
                break;
            }
        }
        if(i>4){
            System.out.println("Not Found");
        }
        
    }
    
}
