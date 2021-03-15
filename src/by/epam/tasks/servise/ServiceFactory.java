package by.epam.tasks.servise;

import by.epam.tasks.servise.impl.MenuServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final MenuService menuService = new MenuServiceImpl();

    private ServiceFactory() {}

    public MenuService getMenuService() {

        return menuService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
