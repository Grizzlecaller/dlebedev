package ru.job4j.tracker;

/**
 * Class MenuOutException
 * @author Dmitry Lebedev (mailto:dylebedev.social@gmail.com)
 * @since 27.08.2018
 */


public class MenuOutException extends RuntimeException {
    public MenuOutException(String msg) {
        super(msg);
    }
}
