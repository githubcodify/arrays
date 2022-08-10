public class Main {
    public static void main(String[] args) {
        double[] myList = {10, 20, 30, 40};
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println(total);                      // returns 100.0
    }
}
