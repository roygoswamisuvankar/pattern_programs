import java.util.*;
class pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        int j = 5,k=2;
        for(int i=0;i<n;i++){
            sum = sum + j;
            System.out.print("\t"+j); 
            j = j*2+k;
            k++;
        }
        System.out.println("\nThe sum is : "+sum);
    }
}

/*
Enter range:
3
        5       12      27The sum is : 44

D:\java_programs>javac pattern1.java

D:\java_programs>java pattern1
Enter range:
6
        5       12      27      58      121     248
The sum is : 471

D:\java_programs>

*/
