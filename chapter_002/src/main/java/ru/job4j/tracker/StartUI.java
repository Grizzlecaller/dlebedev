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

    private boolean work = true;
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
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        do {
            menu.show();
            menu.select(input.ask("select:", menu.range()));
        } while (this.work);  //(!"y".equals(this.input.ask("Exit?(y): ")));
    }

    public void stop() {
        this.work = false;
    }


    public static void main(String[] args) {
        Input input = new StubInput(new String[] {});
        new StartUI((new ConsoleInput()), new Tracker()).init();

    }
}
