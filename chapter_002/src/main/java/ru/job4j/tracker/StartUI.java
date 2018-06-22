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

    /**
     * Константа для редактирования заявки
     */
    private static final String EDIT = "2";

    /**
     * Константа для удаления заявки
     */
    private static final String DELETE = "3";

    /**
     * Константа для поиска заявки по id
     */
    private static final String FINDITEMBYID = "4";

    /**
     * Константа для поиска заявки по name
     */
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
                this.createItem();

            } else if (SHOWALL.equals(answer)) {
                this.findAllItems();

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

    // 0 Done
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

    // 1 Done findAll
    private void findAllItems() {
        System.out.println("------------ Start findAllItems --------------");
        Item[] result = tracker.getAll();
        int resultLength = result.length;
        int i = 0;
        int rezNum = i + 1;
        System.out.println("Количество объектов удовлетворяющих критерий поиска : "  + resultLength);
        for (i = 0; i < resultLength; i++) {
            System.out.println("Элемент № : " + rezNum);
            System.out.println("Name : " + result[i].getName());
            System.out.println("Description : " + result[i].getDescription());
            System.out.println("Create : " + result[i].getCreate());
            System.out.println("Id: " + result[i].getId());
            rezNum++;
        }
        System.out.println("------------ End findAllItems --------------");
    }

    //2 Done replace
    private void editReplace() {
        System.out.println("------------ Start editReplace --------------");
        String id = this.input.ask("id task for edit? :");
        String name = this.input.ask("Введите новое имя заявки :");
        String desc = this.input.ask("Введите новое описание заявки :");
        String sCreate = this.input.ask("Введите новое create :");
        long create = 0;
        create = Long.parseLong(sCreate);
        Item newItem = new Item(name, desc, create);
        newItem.setId(id);
        tracker.replace(id, newItem);
        System.out.println("------------ End editReplace --------------");
    }

    //3 Done delete
    private void deleteItem() {
        System.out.println("------------ Start deleteItem --------------");
        String id = this.input.ask("id? :");
        System.out.println("------------ Analise --------------");
        tracker.delete(id);
        Item[] resultDelete = tracker.getAll();
        int resultDeleteLength = resultDelete.length;
        for (int i = 0; i < resultDeleteLength - 1; i++) {
            System.out.println(resultDelete[i].getName());
        }
        System.out.println("------------ End deleteItem --------------");
    }

    // 4 Done findById
    private void findItemByIdUI(){
        System.out.println("------------ Start findItemById --------------");
        String id = this.input.ask("id? :");
        Item resultId;
        Item[] findAll = tracker.getAll();
        for (Item findId : findAll) {
            if (findId.getId().equals(id)) {
                resultId = tracker.findById(id);
                System.out.println("Name : " + resultId.getName());
                System.out.println("Description : " + resultId.getDescription());
                System.out.println("Create : " + resultId.getDescription());
            }
            else {
                System.out.println("Id not found");
            }
        }
        System.out.println("------------ End findItemById --------------");
    }

    //5 Done findByName
    private void FindItemsByName() {
        System.out.println("------------ Start FindItemsByName --------------");
        String name = this.input.ask("name? :");
        Item[] resultName = tracker.findByName(name);
        System.out.println("Количество объектов удовлетворяющих критерий поиска : " + resultName.length);
        for (int i = 0; i < resultName.length; i++) {
            int rezNum = i + 1;
            System.out.println("Результат : " + rezNum);
            System.out.println("Name : " + resultName[i].getName());
            System.out.println("Description : " + resultName[i].getDescription());
            System.out.println("Create : " + resultName[i].getDescription());
            System.out.println("Id : " + resultName[i].getId());
        }
        System.out.println("------------ End FindItemsByName --------------");
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
