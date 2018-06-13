package ru.job4j.tracker;

/**
 * Class StartUI
 * @author Dmitry Lebedev
 * @since 05.06.2018
 */

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для отображения всех заявок
     */
    private static final String SHOWALL = "1";

    private static final String EDIT = "2";

    private static final String DELETE = "3";
    /**
     * Константа для поиска заявки по id
     */
    private static final String FINDITEMBYID = "4";

    private static final String FINDITEMSBYNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();

            } else if (SHOWALL.equals(answer)) {
                this.findAllItems();
//             Добавить остальные действия системы по меню.
            } else if (FINDITEMBYID.equals(answer)) {
                this.findItemByIdUI();

            }  else if (EDIT.equals(answer)) {
                this.editReplace();

            } else if (DELETE.equals(answer)) {
                this.deleteItem();

            } else if (FINDITEMSBYNAME.equals(answer)) {
                this.FindItemsByName();

            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    // 0
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        String sCreate = this.input.ask("Введите create :");
        long create = 0;
        create = Long.parseLong(sCreate);
        Item item = new Item(name, desc, create);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
    // 1
    private void findAllItems() {
        System.out.println("------------ findAllItems --------------");
        this.tracker.findAll();
        System.out.println("------------ findAllItems --------------");
    }
    //2
    private void editReplace() {
        System.out.println("------------ editReplace --------------");
        String id = this.input.ask("id? :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        String sCreate = this.input.ask("Введите create :");
        long create = 0;
        create = Long.parseLong(sCreate);
        Item item = new Item(name, desc, create);
        this.tracker.replace(id, item);
        System.out.println("------------ editReplace --------------");
    }
    //3
    private void deleteItem() {
        System.out.println("------------ deleteItem --------------");
        String name = this.input.ask("name? :");
        this.tracker.findByName(name);
        System.out.println("------------ deleteItemFindName --------------");
        this.tracker.delete(name);
        System.out.println("------------ deleteItem --------------");
    }
    // 4
    private void findItemByIdUI(){
        System.out.println("------------ findItemById --------------");
        String id = this.input.ask("id? :");
        tracker.findById(id);
        System.out.println("------------ findItemById --------------");
    }
    //5
    private void FindItemsByName() {
        System.out.println("------------ FindItemsByName --------------");
        String name = this.input.ask("name? :");
        Item[] resultIn = tracker.findByName(name);
        System.out.println("name : " + resultIn[0].getName() + ";");
        System.out.println("Description : " + resultIn[0].getDescription() + ";");
        System.out.println("------------ FindItemsByName --------------");
    }


    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
