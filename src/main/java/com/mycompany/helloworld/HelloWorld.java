/**
   Document: Hello World.
   Created on: Jul. 23, 2022, 1:19:37 a.m.
   Author: Ing. Howard Fernando Del Angel Leija.
**/

package com.mycompany.helloworld;

import java.util.Scanner;

public class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.println("You are " + name);
    }
}
