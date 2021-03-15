package by.epam.tasks.dao;

import by.epam.tasks.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public interface MenuDAO {
    ArrayList<Menu> parseXMLFile() throws DAOException;
}
