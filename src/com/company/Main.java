package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        int faktorial=1;
        for (int i = 1; i <=n; i++) {
            faktorial=faktorial*i;

        }
        System.out.println("Факториал "+n+" = "+faktorial);


        int a=2;
        System.out.print(a +" ") ;
        int end = 1000;
        while (a<=end){
            for (int i=2;i<a;i++){
                if (a%i==0){i=a;}
                else if (i==a-1){
                    System.out.print(a +" ") ;
                }
            }
            a++;
        }
        System.out.println() ;
        int b=1;

        while (b<=end){
            int k=0;
            for (int i=1;i<=b;i++){
                if (b%i==0){k++;}
            }
            if (k==2){
                System.out.print(b +" ") ;

            }

            b++;
        }
        System.out.println() ;


        int[] allArray = new int [end];
        for (int i=0; i<end-1; i++) {
            allArray[i]=i+2;
        }

        for (int i=0; i<end-1; i++) {
            if (allArray[i]!=0)
                for (int j=i+allArray[i]; j<end-1; j=j+allArray[i]){
                    allArray[j]=0;
                }
        }

        for (int i=0; i<end-1; i++) {
            if (allArray[i]!=0)
                System.out.print(allArray[i] +" ") ;
        }
    }

}
