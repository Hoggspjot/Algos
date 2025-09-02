public class BinarySearch {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        randomNumber = getRandomNumber(a, b);
        System.out.println("Количество попыток угадывания числа двоичным поиском " + binarySearch(a, b));
    }

    static int randomNumber;

    public static int getRandomNumber(int min, int max) {
        return (min + (int) (Math.random() * max));
    }


    public static int binarySearch(int a, int b) {
        int countAttempts = 1;
        while (a <= b) {
            int middle = (a + b) / 2;
            if (middle == randomNumber) {
                break;
            } else if (randomNumber > middle) {
                a = middle;
            } else {
                b = middle;
            }
            countAttempts++;
        }
        return countAttempts;
    }
}
