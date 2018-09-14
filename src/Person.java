public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    Person(String fn, String ln, int a, String c) {
        firstName = fn;
        lastName = ln;
        age = a;
        city = c;
    }

    void increseAge() {
        age++;
    }

    void changeAge(int change) {
        age = age + change;
    }

     String showInfo() {
       return firstName + ", " + lastName + ", " + age + ", "+ city;
    }

//    void showInfo1() {
//        System.out.printf(" ");
//    }


}
