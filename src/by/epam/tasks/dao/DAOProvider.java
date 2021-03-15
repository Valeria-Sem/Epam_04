package by.epam.tasks.dao;

import by.epam.tasks.dao.impl.MenuDAOImpl;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    private final MenuDAO menuDAO = new MenuDAOImpl();

    private DAOProvider() {}

    public MenuDAO getMenuDAO() {
        return menuDAO;
    }

    public static DAOProvider getInstance() {
        return instance;
    }

}
