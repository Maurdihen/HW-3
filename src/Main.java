public class Main {
    public static void main(String[] args) {
        byte a = 0;
        short b = 128;
        int c = 32768;
        long d = 922337203685L;
        float e = 3.4028235E+38F;
        double f = 1.797693134862315;
        char g = 'A';
        boolean h = true;

        System.out.println("Значение переменной a c типом byte равно: " + a);
        System.out.println("Значение переменной b c типом short равно: " + b);
        System.out.println("Значение переменной c c типом int равно: " + c);
        System.out.println("Значение переменной d c типом long равно: " + d);
        System.out.println("Значение переменной e c типом float равно: " + e);
        System.out.println("Значение переменной f c типом double равно: " + f);
        System.out.println("Значение переменной g c типом char равно: " + g);
        System.out.println("Значение переменной h c типом boolean равно: " + h);

        float a1 = 27.12f;
        long b2 = 987678965549L;
        float c2 = 2.786f;
        short d2 = 569;
        short e2 = -159;
        short f2 = 27897;
        byte g2 = 127;

        byte LP = 23;
        byte AS = 23;
        byte EA = 30;

        short frame = 480;

        short sumFrame = (short) (LP + AS + EA);

        float res = (float) frame / sumFrame;

        System.out.println("Результат равен: " + res);

        short twentyMinutes = 16 * 10;
        short day = 720 * 16;
        int threeDay = day * 3;
        int month = threeDay * 10;

        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month + " штук бутылок.");

        byte banana = 80; // 1 штука
        byte milk = 105; // 100 грамм
        byte iceCream = 100; // один брикет
        byte egg = 70; // 1 штука

        float totalWeight = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);

        System.out.println("Вес всех продуктов равен: " + totalWeight + " грамм.");
        System.out.println("Вес всех продуктов равен: " + (totalWeight / 100) + " килограммам." );

        short min = 250;
        short max = 500;
        short kg = 7;
        short gram = (short) (kg * 1000);
        System.out.println("Если худеть на " + min + " грамм в день, то понадобиться: " + (gram / min) + " дней");
        System.out.println("Если худеть на " + max + " грамм в день, то понадобиться: " + (gram / max) + " дней");
        System.out.println("В среднем понадобиться: " + (((gram / min) + (gram / max)) / 2) + " день");

        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        System.out.println("Маша теперь получает " + (int) (masha * 1.1) + " рублей. Годовой доход вырос на " + (int) (masha * 0.1 * 12) + " рублей");
        System.out.println("Денис теперь получает " + (int) (denis * 1.1) + " рублей. Годовой доход вырос на " + (int) (denis * 0.1 * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (int) (cristina * 1.1) + " рублей. Годовой доход вырос на " + (int) (cristina * 0.1 * 12) + " рублей");
    }
}