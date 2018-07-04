package packageimport;

//Date 클래스는 java.util 패키지에 있고 java.sql 패키지에도 있습니다.
//이렇게 여러 패키지에 존재하는 클래스의 경우는 반드시 구체적으로 import를 해야 합니다.
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		sc.close();
	}

}
