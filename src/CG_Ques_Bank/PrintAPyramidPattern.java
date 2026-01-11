package CG_Ques_Bank;

import java.util.Scanner;

public class PrintAPyramidPattern {

   public static void main(String[] args) {
        /*        *
                * * *
              * * * * *
         */


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            int star=2*i-1;
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
