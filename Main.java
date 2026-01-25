import java.util.*;
class Main{
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");



    }



    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        while(n-- > 0){
            int t = cs.nextInt();
            printPattern(t);
            
        }
    }
}