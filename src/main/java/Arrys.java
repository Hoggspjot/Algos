public class Arrys {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int newElement = 6;
        int[] copyArr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            copyArr[i] = array[i];
        }
        copyArr[copyArr.length - 1] = newElement;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

        int delElement = 3;
        int[] delArr = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i] == delElement) continue;
            delArr[j++] = array[i];
        }
        System.out.println();
        for (int i = 0; i < delArr.length; i++) {
            System.out.print(delArr[i] + " ");
        }
    }
}
