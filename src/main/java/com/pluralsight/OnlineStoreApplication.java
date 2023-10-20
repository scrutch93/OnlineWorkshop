package com.pluralsight;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;

public class OnlineStoreApplication {

    public static HashMap<String,Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        //Show Homescreen

    showProducts();


    }

        //Show Products
        public static void showProducts(){
        try{
            System.out.println("Here's what we currently have in stock: ");
            //We will have the system go into the resources file and read from the csv called "products"
            FileReader filereader = new FileReader("src/main/resources/products.csv");
            BufferedReader bufferedReader = new BufferedReader((filereader));
            //We will treat the file as input for the reader, and will take each line as an input for the reader as a String.
            String input;
            while((input = bufferedReader.readLine()) !=null) {
            //We will then break apart each line and set it up to be that of an array.
                String[] product = input.split("\\|");
                //This ignores the first line of the csv file
                if (!product[0].equals("SKU")) {
                    String id = product[0];
                    String name = product[1];
                    float price = Float.parseFloat(product[2]);
                    String department = product[3];

                //Below we are pretty much loading the contents of the csv file into the hashmap that we declared globally.
                    inventory.put(name, new Product(id, name, price, department));
                //This loads out the inventory to show to the customer.
                    System.out.println(input);

                }

            }
        }catch(IOException e){

            e.printStackTrace();
        }



}
//    public static void productSearch(){
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Do you have a particular item in mind? If so enter name: ");
//        String answer = keyboard.nextLine().trim();
//        Product foundProduct =
//
//
//
//
//
//    }
    //        //Show Cart
//        public static void showCart(){
//
//        }
//
//        //AddtoCart
//        public static void AddtoCart(){
//
//        }
//        //RemovefromCart
//        public static void RemoveFromCart(){
//
//        }



}
