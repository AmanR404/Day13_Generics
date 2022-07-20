public class Generics{
    public static void main(String[] args) {
        
        int[] intArray = {1,2,3,4,5};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for( int element : intArray){
            if(element>max1){
                max1 = element;
            }
        }
        for(int element : intArray){
            if(element<max1){
                max2 = element;
            }
        }
        for(int element : intArray){
            if(element<max2){
                max3 = element;
            }
        }
        System.out.println("Maximum number at 1st Position : " + max1);
        System.out.println("Maximum number at 2nd Position : " + max2);
        System.out.println("Maximum number at 3rd Position : " + max3);
    }
}