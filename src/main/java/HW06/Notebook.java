package HW06;

import java.util.ArrayList;
import java.util.Scanner;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//        Реализовать в java.
//        Создать множество ноутбуков (ArrayList).
//        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию
public class Notebook {
    public String brand;
    public String model;
    public double price;
    public String color;
    public int ram;
    public String displaySize;
    Notebook(String _brand,String _model,double _price,String _color,int _ram,String _displaySize)
    {
       this.brand=_brand;
        this.model=_model;
        this.price=_price;
        this.color=_color;
        this.ram=_ram;
        this.displaySize=_displaySize;
    }


}
