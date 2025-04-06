
public class p3{
    public static void main(String[]args){
        int num = 321;
        int a = 0;
        while(num !=0){
            int digit = num %10 ;
            a=a*10+digit;
            num /=10;
        }
        System.out.println(a);
    }
}
