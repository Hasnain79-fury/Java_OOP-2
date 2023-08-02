import java.util.Arrays;

public class UsingArrays {
    private int intArray[] = {1,2,3,4,5,6};
    private double doubleArray[] = {8.4,9.3,0.2,7.9,3.4};
    private int filledIntArray[], intArrayCopy[];
    // constructor initializes arrays
    public UsingArrays()
    {
        filledIntArray = new int[10];
        intArrayCopy = new int[intArray.length];

        Arrays.fill(filledIntArray,7);
        Arrays.sort(doubleArray);
        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);

    }

    public void printArrays()
    {
        System.out.print("doubleArray: ");
        for(double doubleValue : doubleArray)
            System.out.printf("%.1f",doubleValue);
        System.out.print("\nintArray: ");
        for(int intValue : intArray)
            System.out.printf("%d",intValue);
        System.out.print("\nfilledIntArray");
        for(int intValue : filledIntArray)
            System.out.printf("%d",intValue);
        System.out.println("\n");
    }

    public int searchForInt(int value){
        return Arrays.binarySearch(intArray,value);
    }

    public void printEquality()
    {
        boolean b = Arrays.equals(intArray,intArrayCopy);
        System.out.printf("intArray %s intArrayCopy\n",(b ?"==":"!="));
    }

    public static void main(String args[])
    {
        UsingArrays usingArrays = new UsingArrays();
        usingArrays.printArrays();
        usingArrays.printEquality();

        int location = usingArrays.searchForInt(5);
        if(location >= 0)
            System.out.printf("Found 5 a element %d in intArray\n",location);
        else
            System.out.println("5 not found in intArray\n");
        location = usingArrays.searchForInt(8763);
        if(location>=0)
            System.out.printf("Found 8763 at element %d int intArray\n",location);
        else
            System.out.println("8763 not found in intArray\n");

    }

}
