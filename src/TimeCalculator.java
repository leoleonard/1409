public class TimeCalculator {

    int daysToHours (int days) {
        int hours = days * 24;
        return hours;
    }

    double secondAmount (int d, int h, int min, int sec) {
        int seconds = (sec * 1) + (min * 60) + (h * 60 * 60) + (d * 24 * 60 * 60);
        return seconds;
    }

    double minutesAmount(int seconds) {
        double minutes = (double)seconds /60;
        return minutes;
    }



}
