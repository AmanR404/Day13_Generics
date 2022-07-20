public class Generics{
    public static void main(String[] args) {
        
        String[] stringArray = {"java","javascript","python"};
        String max1 = "";
        String max2 = "";
        String max3 = "";

        for( String element : stringArray){
            if(element.length()>max1.length()){
                max1 = element;
            }
        }
        for(String element : stringArray){
            if(element.length()<max1.length()){
                max2 = element;
            }
        }
        for(String element : stringArray){
            if(element.length()<max2.length()){
                max3 = element;
            }
        }
        System.out.println("Maximum number at 1st Position : " + max1);
        System.out.println("Maximum number at 2nd Position : " + max2);
        System.out.println("Maximum number at 3rd Position : " + max3);
    }
}