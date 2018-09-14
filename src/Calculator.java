public class Calculator {

    int add(int a, int b) { //typ + nazwa
        int sum = a + b;
        return sum;
    }

    void addAndShow(double a, double b) {// void jako typ zwracanych danych
        System.out.println(a + b);
    }

    void addAndShow(int a, int b) {
        // oblicz i wyswietl
            int suma = add(a, b);
            System.out.println(suma);

    }
}
