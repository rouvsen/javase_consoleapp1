package menu;

import bean.Config;
import menu.inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password:");
        String password = sc.nextLine();

        if ( !(username.equals("user") && password.equals("11111")) )
            throw new IllegalArgumentException("username or password is invalid.");
        else System.out.println("login successfully!");

        Config.setLoggedIn(true);
    }
}
