
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №4");
        //задача1
        System.out.println("Задача1");
        int age = 9;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетния, нужно немного подождать.");
        }
        //задача2
        System.out.println("Задача2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        //задача3
        System.out.println("Задача3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Ели скорость " + speed + ", то заплатить штраф.");
        } else {
            System.out.println("Ели скорость " + speed + ", то можно ездить спокойно.");
        }
        //задача4
        System.out.println("Задача4");
        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет.");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.");
        }
        //задача5
        System.out.println("Задача5");
        int ageChild = 8;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на атракционе.");
        } else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на атракционе в сопровождении.");
        } else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на атракционе без сопровождения.");
        }
        //задача6
        System.out.println("Задача6");
        int capacityWagon = 102;
        int seatsWagon = 60;
        int ctandingSeatsWagon = capacityWagon - seatsWagon;
        int baseSeatsWagon = 20;
        int baseCtandingSeatsWagon = 40;
        if ((baseSeatsWagon + baseCtandingSeatsWagon) == capacityWagon) {
            System.out.println("Свободных мест нет, вагон полностью забит.");
        } else if (baseSeatsWagon == seatsWagon) {
            System.out.println("В вагоне есть с вободные стоячии места");
        } else if (baseCtandingSeatsWagon == ctandingSeatsWagon) {
            System.out.println("В вагоен есть свободные сидячие места");
        } else if (baseSeatsWagon < seatsWagon && baseCtandingSeatsWagon < ctandingSeatsWagon) {
            System.out.println("В вагоне есть свободные и стоячие, и сидячие места.");
        }
        //задача7
        System.out.println("Задача7");
        int one = 23;
        int two = 5;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Самое большое число one");
        } else if (two > one && two > three) {
            System.out.println("Самое большое число two");
        } else if (three > one && three > two) {
            System.out.println("Самое большое число three");
        }


    }
}