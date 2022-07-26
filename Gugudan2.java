import java.util.Scanner;

// 구구단 세로로 4단씩 출력하기
public class Gugudan2 {
    public static void main(String[] args) {
        int n;
        int x=4;
        int k=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("2단부터 원하는 단까지 입력하세요:");
        n=sc.nextInt();
        if(1<n%4){
            for(int j=0; j<=n/4; j++){
                for(int i = 1; i<10; i++){
                    for(int num = k+x*j; num<(k+4)+x*j; num++){
                        System.out.print(num+"*"+i+"="+(num*i)+"       \t");
                        if(num==n){break;}
                        
                         
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }else{
            for(int j=0; j<n/4; j++){
                for(int i = 1; i<10; i++){
                    for(int num = k+x*j; num<(k+4)+x*j; num++){
                        System.out.print(num+"*"+i+"="+(num*i)+"       \t");
                        if(num==n){break;}
                        
                         
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        
        
    }   
}
