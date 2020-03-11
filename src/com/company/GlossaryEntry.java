package com.company;

import java.util.ArrayList;

public class GlossaryEntry {
    private String word;
    private ArrayList<Integer> numsList;

    public GlossaryEntry(String a){
        word = a.toUpperCase();
        numsList = new ArrayList<Integer>();
    }
    public void add(int num){
        int b = 0;
        for(int i = 0; i < numsList.size(); i++){
            int a = numsList.get(i);
            if(a == num){
                b++;
            }
        }
        if(b == 0){
            numsList.add(num);
        }
    }
    public String getWord(){
        return word;
    }
    public String toString(){
        String a = word + numsList;
        return a;
    }
    public static void main(String[] args) {
        GlossaryEntry ge = new GlossaryEntry("Hello");
        ge.add(5);
        ge.add(7);
        ge.add(5);
        ge.add(12);
        System.out.println(ge);
    }
}
