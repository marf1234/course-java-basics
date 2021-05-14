package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить название года по китайскому календарю, если считать что нет никаких циклических смещений, т.е.
 * нижеприведенный цикл повторяется для любых 12 лет после 0 н.э..
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 */
public class Task14 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int day = 12;
        int month = 12;
        int year = 1989;

        String monthName = getZodiacYearName(day, month, year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int day, int month, int year) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int x = (1997 - year) % 12;
        String chineseSign = null;
        if ((x == 1) || (x == -11)){
            chineseSign="Rat";
        }
        else{
            if (x == 0){
                chineseSign="Ox";
            }
            else{
                if ((x == 11) || (x == -1)){
                    chineseSign="Tiger";
                }
                else{
                    if ((x == 10) || (x == -2)){
                        chineseSign="Rabbit";
                    }
                    else{
                        if ((x == 9) || (x == -3)){
                            chineseSign="Dragon";
                        }
                        else{
                            if ((x == 8) || (x == -4)){
                                chineseSign="Snake";
                            }
                            else{
                                if ((x == 7) || (x == -5)){
                                    chineseSign="Horse";
                                }
                                else{
                                    if ((x == 6) || (x == -6)){
                                        chineseSign="Ram";
                                    }
                                    else{
                                        if ((x == 5) || (x == -7)){
                                            chineseSign="Monkey";
                                        }
                                        else{
                                            if ((x == 4) || (x == -8)){
                                                chineseSign="Rooster";
                                            }
                                            else{
                                                if ((x == 3) || (x == -9)){
                                                    chineseSign="Dog";
                                                }
                                                else{
                                                    if ((x == 2) || (x == -10)){
                                                        chineseSign="Pig";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return chineseSign;
    }
}
