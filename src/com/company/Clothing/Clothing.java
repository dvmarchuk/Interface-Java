package com.company.Clothing;

public class Clothing {




//    @Override
//    public void dressMan() {
//        System.out.println("the man has a shirt and pants with running shoes");
//    }
//
//    @Override
//    public String bottom() {
//        return "shorts";
//    }
//
//    public void top(){
//        System.out.println("shirtless");
//    }


//    @Override
//    public void dressWoman(String shoes, boolean modest) {
//        System.out.println("shoes: " + shoes);
//        System.out.println("modest: " + modest);
//    }
//
//    @Override
//    public String shoes() {
//        return "heels";
//    }
//
//    @Override
//    public void dressCode() {
//        System.out.println("modest");
//    }

    MensClothing[] mensClothing = new MensClothing[5];

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


class Dress implements WomansClothing{



    @Override
    public String womansClothing() {
        return "black dress";
    }
}

class Tie implements MensClothing{

    @Override
    public String mansClothing() {
        return "black tie";
    }
}


/*
Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка"
і "Жіночий одяг" з методом "одягнути жінку".
Реалізувати їх у відповідних класах реалізаторах

Create interfaces "Men's clothing" with the method of "dress a man"
and "Women's clothing" with the method of "dress a woman".
Implement them in the appropriate classes of implementers



 Створити класи нащадки до класу Одяг -
 Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
 Штани (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
 Плаття (реалізує інтерфейс "Жіночий одяг"),
 Галстук (реалізує інтерфейси Чоловічий одяг).

 Create descendant classes for the class Clothing -
 T-shirt (also implements interfaces Men's Clothing and Women's Clothing),
 Pants (also implements interfaces Men's Clothing and Women's Clothing),
 Dresses (implements the interface "Women's Clothing"),
 Tie (implements interfaces Men's Clothing).
 */