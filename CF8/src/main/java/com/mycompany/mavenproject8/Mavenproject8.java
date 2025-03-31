/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import java.util.*;

/**
 *
 * @author riofe
 */
public class Mavenproject8 {
    public static void main(String[] args) {
        
        Vector v = new Vector();
        //Add elements to Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        
        System.out.println("Vector contains : " + v);
        
        Enumeration e = v.elements();
        
        ArrayList aList = Collections.list(e);
        System.out.println("Arraylist contains : " + aList);
    }
}