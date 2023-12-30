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
    }
}