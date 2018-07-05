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

    /**
     * delete
     */
    private int deleteCounter = 0;

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

    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    public Item[] findAll() {

        int findAllItemsCounter = 0;

        Item[] result = new Item[this.position];
        for (Item notNullCounter : items) {
            if (notNullCounter != null) {
                result[findAllItemsCounter] = notNullCounter;
                findAllItemsCounter++;
            }
        }
        return result;
    }

    /**
     * @param key принимает значение которое сравнивается с каким-либо параметром ячейки массива items.
     * @return возвращает массив элементов совпадающих с key.
     *
     */

    /**public Item[] findByName(String key) {
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
    }*/
    public Item[] findByName(String key) {
        int destNameCounter = 0;
        int srcNameCounter = 0;
        Item[] result = new Item[this.position];
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                System.arraycopy(items, srcNameCounter, result, destNameCounter, 1);
                destNameCounter++;
            }
            srcNameCounter++;
        }
        return result;
    }*/

    public Item[] findByName(String key) {
        int index = 0;
        Item[] result = new Item[this.position];
        for (Item findName : items) {
            if (findName != null && findName.getName().equals(key)) {
                result[index++] = findName;
            }
        } return Arrays.copyOf(result, index);
    }


    /**public void delete(String id) {
        int itemsLength = this.position;

        Item tmp;
        for (Item deleteItem : items) {
            if (deleteItem != null && deleteItem.getId().equals(id)) {
                for (int index = deleteCounter; index != this.position; index++) {
                    tmp = this.items[index];
                    this.items[index] = this.items[index + 1];
                    this.items[index + 1] = tmp;
                }
            }
            deleteCounter++;
        }
        System.arraycopy(items, 0, items, 0, itemsLength - 1);
    }
     */
    /**public void delete(String id) {
        int itemsLength = this.position;
        Item tmp;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                tmp = this.items[index];
                this.items[index] = this.items[index + 1];
                this.items[index + 1] = tmp;
            }
        } System.arraycopy(items, 0, items, 0, itemsLength - 1);
    }
     */

    public void delete(String id) {
        Item tmp;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                tmp = this.items[index];
                this.items[index] = this.items[index + 1];
                this.items[index + 1] = tmp;
                System.arraycopy(this.items, index, this.items, this.position, 1);
                break;
            }
        }
    }


    public void replace(String id, Item item) {
        if (position != 0) {
            for (Item findId : items) {
                if (findId != null && findId.getId().equals(id)) {
                    item.setId(id);
                    items[indexA] = item;
                    break;
                }
                indexA++;
            }
        }
    }
}