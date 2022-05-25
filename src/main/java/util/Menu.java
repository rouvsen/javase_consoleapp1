package util;

import bean.Config;
import menu.*;
import menu.inter.MenuService;

public enum Menu {
    LOGIN(1, "login", new MenuLoginService()),
    REGISTER(2, "register", new MenuRegisterService()),
    ADD_TEACHER(3, "add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "show all students", new MenuShowStudentService()),
    UNKNOWN("unknown");

    private final String label;
    private MenuService service;
    private int number;

    Menu(String label) {
        this.label = label;
    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public void process() {
        this.service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) return menus[i];
        }
        return UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (Config.isLoggedIn() && menus[i] != UNKNOWN) {
                if (menus[i] != LOGIN && menus[i] != REGISTER) System.out.println(menus[i]);
            } else if (menus[i] != UNKNOWN) System.out.println(menus[i]);
        }
    }

    @Override
    public String toString() {
        return this.number + "." + this.label;
    }
}
