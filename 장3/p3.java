package 장3;
import java.util.Scanner;

/**
 * Write a description of class p3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p3
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int number = s.nextInt();
        for(int i = 0;i<number;i++){
            for(int j = 0;j<number-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
