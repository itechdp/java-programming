import java.util.Scanner;

public class caluclate_sum_1 {
    
    public static void main(String[] args) {

        int n=0;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any number:");
        n= sc.nextInt();

        if(n%2==0){
            System.out.println("The "+n+" is even");
        }

        else{
            System.out.println("The "+n+" is odd");
        }
        
    }
    
}
