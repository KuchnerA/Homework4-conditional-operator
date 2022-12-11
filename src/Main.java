public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача1: ");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача2: ");
        int temperature = 15;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача3: ");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача4: ");
        int age = 6;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача5: ");
        int age = 17;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача6: ");
        int numberOfSeats = 60;
        int wagonCapacity = 102;
        int otherCount = wagonCapacity - numberOfSeats;

        int seatsUsed = 40;
        int otherUsed = 41;
        if (seatsUsed < numberOfSeats) {
            System.out.println("В вагоне есть " + (numberOfSeats - seatsUsed) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("В вагоне есть " + (otherCount - otherUsed) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача7: ");
        int one = 40;
        int two = 40;
        int three = 10;
        if (one > two) {
            if (one >= three) {
                System.out.println("Число " + one + " - большее из чисел.");
            } else {
                System.out.println("Число " + three + " - большее из чисел.");
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Число " + two + " - большее из чисел.");
            } else {
                System.out.println("Число " + three + " - большее из чисел.");
            }
        } else {
            if (one > three) {
                System.out.println("Число " + one + " - большее из чисел.");
            } else if (three > one) {
                System.out.println("Число " + three + " - большее из чисел.");
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}
