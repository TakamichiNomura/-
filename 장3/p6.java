package 장3;

/**
 * Write a description of class p6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p6
{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int[] unit = {50000,10000,1000,500,100,50,10,1};
        System.out.print("금액을 입력하세오 > ");
        int money = s.nextInt();
        int i = 0;
        for(;i < unit.length;i++){
            int count = 0;
            while(unit[i] * count + 1 <= money){
                count ++;
            }
            count --;
            System.out.print(unit[i] +"원 짜리 : "+ count +"개");
            System.out.println();
            money -= unit[i] * count;
        }
    }
}
