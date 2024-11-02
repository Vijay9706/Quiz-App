import java.util.Scanner;

public class QuestionService {

	Question question[] = new Question[5];
	
	String answer [] = new String[5];	
	
	public QuestionService() {
	

		question[0] = new Question(1, "Who invented the World Wide Web?", "Marc Andreessen", "Tim Berners-Lee", "Bill Gates", "Larry Page", "Tim Berners-Lee");
		question[1] = new Question(2, "What year did the first man land on the moon?", "1965", "1969", "1972", "1973", "1969");
		question[2] = new Question(3, "Which programming language is known as the backbone of web development?", "JavaScript", "Python", "PHP", "Ruby", "JavaScript");
		question[3] = new Question(4, "What is the capital of France?", "Berlin", "Madrid", "Rome", "Paris", "Paris");
		question[4] = new Question(1, "Java Establlish", "1962", "1972", "1982", "1985", "1985");
	}




	public void playQuiz() {
		int i=0;
		int score=0;
		for (Question questions : question) {
			System.out.println(questions.getId());
			System.out.println(questions.getQuestion());
			System.out.println(questions.getOpt1());
			System.out.println(questions.getOpt2());
			System.out.println(questions.getOpt3());
            System.out.println(questions.getOpt4());
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Type Your Anser");
            answer [i]= scanner.nextLine();
            i++;
            
            if(answer.equals(questions.getAnswer())) {
            	score+=10;
            }
          
		}
		System.out.println("Score: " + score);
		for (String s : answer) {
			System.out.println(s);
		}
		
		
			}
         
	
}
