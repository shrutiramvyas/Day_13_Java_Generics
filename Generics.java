public class Generics {
    public static String testMax(String x,String y,String z){
        String max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static void printMax(String x,String y,String z,String max){
        System.out.println("Max value is "+ max);
    }

    public static void main(String[] args) {
        testMax("Apple","Peach","Pineapple");
    }
}
