package by.epam.tasks.main;

import by.epam.tasks.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class PrintMenu {

    public static void print(ArrayList<Menu> menuItems) {
        if (menuItems != null) {
            System.out.println(menuItems.toString());
        } else {
            System.out.println("There is no such menu items");
        }
    }
}
