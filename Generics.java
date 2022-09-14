public class Generics {
    public static Double testMax(Double x,Double y,Double z){
        Double max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static void printMax(Double x,Double y,Double z,Double max){
        System.out.println("Max value is "+ max);
    }

    public static void main(String[] args) {
        testMax(4.2,2.3,5.9);
    }
}
