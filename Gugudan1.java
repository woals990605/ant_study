import java.util.Scanner;

public class Gugudan1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("2단부터 원하는 단까지 입력하세요:");
        n=sc.nextInt();
        for(int num = 2; num<n+1; num++){
            for(int i = 1; i<10; i++){
                System.out.println(num+"*"+i+"="+(num*i));
            }
        }
    }
}
