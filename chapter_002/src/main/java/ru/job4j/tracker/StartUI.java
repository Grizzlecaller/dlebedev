package ru.job4j.tracker;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.menu;

/**
 * Class StartUI
 * @author Dmitry Lebedev
 * @since 05.06.2018
 */

public class StartUI {

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        menu.select(input.ask("select:", menu.range()));
        do {
            menu.show();
            menu.select(input.ask("select:", range));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }


    public static void main(String[] args) {
        Input input = new StubInput(new String[] {});
        new StartUI((new ConsoleInput()), new Tracker()).init();

    }
}
