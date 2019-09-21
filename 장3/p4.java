package 장3;

/**
 * Write a description of class p4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p4
{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하세오");
        char alhpbet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String small = s.next();
        int i = 0;
        char c = small.charAt(i);
        while(true){
            System.out.print(alhpbet[i]);
            if(c == alhpbet[i]){
                System.out.println();
                c = alhpbet[i-1];
                i = 0;
            }else{
                i ++;   
            }
            if(c == 'a'){
                System.out.println(c);
                System.exit(0);
            }
        }
    }
}
