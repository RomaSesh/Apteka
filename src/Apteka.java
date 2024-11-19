import java.util.ArrayList;
import java.util.List;

public class Apteka {
    private String name; // Название аптеки
    private List<Lekarstvo> medicines; // Лекарства

    // Конструктор для инициализации полей
    public Apteka(String name) {
        this.name = name;
        this.medicines = new ArrayList<>();
    }

    // Метод для добавления лекарства
    public void addMedicine(String name, double price) {
        medicines.add(new Lekarstvo(name, price)); // Создаем объект Lekarstvo и добавляем его в список
    }

    // Метод для получения полной информации об аптеке
    public String getFullInfo() {
        StringBuilder info = new StringBuilder("Аптека: " + name + "\nЛекарства:\n");
        for (Lekarstvo lekarstvo : medicines) {
            info.append(lekarstvo.getName()).append(" - ").append(lekarstvo.getPrice()).append(" руб.\n");
        }
        return info.toString();
    }

    // Метод для выяснения стоимости самого дорогого лекарства
    public double getHighestPrice() {
        double highestPrice = 0;
        for (Lekarstvo lekarstvo : medicines) {
            if (lekarstvo.getPrice() > highestPrice) {
                highestPrice = lekarstvo.getPrice();
            }
        }
        return highestPrice;
    }

    // Метод для нахождения стоимости всех лекарств
    public double getTotalCost() {
        double totalCost = 0;
        for (Lekarstvo lekarstvo : medicines) {
            totalCost += lekarstvo.getPrice();
        }
        return totalCost;
    }
}