package ru.job4j.Tracker;

import java.util.Random;

/**
 * Class Tracker
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

    protected Item[] findByName(String key) {
        int index = 0;
        Item[] result = new Item[index];
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result[index] = items[this.position];
                index++;
            }
        }
        return result;
    }

    public void delete(String id) {
        int itemsLength = items.length;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                for (int index = this.position; index != itemsLength; index++) {
                    Item tmp = items[index];
                    items[index] = items[index + 1];
                    items[index + 1] = tmp;
                    itemsLength--;
                }
            }
        }
        System.arraycopy(items, this.position, items, this.position, itemsLength);
    }

    void replace(String id, Item item) {
        for (Item find : items) {
            if (find.getId().equals(id)) {
                items[this.position] = items[this.position + 1];
            }
        }
    }
}
