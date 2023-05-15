public class numRange {

    // create printInRange method that takes two int arguments, a start and end
    public void printInRange(int start, int end) {
        // set counter i equal to start, while i is less than or equal to end, increment i
        for (int i = start; i <= end; i++) {
            // print out i
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        // create new instance of numRange
       numRange range = new numRange();
       // call printInRange method on new instance
       range.printInRange(2, 10);
    }
}
