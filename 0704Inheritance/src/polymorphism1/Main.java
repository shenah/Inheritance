package polymorphism1;

public class Main {

	public static void main(String[] args) {
		//3개 클래스의 공격하는 메소드를 호출해보기
		Starcraft star = new Terran();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		star = new Protoss();
		star.attack();

	}

}
