package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Also then do the same for a short variable
        setting it to any valid short number,
        and then create an int variable,
        setting it to any valid int number.
        Lastly, then create a variable of type long,
        and make that equal to 50,000 plus 10 times
        the sum of the byte plus the short
        plus the integer values.
        So that's your challenge */

        int IntVar = 3000;
        byte ByteVar = 120;
        short ShortVar = 32760;

        long LongVar = (50000L + 10L *(ByteVar+ShortVar+IntVar));
        System.out.println(LongVar);
    }
}
