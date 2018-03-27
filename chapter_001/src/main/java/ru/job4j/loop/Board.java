package ru.job4j.loop;
/**
 * Class Board 0.1
 * @author Dmitry Lebedev
 * @since 27.03.2018
 */
public class Board {
    public String paint(int width, int height){
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (height = 0; height <= 2; height++) {
            /*
                Проверяется значение height.
                Если значение height делится на 2 без остатка, выполняется проверка width .
             */
            if (height % 2 == 0){
                for (width = 0; width <= 2; width++) {
                    // если width делится на 2 без остатка - первый (нулевой) символ "x".

                    if (width % 2 == 0) {
                        screen.append("x");
                    } else {
                        screen.append(" ");
                    }
                }
            }else{
                /*
                Если значение height делится на 2 с остатком, выполняется проверка width .
                 */
                for (width = 0; width <= 2; width++) {
                    // если width делится на 2 без остатка - первый (нулевой) символ " " (пробел).

                    if (width % 2 == 0) {
                        screen.append(" ");
                    } else {
                        screen.append("x");
                    }
                }

            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
