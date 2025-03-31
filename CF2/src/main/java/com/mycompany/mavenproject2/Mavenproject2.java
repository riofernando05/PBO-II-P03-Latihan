/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.*;

/**
 *
 * @author riofe
 */
public class Mavenproject2 {
    public static void main(String[] args) {
        String[] sentences = {"sistem", "informasi", "dan", "teknologi", "informasi"};
        Set<String> s = new HashSet<String>();
        for (String a : sentences)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);
        System.out.println(s.size() + "distinct words: " + s);
    }
}