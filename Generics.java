public class Generics<T extends Comparable<T>>{
    T x, y, z;
    public Generics(T x,T y,T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public T testMax(){
        return Generics.testMax(this.x,this.y,this.z);
    }
    public static <T extends Comparable<T>> T testMax(T x, T y, T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Max value is "+ max);
    }

    public static void main(String[] args) {
        Generics.testMax(12,4,56);
        new Generics(4.2,5.6,3.5).testMax();
        new Generics("apple","orange","pear").testMax();
    }
}
