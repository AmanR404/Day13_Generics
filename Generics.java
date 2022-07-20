public class Generics{
    public static void main(String[] args) {
        
        float[] floatArray = {1.1f,2.0f,3f,4f,5.5f};
        float max1 = 0;
        float max2 = 0;
        float max3 = 0;

        for( float element : floatArray){
            if(element>max1){
                max1 = element;
            }
        }
        for(float element : floatArray){
            if(element<max1){
                max2 = element;
            }
        }
        for(float element : floatArray){
            if(element<max2){
                max3 = element;
            }
        }
        System.out.println("Maximum number at 1st Position : " + max1);
        System.out.println("Maximum number at 2nd Position : " + max2);
        System.out.println("Maximum number at 3rd Position : " + max3);
    }
}