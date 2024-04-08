//Ushtrimi 3
//Dy stiva jane vendosur ne nje vektor me madhesi 1000. Ndertoni nje tip abstrakt te dhenash qe implementon veprimet qe kryhen me kete strukture.
public class DoubleStackArray <T extends Comparable<T>>{
    private T[] theArray;
    private final int DEFAULT_CAPACITY = 1000;
    private int topOfStack1;
    private int topOfStack2;

    public DoubleStackArray(){
        theArray = (T[]) new Object[DEFAULT_CAPACITY];
        topOfStack1 = -1;
        topOfStack2 = theArray.length;
    }

}
