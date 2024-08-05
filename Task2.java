import java.util.*;

class Student{
	int sub1,sub2,sub3,sub4, sub5, totalMarks, avgMarks;
	String grade;
	
	void getmarks(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 5 subjects: ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		sub4 = sc.nextInt();
		sub5 = sc.nextInt();
	}
	
	void calculate(){
		totalMarks = sub1 +sub2 +sub3 +sub4 +sub5;
		avgMarks = totalMarks/5;
	}
	void division(){
		if(avgMarks>100){
			System.out.println("Enter valid Marks.");
		}
		if(avgMarks >= 80){
			grade = "A";
		}
		else if(avgMarks>=65 && avgMarks<80){
			grade = "B";
		}
		else if(avgMarks>=50 && avgMarks<65){
			grade = "C";
		}
		else if(avgMarks>=33 && avgMarks<50){
			grade = "D";
		}
		else{
			grade = "F";
		}
		
	}
	
	void display(){
		System.out.println("Total Marks = " + totalMarks);
		System.out.println("Average Marks = " + avgMarks);
		System.out.println("Grade = " + grade);
	}
}

class Task2{
	public static void main(String arg[]){
		Student st = new Student();
		st.getmarks();
		st.calculate();
		st.division();
		st.display();
	}
}