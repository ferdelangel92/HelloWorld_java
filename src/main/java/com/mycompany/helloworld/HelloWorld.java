/**
   Document: Hello World.
   Created on: Jul. 23, 2022, 1:19:37 a.m.
   Author: Ing. Howard Fernando Del Angel Leija.
**/

package com.mycompany.helloworld;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class HelloWorld 
{
    public static void main(String[] args) 
    {
        NumberFormat currency = new NumberFormat() {
            @Override
            public StringBuffer format(double d, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public StringBuffer format(long l, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Number parse(String string, ParsePosition pp) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
}
