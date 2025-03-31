/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.*;

/**
 *
 * @author riofe
 */
public class Mavenproject3 {
    public static void main(String[] args) {
        String[] words = {"saya", "ingin", "lulus", "saya", "akan", "berusaha"};
        Set<String> uniques = new HashSet<String>();
        
        Set<String> dups = new HashSet<String>();
        for (String a : words)
            if (!uniques.add(a))
                dups.add(a);
        
        // Destrucyive set-difference
        uniques.removeAll(dups);
            System.out.println("Unique words: " + uniques);
            System.out.println("Duplicate words: " + dups);
        
    }
}