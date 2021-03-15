package by.epam.tasks.servise.impl;

import by.epam.tasks.dao.DAOException;
import by.epam.tasks.dao.DAOFactory;
import by.epam.tasks.dao.MenuDAO;
import by.epam.tasks.entity.Menu;
import by.epam.tasks.servise.MenuService;
import by.epam.tasks.servise.ServiceException;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService {
    @Override
    public ArrayList<Menu> parseXMLFile() throws ServiceException {
        DAOFactory factory = DAOFactory.getInstance();
        MenuDAO menuDAO = factory.getMenuDAO();

        ArrayList<Menu> menuItems = null;
        try {
            menuItems = menuDAO.parseXMLFile();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return menuItems;
    }
}
