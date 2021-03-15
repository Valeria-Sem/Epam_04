package by.epam.tasks.dao;

import by.epam.tasks.dao.impl.MenuDAOImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final MenuDAO menuDAO = new MenuDAOImpl();

    private DAOFactory() {}

    public MenuDAO getMenuDAO() {
        return menuDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
