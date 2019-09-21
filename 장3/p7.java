package 장3;


/**
 * Write a description of class p7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p7
{
    public static void main(String[] args){
        int n[] = new int[10];
        int sum = 0;
        for(int i = 0;i<n.length;i++){
            n[i] = (int)(Math.random()*10 + 1);
            System.out.print(n[i]);
            sum += n[i];
        }
        System.out.println();
        System.out.println("평균 "+ (double)(sum / n.length));
    }
}
