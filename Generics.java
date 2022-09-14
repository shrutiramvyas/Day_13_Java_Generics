public class Generics{
    public static <T extends Comparable<T>> void testMax(T x, T y, T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
    }
    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Max value is "+ max);
    }

    public static void main(String[] args) {
        testMax(12,4,56);
        testMax(4.2,5.6,3.5);
        testMax("Apple","Peach","Pineapple");
    }
}
