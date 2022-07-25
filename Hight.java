import java.util.Scanner;

public class Hight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //행의 개수를 입력받아 삼각형을 역으로 출력하세요. 
		System.out.print("행의 개수를 입력하세요:");
		int hight_num = sc.nextInt();
		
		//행의 개수
		for(int i=hight_num; i>0; i--) {
			//점찍기
			for(int x=0; x<i; x++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}

    }
}
