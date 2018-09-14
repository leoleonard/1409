public class Test2 {
    public static void main(String[] args) {
        TimeCalculator timeCalc = new TimeCalculator();
        int h = timeCalc.daysToHours(3);
        System.out.println(h);

         double s = timeCalc.secondAmount(0,0, 1, 1);
         System.out.println(s);

         double m = timeCalc.minutesAmount(100);
        System.out.println(m);


    }
}
