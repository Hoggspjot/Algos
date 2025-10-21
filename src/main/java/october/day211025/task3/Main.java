package october.day211025.task3;

public class Main {
    public static void main(String[] args) {
        // Создаем объект библиотеки
        Library library = new Library();

        // Создаем объект нестатического внутреннего класса через объект внешнего класса
        // Синтаксис library.new Scroll(...) обязателен для non-static inner классов
        Library.Scroll scroll = library.new Scroll("Ancient Runes");

        // Показываем название свитка
        scroll.revealTitle();
    }
}

class Library {

    public void addScroll(String scrollTitle) {

    }

    class Scroll {
        private String scrollTitle;

        public Scroll(String scrollTitle) {
            this.scrollTitle = scrollTitle;
        }

        public void revealTitle() {
            System.out.println(scrollTitle);
        }

    }

}