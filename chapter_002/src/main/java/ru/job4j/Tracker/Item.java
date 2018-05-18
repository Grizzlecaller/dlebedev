package ru.job4j.Tracker;

/**
 * Class Item
 * @author Dmitry Lebedev
 * @since 16.05.2018
 */

public class Item {

    private String id;

    private String name;

    public Item() {
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
