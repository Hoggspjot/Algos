package october.day211025.task4;

public class Main {
    public static void main(String[] args) {
        // Создаём дом с общим адресом
        House house = new House("Sunny Valley Lane");

        // Через объект внешнего класса создаём объект внутреннего класса.
        // Синтаксис house.new Room(...) обязателен для non-static inner класса.
        House.Room room = house.new Room ("Master Bedroom");

        // Выводим идентификатор комнаты и общий адрес дома
        room.printAddresses();
    }
}

class House {
    private String houseAddress;

    public House(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    class Room {
        private String roomIdentifier;

        public Room(String roomIdentifier) {
            this.roomIdentifier = roomIdentifier;
        }

        void printAddresses() {
            System.out.println(roomIdentifier);
            System.out.println(houseAddress);
        }
    }

}