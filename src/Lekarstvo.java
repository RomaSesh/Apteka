public class Lekarstvo {
    private String name; // Название лекарства
    private double price; // Стоимость лекарства

    // Конструктор для инициализации полей
    public Lekarstvo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для получения названия лекарства
    public String getName() {
        return name;
    }

    // Метод для получения цены лекарства
    public double getPrice() {
        return price;
    }
}
