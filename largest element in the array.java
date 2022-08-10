public class Main {
    public static void main(String[] args) {
        double[] myList = {1, 20, 3, 4, 5};
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println(max);        // returns 20.0
    }
}
