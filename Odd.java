import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        int num; // 줄 갯수
        int count = 0; // *의 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수를 입력해주세요:");

        num=sc.nextInt();
        if(num%2==1){
            for(int i=0; i<num; i++){
                for(int x = 0; x<=num+count; x++){
                    System.out.print(x<num-count?" ": "*"); // 삼항연산자 (조건문)?참일때 : 거짓일때;
                }
                System.out.println();
                count = num/2>i?count+1 : count-1;
            }
        }else{
            System.out.println("홀수를 입력해주세요");
        }
            
    
    }
}
