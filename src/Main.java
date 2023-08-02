
import java.util.Arrays;
import java.util.LinkedList;


public class Main {
    private int intArray[]= {1,2,3,4,5,6};
    private double doubleArray[]= {8.4,9.3,0.2,7.9,3.4};
    private int filledIntArray[],intArrayCopy[];

    public Main()
    {
        filledIntArray=new int[10];intArrayCopy=new int[intArray.length];

        Arrays.fill(filledIntArray,7);
        Arrays.sort(doubleArray);

        System.arraycopy(intArray, 0,intArrayCopy,0,intArray.length);


        String colors[] =  {"black", "blue", "yellow"};

        LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));

        links.addLast("red");
        links.add("pink");
        links.add(3,"green");
        links.addFirst("cyan");

        colors = links.toArray(new String[links.size() ]);
        System.out.println( colors );
        for(String color: colors)
            System.out.println(color);
    }

    public void printArrays() {
        System.out.println("doubleArray: ");
        for(double doubleValue : doubleArray)
            System.out.printf("%.1f",doubleValue);
        System.out.println("\nintArray");
        for(int intValue : intArray)
            System.out.printf("%d",intValue);
        System.out.println("filledIntArray: ");
        for(int intValue : filledIntArray)
            System.out.printf("%d",intValue);
        System.out.println("intArrayCopy");
        for(int intValue : intArray)
            System.out.printf("%d",intValue);

        System.out.println("\n");

    }

    public int searchForInt(int value) {
        return Arrays.binarySearch(intArray,value);
    }
    public void printEquality() {
        boolean b= Arrays.equals(intArray,intArrayCopy);
        System.out.printf("intArray %s intArrayCopy\n",(b ?"==": "!="));
        b= Arrays.equals(intArray,filledIntArray);
        System.out.printf("intArray %s filledIntArray\n",(b ?"==": "!="));


    }





    public static void main(String[] args) {


        new Main();

        Main main1 =new Main();

        main1.printArrays();
        main1.printEquality();

        int location=main1.searchForInt(5);
        if(location>=0)
            System.out.printf("Found 5 at element %d in intArray\n",location);
        else System.out.println("5 not found in intArray");

        location=main1.searchForInt(8763);
        if(location>=0)
            System.out.printf("Found 8763 at element %d in intArray\n",location);
        else System.out.println("8763 not found in intArray");





    }
}