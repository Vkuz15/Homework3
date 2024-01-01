public class Main {
    public static void main(String[] args) {

        //Задача 1

        int apple = 100;
        System.out.println("Значение переменной  с типом равно " + apple + " кг");
        byte oranges = 120;
        System.out.println("Значение переменной oranges с типом byte равно " + oranges + " кг");
        short watermelon = 300;
        System.out.println("Значение переменной watermelon с типом short равно " + watermelon + " кг");
        long lemon = 1_000_000_000L;
        System.out.println("Значение переменной lemon с типом long равно " + lemon + " кг");
        float pumpkin = 1.025f;
        System.out.println("Значение переменной pumpkin с типом float равно " + pumpkin + " кг");
        double melon = 1.55555555;
        System.out.println("Значение пременной melon с типом double равно " + melon + " кг");

        //Задача 2

        int a = -159;
        byte b = 67;
        int c = 569;
        short d = 27897;
        long e = 987_678_965_549L;
        float f = 27.12f;
        double v = 2.786;

        //Задача 3

        int paper = 480;
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperForStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        //Задача 4

        byte machine = 16;
        int machineOneMinute = machine / 2;
        int machine20Minute = machineOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + machine20Minute + " штук бутылок");
        int dayMinute = 60 * 24;
        int machineDayMinute = dayMinute * machineOneMinute;
        System.out.println("За сутки машина произвела " + machineDayMinute + " штук бутылок");
        int machine3DayMinute = machineDayMinute * 3;
        System.out.println("За трое суток машина произвела " + machine3DayMinute + " штук бутылок");
        long machineMonthMinute = machineDayMinute * 30L;
        System.out.println("За месяц машина произвела " + machineMonthMinute + " штук бутылок");

        //Задача 5

        byte white = 2;
        byte brown = 4;
        byte total = 120;
        int totalClasses = total / 6;
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        //Задача 6

        int banana = 80 * 5;
        int milk = 200 / 100 * 105;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int totalWeightG = banana + milk + iceCream + eggs;
        double totalWeightKg = totalWeightG / 1000.0;
        System.out.println("Вес спортзавтрака в килограммах - " + totalWeightKg);

        //Задача 7

        int totalWeight = 7;
        int oneGramDay = 250;
        int twoGramDay = 500;
        int gram = totalWeight * 1000;
        int min = gram / oneGramDay;
        int max = gram / twoGramDay;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм - " + min);
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм - " + max);
        int daysAverage = (min + max) / 2;
        System.out.println("Если в среднем - " + daysAverage);
    }
}