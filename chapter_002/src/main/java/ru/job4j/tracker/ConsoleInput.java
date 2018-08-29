package ru.job4j.tracker;

/**
 * Class ConsoleInput
 * @author Dmitry Lebedev
 * @since 05.06.2018
 */

import java.util.*;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public ConsoleInput(String[] strings) {
    }

    public ConsoleInput() {

    }

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int ask(String question, List<Integer> range) {
        System.out.println(question);
        /*boolean b = true;
        do {
            try { //заварачиваем в трай если вдруг пользователь решит ввести строку а не цифру
                key = Integer.parseInt(scanner.nextLine()); //считываем данные
                for (Integer r : range) { //запускаем цикл по массиву
                    if (key == r) { //если нашли совпадение то данный ключ существует
                        b = false; //меняем флаг чтоб выйти из цикла
                        break;
                    }
                }
                if (b) { // если не нашли пишем об этом и цикл прокрутится заново
                    System.out.println("Введите данные в диапазоне меню");
                }
            } catch (Exception ex) { //если возикло исключение пишем о некоректном вводе и т.к флаг не изменился
                System.out.println("Введите корректные данные. "); //то цикл прокрутится еще раз
            }
        } while (b);
        return key;*/

        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return  key;
        } else {
            throw new MenuOutException("out of menu range");
        }
    }
    public Boolean checkMenuNumber() {
        boolean b = false;

        return true;
    }
}
