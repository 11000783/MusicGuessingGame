import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question {
		String songs[] = {"1", "2", "3", "4", "5", "6"};
		Random random = new Random();
		int wrongAns1;
		int wrongAns2;
		int wrongAns3;
		int rightAns;
Set answers = new HashSet<Integer>();
		public Question(int rightAns) {
		
			answers.add(rightAns);
			while (answers.size()<4) {
				answers.add(random.nextInt(songs.length));
			}
			Integer[] ints = (Integer[])answers.toArray();
			wrongAns1 = ints[1];
			wrongAns2 = ints[2];
			wrongAns3 = ints[3];
			
			// TODO Auto-generated constructor stub
					Question questions[];
			
		
}

}

//