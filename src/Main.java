public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int temperature = 10;
        System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        int institutionAge = 20;
        if (institutionAge >= 2 && institutionAge <= 6) {
            System.out.println("Если возраст человека равен " + institutionAge + ", то ему нужно ходить в детский сад.");
        }
            else if (institutionAge >= 7 && institutionAge <= 17) {
            System.out.println("Если возраст человека равен " + institutionAge + ", то ему нужно ходить в школу.");
        }
            else if (institutionAge >= 18 && institutionAge <= 24) {
            System.out.println("Если возраст человека равен " + institutionAge + ", то ему нужно ходить в университет.");
        }
            else if (institutionAge >24) {
            System.out.println("Если возраст человека равен " + institutionAge + ", то ему нужно ходить на работу.");
        }
            else {
            System.out.println("Если возраст человека равен " + institutionAge + ", то ему нужно наслаждаться пока жизнью.");
        }
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        int kidAge = 10;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему нельзя кататься на аттракционе.");
        } else if (kidAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        int trainCarSeats = 50;
        int trainCarStandingSpots = 30;
        boolean isSeatsFree = trainCarSeats < 60;
        boolean isStandingStopsFree = trainCarStandingSpots < 42;
        if (isSeatsFree) {
            if (isStandingStopsFree) {
                System.out.println("В вагоне есть: " + (60 - trainCarSeats) + " сидячих мест и " + (42 - trainCarStandingSpots) + " стоячих мест.");
            } else {
                System.out.println("В вагоне есть: " + (60 - trainCarSeats) + " сидячих мест и нет свободных стоячих мест.");
            }

        } else {
            if (isStandingStopsFree) {
                System.out.println("В вагоне нет свободных сидячих мест и " + (42 - trainCarStandingSpots) + " свободных стоячих места.");
            } else {
                System.out.println("Вагон уже полностью забит.");
            }
        }
        System.out.println();

        //Задача 6 v.2
        System.out.println("Задача 6 версия 2");
        int trainCarPassengers =43;
        int freeSeats = 60 - trainCarPassengers;
        int freeSpace = 102 - trainCarPassengers;
        if (freeSeats > 0) {
            System.out.println("Свободных сидячих мест: " + freeSeats);
            System.out.println("Свободных стоячих мест: " + (freeSpace - freeSeats));
        } else if (freeSpace > 0) {
            System.out.println("Свободных стоячих мест в вагоне: " + freeSpace);
        } else {
            System.out.println("В вагоне мест нет.");
        }
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        int one = 48;
        int two = 64;
        int three = 17;
        if (one > two && one > three) {
            System.out.println("Число 1 со значением " + one + " является самым большим.");
        } else if (two > three) {
            System.out.println("Число 2 со значением " + two + " является самым большим.");
        } else {
            System.out.println("Число 3 со значением " + three + " является самым большим.");
        }
    }
}