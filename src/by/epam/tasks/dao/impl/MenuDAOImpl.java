package by.epam.tasks.dao.impl;

import by.epam.tasks.dao.DAOException;
import by.epam.tasks.dao.MenuDAO;
import by.epam.tasks.entity.Menu;
import jdk.internal.util.xml.impl.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuDAOImpl implements MenuDAO {
    private final String xmlFile = "resources\\menu.xml";

    public ArrayList<String> readFile() throws DAOException{
        ArrayList<String> text = new ArrayList<>();

        BufferedReader reader;
        String line;

        try {
            reader = new BufferedReader(new FileReader(xmlFile));

            while ((line = reader.readLine()) != null){
                text.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e) {
            throw new DAOException(e);
        }

        return text;
    }

    @Override
    public ArrayList<Menu> parseXMLFile() throws DAOException{
        ArrayList<String> data = readFile();
        ArrayList<Menu> menuItems = new ArrayList<>();

        int id = 0;
        String name = null;
        double price = 0;

        Pattern idPattern = Pattern.compile("(<.*\"(\\d)\">)");
        Pattern namePattern = Pattern.compile("(<.*>(.* .*)</.*)");
        Pattern pricePattern = Pattern.compile("(<.*>\\$(\\d.*)</.*>)");

        for (String datum : data) {
            Matcher matcherId = idPattern.matcher(datum);
            Matcher matcherItemName = namePattern.matcher(datum);
            Matcher matcherItemPrice = pricePattern.matcher(datum);

            if(matcherId.find()){
                id = Integer.parseInt(matcherId.group(2));
            }

            if (matcherItemName.find()){
                name = matcherItemName.group(2);
            }

            if (matcherItemPrice.find()){
                price = Double.parseDouble(matcherItemPrice.group(2));
            }

            if (id > 0 && name != null && price != 0){
                menuItems.add(new Menu(id, name, price));
            }
        }

        return menuItems;
    }

}
