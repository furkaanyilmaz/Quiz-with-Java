import java.util.Scanner;
import java.util.ArrayList;

public class Quiz{

  public static int score;
  public static void main(String[] args){

    Question one = new Question();
    one.setText("Who was the inventor of Java?");
    one.setAnswer("James Gosling");

    ChoiceQuestion two = new ChoiceQuestion();
    two.setText("In which country was the inventor of Java born?");
    two.addChoice("Australia", false);
    two.addChoice("Canada", true);
    two.addChoice("Denmark", false);
    two.addChoice("United States", false);

    ArrayList<Question> list = new ArrayList<Question>();

    list.add(one);
    list.add(two);

for(Question questions : list){
      presentQuestion(questions);
      }

    System.out.println("");

    

    }

    public static void presentQuestion(Question question)
    {
      question.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(question.checkAnswer(response));
    }
}