package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class tracker
 * @author Dmitry Lebedev
 * @since 16.05.2018
 */

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    ArrayList<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    //private int position = 0;
    private static final Random RN = new Random();



    /**public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    */

    //NEW

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */

    Item add(Item item) {
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

    //NEW
    ArrayList<Item> findById(String id) {
        ArrayList<Item> result = new ArrayList<>();
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

    //NEW
    ArrayList<Item> getAll() {
        return items;
    }

    /**
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
     */

    //NEW
    ArrayList<Item> findAll() {
        return items;
    }



    /**
    public Item[] findByName(String key) {
        int index = 0;
        Item[] result = new Item[this.position];
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                result[index++] = findName;
            }
        } return Arrays.copyOf(result, index);
    }
     */

    //NEW

    /**
     * @param key принимает значение которое сравнивается с каким-либо параметром ячейки массива items.
     * @return возвращает массив элементов совпадающих с key.
     *
     */

    ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                result.add(findName);
            }
        }
        return result;
    }


    /**
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
     */

    // NEW!
    boolean delete(String id) {
        boolean k = false;
        if (items.removeIf(item -> item.getId().equals(id))) {
            k = true;
            items.trimToSize();
        }
        return k;
    }



    /**
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
     */

    //NEW
    /**boolean replace(String id, Item item) {
        boolean k = false;
        for (Item findId : items) {
            if (findId != null && findId.getId().equals(id)) {
                int index = items.indexOf(findId);
                item.setId(id);
                items.set(index, item);
                k = true;
            }
        }
        return k;
    }
    */
    boolean replace(String id, Item item) {
        boolean k = false;
        for (Item findId : items) {
            //int index = items.indexOf(findId);
            item.setId(id);
            items.set(items.indexOf(findId), item);
            k = true;
        }
        return k;
    }

}