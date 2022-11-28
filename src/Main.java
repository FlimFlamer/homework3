public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        System.out.println();
        int person = 13;
        if (person >= 18) {
            System.out.println("Поздраляем с совершеннолетием!!!");
        }
        if (person < 18) {
            System.out.println("Нужно немного подождать! =(");
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        System.out.println();
        int age = 35;
        if (age < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (age <= 24) {
            System.out.println("Подросток ходит в университет.");
        } else if (age >= 24) {
            System.out.println("Пора искать работу =)");
        }
        System.out.println();

        //Задание 3

        System.out.println("Задание 3");
        System.out.println();
        int placeWagon = 102;
        int placeSeat = 60;
        int placeStanding = placeWagon - placeSeat;
        int passenger = 87;
        int passengerSeat = 60;
        int passengerStanding = 27;
        if (passenger <= 101) {
            System.out.println("В вагоне еще есть места!");
        } else if (passenger > 102) {
            System.out.println("В вагоне мест нет!");
        }
        if (passengerSeat < 60) {
            System.out.println("Есть сидячие места");
        }
        if (passengerStanding < 42) {
            System.out.println("Есть стоячие места");
        }
        System.out.println();

        //Задание 2.1

        System.out.println("Задание 2.1");
        System.out.println();
        int agePerson = 17;
        if (agePerson < 18) {
            System.out.println("Нужно немного подождать =(");
        } else {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        System.out.println();

        //Задание 2.2

        System.out.println("Задание 2.2");
        System.out.println();
        int agePeople = 10;
        if (agePeople >= 7) {
            System.out.println("Ребенок ходит в школу.");
        } else {
            System.out.println();
        }
        if (agePeople > 18) {
            System.out.println("Подросток ходит в университет.");
        } else {
            System.out.println();
        }
        if (agePeople >= 24) {
            System.out.println("Пора искать работу =)");
        } else {
            System.out.println();
        }
        System.out.println();

        //Задание 2.3

        System.out.println("Задание 2.3");
        System.out.println();
        if (passenger <= 101) {
            System.out.println("В вагоне еще есть места!");
        } else {
            System.out.println("В вагоне мест нет!");
        }
        if (passengerSeat <= 59) {
            System.out.println("В вагоне сеть сидячие места!");
        } else {
            System.out.println("В вагоне нет сидячих мест!");
        }
        if (passengerStanding <=41) {
            System.out.println("В вагоне есть стоячие места!");
        } else {
            System.out.println("В вагоне нет стоячих мест!");
        }
        System.out.println();

        //Задание 3.1

        System.out.println("Задание 3.1");
        System.out.println();
        age = 14;
        boolean kindergarten = (age >= 2 && age <= 6);
        boolean school = (age >= 7 && age <= 18);
        boolean university = (age > 18 && age <=24);
        boolean job = (age > 24);
            if (kindergarten) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад.");
            }
            if (school) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу.");
            }
            if (university) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет.");
            }
            if (job) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу.");
            }
        System.out.println();

        //Задание 3.2

        System.out.println("Задание 3.2");
        System.out.println();
        age = 18;
        boolean cant = age < 5;
        boolean canBt = age >=5 && age <14;
        boolean can = age > 14;
            if (cant) {
                System.out.println("Ребенок не может кататься на атракционе.");
            }
            if (canBt) {
                System.out.println("Ребенок может кататься, но в сопровождении.");
            }
            if (can) {
                System.out.println("Можно кататься без сопровождения.");
            }
            System.out.println();

            //Задание 3.3

        System.out.println("Задание 3.3");
        System.out.println();
        int one = 1;
        int two = 2;
        int three = 3;
        boolean result = one < two && one < three;
        boolean result1 = one > two && one < three;
        boolean result2 = one < two && one > three;
            if (result) {
                System.out.println(one + " меньше, чем " + two + " и мешьше, чем " + three);
            }
            else if (result1) {
                System.out.println(one + " больше, чем " + two + " но мешьше, чем " + three);
            }
            else if (result2) {
                System.out.println( one + " меньше, чем " + two + " , но больше, чем " + three);
            }
        }
    }