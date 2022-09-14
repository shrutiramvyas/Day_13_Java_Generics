public class Generics {
    public static Integer testMax(Integer x,Integer y,Integer z){
        Integer max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static void printMax(Integer x,Integer y,Integer z,Integer max){
        System.out.println("Max value is "+ max);
    }

    public static void main(String[] args) {
        testMax(4,2,5);
    }
}
