
import java.util.*;

public class Main{

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int num = sc.nextInt();

        if(num % 2 == 0){
            flag = true;
        }else{
            flag = false;
        }

        System.out.println(flag);
    }
}