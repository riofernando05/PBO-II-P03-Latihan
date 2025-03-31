/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

import java.util.*;

import java.util.PriorityQueue;

/**
 *
 * @author riofe
 */
public class Mavenproject11 {
    
    PriorityQueue<String> stringQueue;
    
    public static void main(String[] args) {
        
        PriorityQueue<String> stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");
        
        //don't use iterator which may or may not
        //show the PriorityQueue's order
        while(stringQueue.size() > 0)
            System.out.println(stringQueue.remove());
    }
}