package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sayi1=220;
        int sayi2=284;
        int[] carpanlar = new int[sayi1];
        int index1=0;
        int index2=0;
        int sum1=0;
        int sum2=0;

        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0){
               carpanlar[index1]=i;
               index1++;
               sum1+=i;
            }
        }
        System.out.println("sayi1 icin carpanlar : ");
        for (int i=0; i<index1 ; i++){
            System.out.print(carpanlar[i]+" ");
        }
        System.out.println("\ncarpanlar toplami: "+sum1);

        for (int i=1;i<sayi2;i++){
            if (sayi2%i==0){
                carpanlar[index2]=i;
                index2++;
                sum2+=i;
            }
        }
        System.out.println("\nsayi2 icin carpanlar : ");
        for (int i=0; i<index2 ; i++){
            System.out.print(carpanlar[i]+" ");
        }
        System.out.println("\ncarpanlar toplami: "+sum2);

        if (sum1==sayi2){
            System.out.println("Bu sayilar arkadas sayidir");
        }else{
            System.out.println("Bu sayilar arkadas sayi degildir");
        }


    }
}