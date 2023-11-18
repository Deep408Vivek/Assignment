package Assignment;
import java.util.*;
public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number till which you want to print series : ");
        
        for(int i = 2; i <= n; i++){
            int prev = i - 1;
            int next = i + 1;
            int prevPrime = 1;
            int nextPrime = 1;

            for(int j = 2; j <= Math.sqrt(prev); j++){
                if(prev % j == 0){
                    prevPrime = 0;
                    break;
                }
            }

            for(int k = 2; k <= Math.sqrt(next); k++){
                if(next % k == 0){
                    nextPrime = 0;
                    break;
                }
            }

            if(prevPrime == 1 && nextPrime == 1){
                System.out.print(" "+i);
            }
        }
    }
}
