
public class QuizDemo extends Question {
    
    private String answer;
    private String text;
    private boolean condition = false;
    //Constructs a question with empty question and answer.
    public QuizDemo(){
      answer = "";
      text = "";
    }

    public void setText(String questionText){
      text = questionText;
    }

    public void setAnswer(String correctResponse){
      answer = correctResponse;
    }

    public boolean checkAnswer(String response){
      if(answer.contains(response)){
        condition = true;

        System.out.println("Correct answer");
        }
        else{
          condition = false;
          System.out.println("Wrong answer");
        }
        return condition;
    }

    public void display(){
      System.out.println(text);
    }
}