package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

public static void startGrocery(){

    Scanner scanner = new Scanner(System.in);
    int userInput;

    System.out.println("Lütfen 0, 1 veya 2 değerlerinden birini girin:");

    userInput=scanner.nextInt();
    scanner.nextLine();

    switch (userInput){
        case 0:
            System.out.println("Uygulama durduruldu");


        case 1:
            System.out.println("Eklenmesini istediğiniz elemanı giriniz yada virgülle ayırarak birden fazla eleman giriniz");
            String input = scanner.nextLine();
            String[] data = input.split(",");

            for(String str : data){
                groceryList.add(str.trim());
                Collections.sort(groceryList);
            }

        case 2:
            System.out.println("Çıkarılmasını istediğiniz elemanlanı giriniz. Yada virgülle ayırarak birden fazla eleman giriniz.");
            String removeInput = scanner.nextLine();
            String[] choice = removeInput.split(",");

            for(String item : choice){
                groceryList.remove(item.trim());
                Collections.sort(groceryList);
            }

    }

}


   public static void addItems(String input){
     String[] inputArray = input.split(",");

     for(String item : inputArray){
         if(!groceryList.contains(item)){
             groceryList.add(item);
         }
     }
     Collections.sort(groceryList);
   }

   public static void removeItems(String input){
       String[] inputArray = input.split(",");

       for(String item : inputArray){
           groceryList.remove(item.trim());
       }
       Collections.sort(groceryList);
   }

   public static boolean checkItemIsInList(String product){
    return  groceryList.contains(product);
   }

   public static void printSorted(){
       Collections.sort(groceryList);

       ArrayList<String> groceryCopie = new ArrayList<>();

       for(String item : groceryList){

           if(!groceryCopie.contains(item)){
               groceryCopie.add(item);
           }

       }

       groceryList.clear();
       groceryList.addAll(groceryCopie);
   }





}
