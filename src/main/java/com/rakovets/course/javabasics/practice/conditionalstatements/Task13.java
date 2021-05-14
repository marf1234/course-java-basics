package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для сервиса доставки.
 * <p>
 * Определить номер этажа дома для текущего клиента.
 */
public class Task13 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int numberFloors = 4;
        int numberApartmentsPerFloor = 3;
        int apartmentNumber = 11;

        int floorNumber = getFloorNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);
        System.out.printf("Result: %s", floorNumber);
    }

    /**
     * Определяет номер этажа дома для текущего клиента.
     *
     * @param numberFloors             количество этажей
     * @param numberApartmentsPerFloor количество квартир на этаже
     * @param apartmentNumber          номер квартиры
     * @return номер этажа
     */
    static int getFloorNumber(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int m1 = apartmentNumber / (numberFloors * numberApartmentsPerFloor);//Сколько целых подъездов "заполнено"
        int k1 = apartmentNumber - m1 * numberFloors * numberApartmentsPerFloor;//Номер квартиры относительно начала подъезд
        double n1 = k1 / numberApartmentsPerFloor;//Сколько под квартирой еще этажей
        if(k1 == 0){
            m1--;
            k1 = numberApartmentsPerFloor * numberFloors;
            n1 = numberFloors;
        }
        int floorQuantity = 0;

    return floorQuantity;
}
}
