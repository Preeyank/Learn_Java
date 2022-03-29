package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // The int has a width of 32 occupies 32 bits
        System.out.println("INTEGER DATA TYPE");
        int MinIntValue = Integer.MIN_VALUE;
        int MaxIntValue = Integer.MAX_VALUE;
        // Here the Integer is a wrapper class which is used to perform operations on int
        System.out.println("Min Integer Value: " + MinIntValue);
        System.out.println("Min Integer Value: " + MaxIntValue);
        // I am printing the minimum possible Integer value and maximum possible Integer value in Java.

        System.out.println("Overflowing: " + (MaxIntValue + 1));
        System.out.println("Underflowing: " +( MinIntValue-1)+"\n");
        // Whenever we try to get the value greater than the maximum value then it causes overflow
        // Underflow will be caused in case of getting less than the minimum integer value


        // A byte occupies 8 bits and has a width of 8
        System.out.println("BYTE DATA TYPE");
        byte MinByteValue = Byte.MIN_VALUE;
        byte MaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte value: " + MinByteValue);
        System.out.println("Max byte value: " + MaxByteValue);
        System.out.println("Overflowing: " + (MaxByteValue + 1));
        System.out.println("Underflowing: " +( MinByteValue-1)+"\n");

        // A short occupies 16 bits and has a width of 16
        System.out.println("SHORT DATA TYPE");
        short MinShortValue = Short.MIN_VALUE;
        short MaxShortValue = Short.MAX_VALUE;
        System.out.println("Min short value: " + MinShortValue);
        System.out.println("Max short value: " + MaxShortValue);
        System.out.println("Overflowing: " + (MaxShortValue + 1));
        System.out.println("Underflowing: " +( MinShortValue-1)+"\n");

        // The long occupies 64 bits and has a width of 64
        System.out.println("LONG DATA TYPE");
        long MinLongValue = Long.MIN_VALUE;
        long MaxLongValue = Long.MAX_VALUE;
        System.out.println("Min long value: " + MinLongValue);
        System.out.println("Max long value: " + MaxLongValue);
        System.out.println("Overflowing: " + (MaxLongValue + 1));
        System.out.println("Underflowing: " +( MinLongValue-1)+"\n");

        // The point here is that each data occupies different memory we should know when to use what
        // The default data type in java is Int.

        //Example
        long LongInt = 2_147_483_647_123L;

        // Here I have explicitly put L in the end of the number to treat it as a long number because..
        // ..by default java considers the numbers as integers

        short ShortInt = 32767;


        //System.out.println("CASTING");

        int NewIntValue =  (MinIntValue/2);

        byte NewByteValue = (byte) (MinByteValue/2);
        short NewShortValue = (short) (MinShortValue/2);
        // Here I have written short explicitly because whatever is inside the parenthesis is considered as int by java




    }
}
