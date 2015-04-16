package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Artur on 16.04.2015.
 */
// 3 - создать две коллекции и заполнить их именами
// 3.1 - программа создает 3-ю коллекцию, заполняя ее именами первой и второй без повторений
// Dima, Anna, Alex
// Alex, Vova, Dima, Sasha
// Dima, Anna, Alex, Vova, Sasha
// 3.2 - В третью записываются только те, которые есть в обеих коллекциях
// Dima, Alex
// Sort
public class Work_with_collections {
    public static void main(String[] args) {
        NameCollection List1 = new NameCollection();
        NameCollection List2 = new NameCollection();
        NameCollection List3 = new NameCollection();
        System.out.println("Заполнение списка 1 (для окончания нажмите #):");
        List1.massAdd();
        List1.display();
        System.out.println("Заполнение списка 2 (для окончания нажмите #):");
        List2.massAdd();
        List2.display();
        System.out.print("1: ");
        List1.display();
        System.out.print("2; ");
        List2.display();
        while(true) {
            System.out.println("Что вы хотите?");
            System.out.println("1 - объединение");
            System.out.println("2 - пересечение");
            System.out.println("3 - выход");
            Scanner scan = new Scanner(System.in);
            int ind;
            try {
                ind = scan.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Введите номер от 1 до 3");
                break;
            }
            if (ind == 1) {
                for (int i = 0; i < List1.size(); i++) if (!List3.exists(List1.get(i))) List3.add(List1.get(i));
                for (int j = 0; j < List2.size(); j++) if (!List3.exists(List2.get(j))) List3.add(List2.get(j));
                List3.display();
            } else if (ind == 2) {
                int max;
                if(List1.size()>List2.size()) max = List1.size();
                else max = List2.size();
                for(int i = 0; i < List1.size(); i++) {
                    for(int j= 0; j < List2.size(); j++) {
                        if(List1.get(i).equals(List2.get(j))) {
                            if(!List3.exists(List1.get(i))) List3.add(List1.get(i));
                            break;
                        }
                    }
                }
                List3.display();
            } else if (ind == 3)System.exit(0);
            else System.out.println("Введите номер от 1 до 3");
        }
    }
}
