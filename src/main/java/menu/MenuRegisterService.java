package menu;

import menu.inter.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void process() {
        System.out.println("register");
    }
}
