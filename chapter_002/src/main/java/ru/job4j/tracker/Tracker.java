package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

/**
 * Class tracker
 * @author Dmitry Lebedev
 * @since 16.05.2018
 */

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    /**public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    */
    public List<Item> findById(String id) {
        List<Item> result = new ArrayList<Item>();
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result.add(item);
                break;
            }
        }
        return result;
    }


    /**
    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
     */
    public List<Item> getAll() {
        List<Item> result = new ArrayList<Item>();
        for (Item item : items) {
            result.add(item);
        }
        return result;
    }

    public Item[] findAll() {

        int index = 0;

        Item[] result = new Item[this.position];
        for (Item notNullCounter : items) {
            if (notNullCounter != null) {
                result[index] = notNullCounter;
                index++;
            }
        }
        return Arrays.copyOf(items, position);
    }

    /**
     * @param key принимает значение которое сравнивается с каким-либо параметром ячейки массива items.
     * @return возвращает массив элементов совпадающих с key.
     *
     */

    public Item[] findByName(String key) {
        int index = 0;
        Item[] result = new Item[this.position];
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                result[index++] = findName;
            }
        } return Arrays.copyOf(result, index);
    }

    public boolean delete(String id) {
        boolean k = false;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position - index);
                this.position--;
                k = true;
                break;
            }
        } return k;
    }


    public boolean replace(String id, Item item) {
        boolean k = false;
        int index = 0;
        if (position != 0) {
            for (Item findId : items) {
                if (findId != null && findId.getId().equals(id)) {
                    item.setId(id);
                    items[index] = item;
                    k = true;
                    break;
                }
                index++;
            }
        }
        return k;
    }
}