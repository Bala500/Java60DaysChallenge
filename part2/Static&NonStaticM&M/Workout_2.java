package part2;

public class Workout_2 {
	static int a=10;
	int b=20;
	static int c=30;
	int d=40;
	public static void main(String [] args)
	{
		System.out.println("----------Before Change Value-----------");
		System.out.println("A Value :"+Workout_2.a);
		System.out.println("C Value :"+Workout_2.c);
		System.out.println("B Value :"+new Workout_2().b);
		System.out.println("D Value :"+new Workout_2().d);
		System.out.println("------------------------------------------");
		System.out.println("----------After Changed Value--------------");
		System.out.println("A Value :"+(Workout_2.a=100));
		System.out.println("C Value :"+(Workout_2.c=300));
		System.out.println("B Value :"+(new Workout_2().b=500));
		System.out.println("D Value :"+(new Workout_2().d=400));
	}

}
