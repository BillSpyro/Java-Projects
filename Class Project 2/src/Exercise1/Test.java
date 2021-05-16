package Exercise1;

import java.util.ArrayList;
import java.security.SecureRandom;

class Question{
	private String _question;
	private String[] _answers;
	private int _correctAnswer;

	Question(String question, String[] answers, int correctAnswer){
		this._question=question;
		this._answers=answers;
		this._correctAnswer=correctAnswer;
	}
	
	public int get_correctAnswer()
	{
		return this._correctAnswer;
	}
	
	public String get_question()
	{
		return this._question;
	}

	public String[] get_answers()
	{
		return this._answers;
	}

}

public class Test {
	private ArrayList<Question> _testQuestions;
	private SecureRandom _sRandom;
	private String _name;
	private int _numCorrectAns;

	Test(String name){
		this._testQuestions=new ArrayList<Question>();
		this._sRandom=new SecureRandom();
		this._name=name;
		this._numCorrectAns=0;

		this._testQuestions.add(new Question("In the Scanner class what does System.in mean?",
																					 new String[]{"Gets mouse input",
																													 "Gets trackpad input",
																													 "Gets USB files",
																													 "Gets Keyboard input"},3));
		this._testQuestions.add(new Question("What is the Default Initial Value for String Variables?",
																					 new String[]{"nil", "NaN","null", "0"},2));
		this._testQuestions.add(new Question("When declaring a class what keyword does it use?",
				 																	 new String[]{"program","class", "java", "int"},1 ));
		this._testQuestions.add(new Question("Non-static methods are typically called?",
																					 new String[]{"instance methods;",
																													 "static methods;",
																													 "methods",
																													 "non-static methods;"},0));
		this._testQuestions.add(new Question("What is the correct way to format a float with two digits?",
				 																	 new String[]{"%f.2","%.f2", "f2%","%.2f "},3));
	}

	public double get_numCorrectAns(){return this._numCorrectAns;}
	public String get_name(){return this._name;}

	public Question simulateQuestion(){
		return this._testQuestions.remove(0);
	}

	public boolean checkAnswer(Question q, int ans){
		if (q.get_correctAnswer()==ans){
			this._numCorrectAns+=1;
			return true;
		}
		else {
			return false;
		}
	}

	public String generateMessage(boolean goodMessage){
		int randNum=this._sRandom.nextInt(4);
		if (goodMessage){
			switch (randNum){
				case 0:
					return "Excellent!";
				case 1:
					return "Good!";
				case 2:
					return "Keep up the good work!";
				case 3:
					return "Nice work!";
				default:
					return "error";
			}
		}
		else {
			switch (randNum){
				case 0:
					return "No. Please try again";
				case 1:
					return "Wrong. Try once more";
				case 2:
					return "Don't give up!";
				case 3:
					return "No. Keep trying...";
				default:
					return "error";
			}
		}
	}

}