
package recursionpractice;

public class RecursionPractice {
    
    /**
     * @param x accept first input
     * @param  y accept second input
     * 
     * @return sum
     */
    public static void method(int x, int y){
        method(1, 2);
    }
    
    public static double power(double base, int exponent){
        int product = 1;
   
        for(double i = 0; i < exponent; i++){
            if(i != exponent){
               product *= base;
               
            }
            
        }
        System.out.println("The product is: " + product);
        return product;
            
    }
   
    public static void main(String[] args) {
        
        power(2, 4);
    }
    
}
