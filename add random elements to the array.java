public class Main {
    public static void main(String[] args) {
        int[] myList = new int[5];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
            System.out.print(myList[i] + " ");        // returns 94 99 86 40 89 
        }
    }
}
