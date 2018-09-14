public class Test {
    public static void main(String[] args) {
        // wywolanie add z Calculator z pomyslnym konstruktorem
        Calculator calc = new Calculator(); // wywolanie metody
        int suma = calc.add(8, 9); // przypisanie return do zmiennej 'suma'
        System.out.println(suma);

        int suma2 = calc.add(2, 3); // przypisanie calc.add do suma2 (alt + enter)
        System.out.println(suma2);

        System.out.println(calc.add(4, 6));

        calc.addAndShow(5.5, 8); //metoda void
        // wynik z void nie mozna dalej uzyc w programie

        System.out.println("Koniec programu");
    }
}
