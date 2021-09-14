package com.company;

import com.company.Animal.*;
import com.company.Clothing.Clothing;

public class Main {

    public static void main(String[] args) {

//        ZooAfrica zooAfrica = new ZooAfrica("Gary", "sloth", false);
//        //System.out.println(zooAfrica);
//
//        ZooNA zooNA = new ZooNA("kawalski", "penguin", false);
//        //System.out.println(zooNA);
//
//        WildAsia wildAsia = new WildAsia("Corona", "bat", true);
//        //System.out.println(wildAsia);
//
//        WildAfrica wildAfrica = new WildAfrica("Rancho", "tiger", false);
//        //System.out.println(wildAfrica);
//
//
//
//        Wild wild = new Wild("Tom", "tiger");
//        Animal animal[] = new Animal[10];
//        WildAsia wildAsiaArr[] = new WildAsia[5];
//
//        animal[0] = zooAfrica;
        //System.out.println("animal 0 \n" + animal[0]);


//        System.out.println(clothing.bottom());
//        clothing.top();
//        clothing.dressCode();
//
//        clothing.dressWoman("heels", false);

        Dress dress = new Dress();
        System.out.println(dress.womansClothing());

        Tie tie = new Tie();
        System.out.println(tie.mansClothing());

    }
}

interface MensClothing{
    String mansClothing();
//    public String bottom();
//    public void top();
}

interface WomansClothing{
    String womansClothing();
    //public void dressWoman(String shoes, boolean modest);
    //public String shoes();
    //public void dressCode();
}


class Dress implements WomansClothing {



    @Override
    public String womansClothing() {
        return "black dress";
    }
}

class Tie implements MensClothing {

    @Override
    public String mansClothing() {
        return "black tie";
    }
}


/*
Create an Animal class with two arbitrary fields. from the Animal class to create two more descendants,
each of which has its own set of additional fields, from each descendant 2 more descendants,
each of which has one additional characteristic. Create one element of each type.
Create an array of each type, pack all the elements in possible arrays that match their type

Створити клас Тварина з двома довільними полями. від класу Тварина створити ще два нащадки ,
кожен з яких має свій набір додаткових полів, від кожного нащядка ще по 2 нащадки,
кожен з яких має додатково по одній характеристиці. Створити по одному елементу кожного типу.
Створити масив кожного типу, пофасувати всі елементи по можливих масивах, які підходять їм за типом

—————————-
Create an inheritance class class:
Papyrus-King-Magazine
Papyrus-Book-Comic
The number of fields is arbitrary.

——————————
Create a PC class (3 random fields).
The PC is followed by the Laptop and the Workstation
from the Laptop the Laptop is imitated.
from Workstation is followed by SuperPC.
Each descendant has 3 new fields


#core #interface #implements
——————————-
Create interfaces "Men's clothing" with the method of "dress a man" and "Women's clothing"
with the method of "dress a woman". Implement them in the appropriate classes of implementers

——————————
 Create descendant classes for the class Clothing - T-shirt (also implements interfaces Men's Clothing
 and Women's Clothing), Pants (also implements interfaces Men's Clothing and Women's Clothing),
 Dresses (implements the interface "Women's Clothing"), Tie (implements interfaces Men's Clothing).
 */