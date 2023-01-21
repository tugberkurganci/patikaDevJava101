package ConditionalStatements;

public class HoroscopeFinder {
    public void find(int month, int day) {

        if (month == 1) {
            if (day < 22) System.out.println("Your horoscope is:"+"capricorn");
            else System.out.println("Your horoscope is:"+"aquarius");
        }
        if (month == 2) {
            if (day < 20) System.out.println("Your horoscope is:"+"aquarius");
            else System.out.println("Your horoscope is:"+"pisces");
        }
        if (month == 3) {
            if (day < 21) System.out.println("Your horoscope is:"+"pisces");
            else System.out.println("Your horoscope is:"+"aries");
        }
        if (month == 4) {
            if (day < 21) System.out.println("Your horoscope is:"+"aries");
            else System.out.println("Your horoscope is:"+"taurus");
        }
        if (month == 5) {
            if (day < 22) System.out.println("Your horoscope is:"+"taurus");
            else System.out.println("Your horoscope is:"+"gemini");
        }
        if (month == 6) {
            if (day < 23) System.out.println("Your horoscope is:"+"gemini");
            else System.out.println("Your horoscope is:"+"cancer");
        }
        if (month == 7) {
            if (day < 23) System.out.println("Your horoscope is:"+"cancer");
            else System.out.println("Your horoscope is:"+"leo");
        }
        if (month == 8) {
            if (day < 24) System.out.println("Your horoscope is:"+"leo");
            else System.out.println("Your horoscope is:"+"virgo");
        }
        if (month == 9) {
            if (day < 24) System.out.println("Your horoscope is:"+"virgo");
            else System.out.println("Your horoscope is:"+"scales");
        }
        if (month == 10) {
            if (day < 24) System.out.println("Your horoscope is:"+"scales");
            else System.out.println("Your horoscope is:"+"scorpio");
        }
        if (month == 11) {
            if (day < 24) System.out.println("Your horoscope is:"+"scorpio");
            else System.out.println("Your horoscope is:"+"sagittarius");
        }
        if (month == 12) {
            if (day < 23) System.out.println("Your horoscope is:"+"sagittarius");
            else System.out.println("Your horoscope is:"+"capricorn");
        }

    }
}
