public class Test {
    public static void main(String[] args) {
        // wywolanie add z Calculator z pomyslnym konstruktorem
        Calculator calc = new Calculator(); // wywolanie metody
        int suma = calc.add(8, 9); // przypisanie return do zmiennej 'suma'
        System.out.println(suma);

        int suma2 = calc.add(2, 3);
        System.out.println(suma2);
    }
}
