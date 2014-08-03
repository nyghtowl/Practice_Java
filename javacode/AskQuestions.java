import java.util.Scanner;

public class AskQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double time;

		System.out.print("How old are you?");
		age = keyboard.nextInt();
		System.out.print("How tall are you?");
		height = keyboard.next();
		System.out.print("What time is it?");
		time = keyboard.nextDouble();

		System.out.println("So you're" + age + "old, " + height + "tall and its " + time);
	}
}
