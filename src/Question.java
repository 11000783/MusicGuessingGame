import java.util.Random;

public class Question {
	
	Random random = new Random();
	int wrongAns1;
	int wrongAns2;
	int wrongAns3;
	int rightAns;

	public Question(int rightAns) {
		int wrong = 0;
		this.rightAns = rightAns;
		while (wrong < 3) {
			int randomAns = random.nextInt(5);
			if (randomAns != rightAns) {
				if (wrong == 0) {
					wrongAns1 = randomAns;
					wrong++;
				} else if (wrong == 1 && wrongAns1 != randomAns) {
					wrongAns2 = randomAns;
					wrong++;
				} else if (wrong == 2 && wrongAns1 != randomAns && wrongAns2 != randomAns) {
					wrongAns3 = randomAns;
					wrong++;
				}
			}
		}
		// TODO Auto-generated constructor stub

	}

}

//