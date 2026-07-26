package basic;

//MyTask Restart

/* Write the program to given number is odd or even without using if else statement
* Write the program to given number is odd or even  using if else statement
* Write the program to given number is negative number or positive number without using if else statement
* Write the program to given number is negative number or positive number  using if else statement
* Write the program to check the person vote eligible or not without using if else statement
* Write the program to check the person vote eligible   using if else statement
* Write the program to print student grade without using switch statement
* Write the program to print battery charging percentage print.
//LoopBaseTask
*  Write the program to print i love you mom in 10 time 
* i want this kind of output like 13610 
* write the program to print even number 
* write the program to print odd number
* Write the program to check given character is vowels or not
* Write the program to check given character is vowels or not using switch statement
* write the program to print given number is number or not without using if else statement
* write the program to print given number is number or not  using if else statement
* write the program to print student is pass or not without using if else statement
* write the program to print student is pass or not  using if else statement
* write the program to print atm pin user give wrong input for 3 time account was blocked
* write the program to print increase water litre 
* write the program to print rocket lunched
*/

// 
class Part1Practice {
	public static void main(String[] args) {
		int num = 2;
		System.out.println((num % 2 == 0) ? "even" : "odd");
	}
}

// Write the program to given number is odd or even  using if else statement
class Workout1 {
	public static void main(String[] args) {
		int num = 1;
		if (num % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");
	}
}

// Write the program to given number is negative number or positive number without using if else statement
class Workout2 {
	public static void main(String[] args) {
		int input = -2;
		System.out.println((input < 0) ? "Negative" : "Positive");
	}
}

// Write the program to given number is negative number or positive number  using if else statement

class Workout3 {
	public static void main(String[] args) {
		int input = 3;
		if (input < 0) {
			System.out.println("Negative");
		} else
			System.out.println("Positive");
	}
}

// Write the program to check the person vote eligible or not without using if else statement
class Workout4 {
	public static void main(String[] args) {
		int age = 12;
		System.out.println((age < 18) ? "Not Eligible to Vote" : "Eligible to Vote");

	}
}

// Write the program to check the person vote eligible   using if else statement
class Workout5 {
	public static void main(String[] args) {
		int age = 33;
		if (age < 18) {
			System.out.println("Not Eligible");
		} else
			System.out.println("Eligible");
	}
}

// Write the program to print student grade without using switch statement
class Workout6 {
	public static void main(String[] args) {
		int grade = 390;
		System.out.println((450 <= grade && 500 >= grade) ? "Your Grade is A"
				: (350 < grade && 450 > grade) ? "Your Grade is B" : "Grade is C");
	}

}

// Write the program to print battery charging percentage print.
class Workout7 {
	public static void main(String[] args) {
		int battery = 0;
		do {
			battery++;
			System.out.println("Battery Percentage :" + battery + "%");
			if (battery == 100) {
				System.out.println("Fully Charged");
			}

		} while (battery != 100);
	}
}

// i want this kind of output like 13610 
class Workout9 {
	public static void main(String[] args) {
		int value = 0;
		for (int i = 1; i < 5; i++) {
			value = value + i;
			System.out.println(value);
		}
	}
}

// write the program to print even number 
class Workout10 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}

// write the program to print odd number
class Workout11 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}

// Write the program to check given character is vowels or not
class Workout12 {
	public static void main(String[] args) {
		char ch = 'd';
		System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowels" : "Not Vowels");
	}
}

// Write the program to check given character is vowels or not using switch statement
class Workout13 {
	public static void main(String[] args) {
		char ch = 'y';
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not Vowel");
		}

	}
}

// write the program to print given number is number or not without using if else statement
class Workout14 {
	public static void main(String[] args) {
		char ch = 's';
		System.out.println((ch >= '1' && ch <= '9') ? "number" : "not Number");
	}
}

// write the program to print given number is number or not  using if else statement
class Workout15 {
	public static void main(String[] args) {
		char ch = 'i';
		if (ch >= '1' && ch <= '9') {
			System.out.println("Given Value is Number");
		} else
			System.out.println("Given Value is Not Number");
	}
}

// write the program to print student is pass or not without using if else statement
class Workout16 {
	void call(int t, int e, int m, int sc, int so) {
		System.out.println((t > 35 && e > 35 && m > 35 && sc > 35 && so > 35) ? "pass" : "fail");
		return;
	}

	public static void main(String[] args) {
		Workout16 s1 = new Workout16();
		s1.call(48, 58, 77, 89, 48);

	}
}

// write the program to print student is pass or not  using if else statement
class Workout17 {
	void func(int t, int e, int m, int sc, int so) {
		if (t > 35 && e > 35 && m > 35 && sc > 35 && so > 35) {
			System.out.println("pass");
		} else
			System.out.println("fail");

	}

	public static void main(String[] arg) {
		Workout17 s1 = new Workout17();
		s1.func(88, 32, 82, 38, 82);

	}
}

// write the program to print atm pin user give wrong input for 3 time account was blocked
class Workout18 {
	public static void main(String[] args) {
		int pin = 124;
		int count = 1;
		do {

			if (count <= 3) {
				System.out.println("Enter Your Pin");
				count++;
				if (count == 4) {
					System.out.println("card Blocked");
				}
			}

		} while (pin != 1234);
		System.out.println("welcome");
	}
}

// write the program to print increase water litre 
class Workout19 {
	public static void main(String[] args) {
		int litre = 0;
		int capacity = 100;
		int addwater = 10;
		do {
			if (litre <= 100) {
				litre = litre + addwater;
				System.out.println("Tank Capacity is " + litre + " %");
				if (litre == 100) {
					System.out.println("Tank Filled");
				}
			}

		} while (litre != capacity);

	}
}

// write the program to print rocket lunched
class Workout20 {
	public static void main(String[] args) {
		int count = 10;
		{
			do {
				if (count >=1) {
					System.out.println("Rocket Lunch Within " + count + "Sec");
					count--;
				}
			} 
			while (count != 0);
			System.out.println("Rocket lunched");
		}

	}
}