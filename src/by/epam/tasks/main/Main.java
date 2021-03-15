package by.epam.tasks.main;

import by.epam.tasks.entity.Menu;
import by.epam.tasks.servise.MenuService;
import by.epam.tasks.servise.ServiceException;
import by.epam.tasks.servise.ServiceFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ServiceException {
        ServiceFactory factory = ServiceFactory.getInstance();
        MenuService service = factory.getMenuService();

        ArrayList<Menu> menuItems = service.parseXMLFile();

        PrintMenu.print(menuItems);
    }
}
