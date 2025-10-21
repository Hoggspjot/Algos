package october.day211025.task1;

public class Main {
    public static void main(String[] args) {
        // Создаем коробку
        Box box = new Box();

        // Создаем этикетку, связанную с этой коробкой.
        // Для создания экземпляра внутреннего класса нужен экземпляр внешнего класса.
        Box.Label label = box.new Label();

        // Вызываем метод печати этикетки
        label.printLabel();
    }

}

class Box {

    class Label {

        public void printLabel() {
            System.out.println("Box label");
        }
    }
}