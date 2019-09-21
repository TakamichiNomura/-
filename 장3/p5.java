package 장3;


/**
 * Write a description of class p5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p5
{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하세오 >> ");
        int array[] = new int[10];
        for(int i = 0;i<array.length;i++){
            array[i] = s.nextInt();
        }
        System.out.print("3의 배수는 >> ");
        for(int i = 0;i<array.length;i++){
            if(array[i] % 3 == 0)
                System.out.print(array[i] +" ");
        }
    }
}
