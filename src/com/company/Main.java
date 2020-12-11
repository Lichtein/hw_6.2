package com.company;

public class Main {

    public static void main(String[] args) {
            Race<Double, Integer> race1 = new Race<>(28.15, 14);
            Race<Double, Integer> race2 = new Race<>(16.24, 13);

            time1(race1);
            time2(race2);
        }
    public static void time2(Race<? extends Number, ? extends Number> r2){
        System.out.println("Гонщик под номером 68 проехал дистанцию за:  " + r2.getDistance().doubleValue()/r2.getSpeed().doubleValue() + "Минут");
    }

    private static void time1(Race<? extends Number, ? extends Number> r1) {
        System.out.println("Гонщик под номером 26 проехал дистанцию за:  " + r1.getDistance().doubleValue()/r1.getSpeed().doubleValue() + "Минут");
    }
}
