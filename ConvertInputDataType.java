
public class ConvertInputDataType
{
     
    public static void main(String[] args) {
       
        int a=99;
        float b=10f;
        
        float r = function(a,b);
        System.out.println("function: "+r);

        long l = function2(a,b);
        System.out.println("function2: "+l);

    }
       public static float function(int number1, float number2){
           float f= (float)number1 % number2;
           return f;
       }

       public static long function2(int number1, float number2){
           long l= (long)number1 % (long)number2;
           return l;
       }
}