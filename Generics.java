public class Generics<E,T,F>{
    float max = 0;

    public Generics(E max1,T max2,F max3){
        float[] floatArray = new float[3];
        floatArray[0] = max1;
        floatArray[1] = max2;
        floatArray[2] = max3;

       for(float element : floatArray){
        if(element>max){
            max = element;
        }
       }
       printMax();
    }

    public void printMax(){
        System.out.println("Maximum number :" + max);
    }
    public static void main(String[] args) {
        Generics<Integer> generics = new Generics<Integer>(2,3,6);
        Generics<Float>  generics2 = new Generics<Float>(1.4f,2.0f,3.5f);
    }
}