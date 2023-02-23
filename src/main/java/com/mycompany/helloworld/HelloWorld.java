/**
   Document: Hello World.
   Created on: Jul. 23, 2022, 1:19:37 a.m.
   Author: Ing. Howard Fernando Del Angel Leija.
**/

package com.mycompany.helloworld;

import java.util.Arrays;

public class HelloWorld 
{

    public static void main(String[] args) 
    {
        int [][] numbers = { {1, 2, 3}, {4, 5, 6} };
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
}
