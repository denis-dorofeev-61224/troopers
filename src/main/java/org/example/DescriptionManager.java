package org.example;

import java.util.ArrayList;
import java.util.List;

public class DescriptionManager {

    // Динамический список для хранения объектов Description
    private List<Description> descriptions;

    // Конструктор
    public DescriptionManager() {
        this.descriptions = new ArrayList<>();
    }

    // Метод для добавления нового объекта Description
    public void addDescription(Description description) {
        descriptions.add(description);
    }

    // Метод для получения всех объектов Description
    public List<Description> getAllDescriptions() {
        return descriptions;
    }

    // Метод для поиска объекта по имени
    public Description findDescriptionByFirstName(String firstName) {
        for (Description description : descriptions) {
            if (description.getFirstName().equalsIgnoreCase(firstName)) {
                return description;
            }
        }
        return null; // Если объект не найден
    }
}