package by.epam.tasks.entity;

import java.util.Objects;

public class Menu {
    private final int id;
    private final String name;
    private final double price;

    public Menu(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return id == menu.id && Double.compare(menu.price, price) == 0 && Objects.equals(name, menu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "\nMenu " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + "$";
    }
}
