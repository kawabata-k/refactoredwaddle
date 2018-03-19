import java.util.Random;

public class Oracle {
	private static Random random = new Random();

	public String getResult() {
		int n = random.nextInt(10);
		if(n < 2) {
			return "あ!";
		} else if(n < 5) {
			return "ふぁ";
		} else if(n < 7) {
			return "ヴぁ";
		} else {
			return "ば";
		}
	}
}
