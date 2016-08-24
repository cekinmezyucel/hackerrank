package com.cekinmezyucel.hackerrank;

import java.io.*;
import java.util.*;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
            try{
                int x = scan.nextInt();
                int y = scan.nextInt();
                int z = x/y;
                System.out.println(z);
            } catch (InputMismatchException e1){
                System.out.println("java.util.InputMismatchException");  
            } catch (ArithmeticException e2){
                System.out.println(e2);
            } 
    }
}