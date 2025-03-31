/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.*;

/**
 *
 * @author riofe
 */
public class Mavenproject5 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Jenie");
        list.add("Sherly");
        list.add("Nopeliba");
        list.add("Oktria");
        list.add("Angelyne");
        list.add("Michella");
        System.out.println(list);
        
        LinkedList queue = new LinkedList();
        queue.addFirst("Oktria");
        queue.addFirst("Nopeliba");
        queue.addFirst("Jenie");
        queue.addFirst("Michella");
        queue.addFirst("Sherly");
        queue.addFirst("Angelyne");
        System.out.println(queue);
        
        queue.removeLast();
        queue.removeLast();
        System.out.println(queue);
    }
}