public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
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

    void showInfo2() {
        System.out.println(firstName + " " + lastName + " " + age + " " + city);
    }


    Person(String fn, String ln, int a, String c) {
        this(fn, ln);
        age = a;
        city = c;
    }


}
