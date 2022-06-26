abstract class Player{ //추상클래스
	abstract void play(int pos); // 추상메서드
	abstract void stop(); //추상메서드 ({}가 없는 메서드)
}
//추상클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 play합니다");}
	void stop() {System.out.println("재생을 멈춥니다");}
}
	
public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AudioPlayer ap = new AudioPlayer(); //둘다 같은 결과 출력 (다형성)
		Player ap = new AudioPlayer(); //둘다 같은 결과 출력 (다형성)
		ap.play(100);
		ap.stop();
	}

}
