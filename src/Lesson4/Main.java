package Lesson4;


import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Dennis", 24, Gender.MALE));
        users.add(new User(2, "Bill", 20, Gender.MALE));
        users.add(new User(3, "Jill", 18, Gender.FEMALE));
        users.add(new User(4, "Ang", 19, Gender.FEMALE));
        users.add(new User(5, "Ira", 19, Gender.FEMALE));
        users.add(new User(6, "Anna", 19, Gender.FEMALE));
        users.add(new User(7, "Max", 20, Gender.MALE));
        users.add(new User(8, "Serhii", 20, Gender.MALE));
        users.add(new User(9, "Potato", 20, Gender.MALE));
        users.add(new User(10, "Liana", 19, Gender.FEMALE));

        //System.out.println(users);

//        for (User user : users) {
//            if(user.getId()%2 != 0){
//                users.remove(user);
//            }
//            System.out.println(user);
//        }

        Iterator<User> iterator = users.iterator();


//        while(iterator.hasNext()){
//            User next = iterator.next();
//            if(next.getId()%2 != 0){
//                iterator.remove();
//            }
//        }
//        System.out.println("odd users "+ users);

//        while(iterator.hasNext()){
//            User next = iterator.next();
//            if(next.getName().length() < 5){
//                iterator.remove();
//            }
//        }
//        System.out.println(users);

//        while(iterator.hasNext()){
//            User next = iterator.next();
//            if(next.getGender() == Gender.FEMALE){
//                iterator.remove();
//            }
//        }
//        System.out.println(users);





//    private Map <Person, List <Pet>> club;


        List<Pet> pets1 = new ArrayList<>();

        pets1.add(new Pet("racoon", true));
        Person person1 = new Person(24, "Dennis");

        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("dog", false));
        Person person2 = new Person(19, "Ang");

        HashMap<Person, List <Pet>> zoo = new HashMap<>();
        zoo.put(person1, pets1);
        zoo.put(person2, pets2);

        System.out.println("zoo 1 " + zoo);

        Set<Person> keys = zoo.keySet();
        //System.out.println("keys " + keys);

        //keys.remove(person1);
        //zoo.remove(person1);

        Collection<List<Pet>> values = zoo.values();
        System.out.println(values);
        zoo.remove(values);

        System.out.println("zoo 2" + zoo);




    }



}


