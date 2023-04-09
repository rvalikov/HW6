package HW06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//        Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию
public class Main
{
 public static void main(String[] args) {
  ArrayList<Notebook> notebooks = new ArrayList<>();


  notebooks.add(new Notebook("asus", "zen", 1200, "black", 4, "12.5"));
  notebooks.add(new Notebook("samsung", "8182", 1300, "white", 5, "13"));
  notebooks.add(new Notebook("sony", "vaio", 1400, "red", 6, "14"));
  notebooks.add(new Notebook("huaway", "xin", 1500, "yellow", 7, "14.5"));
     System.out.println("Все ноутбуки в магазине: ");
for (Notebook note:notebooks){
 System.out.println("Брэнд " + note.brand+ " MODEL "+ note.model+" Цена "+note.price+
         " Цвет "+ note.color+ " Оперативка "+ note.ram+ " Размер экрана "+ note.displaySize);
}


  System.out.println("Введите размер оперативной памяти");
  Scanner _minRam = new Scanner(System.in);
  int minRam = _minRam.nextInt();
  System.out.println("Введите цвет");
  Scanner _color = new Scanner(System.in);
  String color = _color.nextLine();
  System.out.println(" вы выбрали размер " + minRam + " или цвет " + color);
     System.out.println("Вам подходят: ");
  for (Notebook note:notebooks){
   if (note.ram >= minRam || note.color.equals(color)){
    System.out.println("Брэнд " + note.brand+ " MODEL "+ note.model+" Цена "+note.price+
            " Цвет "+ note.color+ " Оперативка "+ note.ram+ " Размер экрана "+ note.displaySize);
   }
  }
 }
}

