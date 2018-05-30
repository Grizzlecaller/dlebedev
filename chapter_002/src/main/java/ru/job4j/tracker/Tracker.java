package ru.job4j.tracker;

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
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * replace
     */

    private int indexA = 0;
    private int indexB = indexA;

    /**
     * findByName
     */
    private int findByNameItemResultCounter = 0;
    private int indexFindByNameIn = 0;
    private int indexFindByNameOut = 0;

    /**
     * delete
     */
    private int deleteCounter = 0;
    private int deleteItemCounter = 0;


    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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

    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            if (result[index] == null) {
                result[index] = result[this.position - 1];
                this.position--;
                index--;
            }
        }
        return result;
    }

    /**
     * DONE!
     *
     * @param key принимает значение которое сравнивается с каким-либо параметром ячейки массива items.
     * @return возвращает массив элементов совпадающих с key.
     *
     * Надо придумать как объявить массив нужной длинны.
     */

    public Item[] findByName(String key) {
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                findByNameItemResultCounter++;
            }
        }
        Item[] result = new Item[findByNameItemResultCounter];
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                result[indexFindByNameOut] = this.items[indexFindByNameIn];
                indexFindByNameOut++;
            }
            indexFindByNameIn++;
        }
        return result;
    }

    //вроде ок.

    public void delete(String id) {
        int itemsLength = this.position;
        for (Item deleteItem : items) {
            if (deleteItem != null && deleteItem.getId().equals(id)) {
                deleteItemCounter++;
            }
        }
        Item[] result = new Item[itemsLength - deleteItemCounter];
        Item tmp = null;

        for (Item deleteItem : items) {
            if (deleteItem != null && deleteItem.getId().equals(id)) {
                for (int i = deleteCounter; i < this.position; i++) {
                    tmp = this.items[deleteCounter];
                    this.items[deleteCounter] = this.items[deleteCounter + 1];
                    this.items[deleteCounter + 1] = tmp;
                }
            }
            deleteCounter++;
        }
        System.arraycopy(items,0, items, 0, itemsLength - deleteItemCounter);
    }

    void replace(String id, Item item) {
        if (indexA > 0) {
            indexB--;
        }
        for (Item findId : items) {
            indexA++;
            if (findId != null && findId.getId().equals(id)) {
                //нужно перезаписать объект в ячейке.
                items[indexB] = item;
            }
        }
    }
}