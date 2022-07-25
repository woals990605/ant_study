import java.util.Scanner;

public class Row{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 행의 개수를 입력하면 삼각형을 출력하기
    System.out.println("행의 개수를 입력하세요:");
    int row_num = sc.nextInt();

    // 행의 개수
    for(int i=row_num; i>0; i--){
        // 점찍기
        for(int x = row_num+1; x>i; x--){
            System.out.print("*");
        }
        System.out.println();
    }
  }
}