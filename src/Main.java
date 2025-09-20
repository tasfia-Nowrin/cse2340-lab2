import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("STEP 1: Enter number of people: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("STEP 2: Enter the ages of people: ");
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("STEP 3: Enter minimum age required to vote: ");
        int X = sc.nextInt();
        int count = 0;
        for(int age : A){
           if(age >= X){
              count++;
           }
       }
       System.out.println("Number of eligible voters: " + count);
       sc.close();
   }
}
