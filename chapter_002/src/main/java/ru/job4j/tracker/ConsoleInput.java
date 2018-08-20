package ru.job4j.tracker;

/**
 * Class ConsoleInput
 * @author Dmitry Lebedev
 * @since 05.06.2018
 */

import java.util.*;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int ask(String question, List<Integer> range) {
        System.out.println(question);
        int key = 0;
        boolean b = true;
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
        return key;
    }
}
