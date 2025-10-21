package october.day211025.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Person с именем "Anna"
        Person person = new Person("Anna");

        // Создаем объект внутреннего класса Greeting через объект внешнего класса
        // Синтаксис person.new Greeting() обязателен для non-static inner классов
        Person.Greeting greeting = person.new Greeting();

        // Вызываем метод, который выводит приветствие
        greeting.sayHello();
    }
}

class Person {
    private String userName;

    public Person(String userName) {
        this.userName = userName;
    }

    class Greeting {

        void sayHello() {
            System.out.println("Hello, "+ userName);
        }
    }
}