package 장3;


/**
 * Write a description of class p1_do_while here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p1_do_while
{
    public static void main(String[] args){
        int sum = 0,i= 0;
        do{
            sum = sum + i;
            i += 2;
        }while(i<100);
        System.out.println(sum);
    }
}
