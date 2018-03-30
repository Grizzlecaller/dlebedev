package ru.job4j.loop;
/**
 * Class Board 0.1
 * @author Dmitry Lebedev
 * @since 27.03.2018
 */
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        int hParam;
        int wParam;
        for (hParam = 0; hParam < height; hParam++) {
            /*
                Проверяется значение hParam.
                Если значение height делится на 2 без остатка, выполняется проверка wParam .
             */
            if (hParam % 2 == 0) {
                for (wParam = 0; wParam < width; wParam++) {
                    // если width делится на 2 без остатка - первый (нулевой) символ "x".

                    if (wParam % 2 == 0) {
                        screen.append("x");
                    } else {
                        screen.append(" ");
                    }
                }
            } else {
                /*
                Если значение hParam делится на 2 с остатком, выполняется проверка wParam .
                 */
                for (wParam = 0; wParam < width; wParam++) {
                    // если wParam делится на 2 без остатка - первый (нулевой) символ " " (пробел).

                    if (wParam % 2 == 0) {
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
