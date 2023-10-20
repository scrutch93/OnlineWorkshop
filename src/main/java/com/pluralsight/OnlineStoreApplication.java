package com.pluralsight;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;

public class OnlineStoreApplication {
    public static void main(String[] args) {
        //Show Homescreen

    showProducts();


    }

        //Show Products
        public static void showProducts(){
        try{
            System.out.println("Here's what we currently have in stock: ");
            FileReader filereader = new FileReader("src/main/resources/products.csv");
            BufferedReader bufferedReader = new BufferedReader((filereader));
            String input;
            while((input = bufferedReader.readLine()) !=null){

                System.out.println(input);

            }


        }catch(IOException e){

            e.printStackTrace();
        }



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










}}
