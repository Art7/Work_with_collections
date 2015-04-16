package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Artur on 16.04.2015.
 */
public class NameCollection {
    ArrayList<String> List = null;
    public NameCollection(){
        List = new ArrayList<String>();
    }
    public void massAdd(){
        String name;
        Scanner scan = new Scanner(System.in);
        while(true){
            name = scan.next();
            if (name.equals("#")) break;
            if (!name.equals("")) List.add(name);
        }
    }
    public void display(){
        for(int i = 0; i < List.size(); i++){
            System.out.print(List.get(i) + " ");
            if((i+1) % 5 == 0) System.out.println();
        }
        System.out.println();
    }
    public int size(){
        return List.size();
    }
    public boolean exists(String element){
        for( int i=0; i< List.size();i++){
            if(List.get(i).equals(element)) return true;
        }
        return false;
    }
    public String get(int i){
        return List.get(i);
    }
    public void add(String name){
        List.add(name);
    }
}
