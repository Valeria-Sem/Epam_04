package by.epam.tasks.servise;

import by.epam.tasks.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public interface MenuService {
    ArrayList<Menu> parseXMLFile() throws ServiceException;
}
