package Lesson4;


import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class User{
    int id;
    String name;
    int age;
    Gender gender;
}


//        Create an enum Gender.
//        Create a user class with fields: id, name, age, gender.
//        Create 10 user objects with corresponding id (1-10)
//        Repeat arrayList, and put these users in arayList.
//        - Wipe the collection of users, displaying only users with an even id value
//        - Erase the collection of users, displaying only users with a name longer than 5 characters
//        - Wipe the collection of users, removing only female users