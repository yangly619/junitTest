package progA_junit;

/**
 * Hello world!
 *
 */
public class Factorial
{
     public int compute(int number){
         int r;
         if(number==0){
            r=1;
         }else if(number==1){
             r=1;
         }else {
             r=number*compute(number-1);
         }



         return r;
    }

}
