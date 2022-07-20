public class Generics{
    public static <E> void maximum(E[] array){
        E max1;
        E max2;
        E max3;

        for( E element : array){
            if(element>max1){
                max1 = element;
            }
        }
        for(E element : array){
            if(element<max1){
                max2 = element;
            }
        }
        for(E element : array){
            if(element<max2){
                max3 = element;
            }
    }
}
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        float[] floatArray = {1.1f,2.0f,3f,4f,5.5f};

        maximum(intArray);
        maximum(floatArray);

        System.out.println("Maximum number at 1st Position : " + max1);
        System.out.println("Maximum number at 2nd Position : " + max2);
        System.out.println("Maximum number at 3rd Position : " + max3);
    }
}