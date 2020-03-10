package com.capgemini.arrays;

public class StudentMain {
	
	public static void main(String[] args) {
Student [] students=new Student[4];
Student s1=new Student (101,"swaroopa",90.89);
Student s2=new Student(102,"sakshi",78.79);
Student s3=new Student(103,"disha",67.78);
Student s4=new Student(104,"anupuma",78.8);
students[0]=s1;
students[1]=s2;
students[2]=s3;
students[3]=s4;
printStudentDetails(students);
Student[]stu= getStudents();
printStudentDetails(stu);

	}
	static void printStudentDetails(Student[] stu) {
		for(int i=0;i<stu.length;i++) {
			System.out.println("Name--"+stu[i].name);
			System.out.println("id--"+stu[i].id);
			System.out.println("percentage--"+stu[i].percentage);
			System.out.println("_____________");
		}
	}
		static Student[] getStudents() {
			Student [] students=new Student[4];
			Student s1=new Student (101,"swaroop",90.89);
			Student s2=new Student(102,"sachin",78.79);
			Student s3=new Student(103,"disha",67.78);
			Student s4=new Student(104,"anupuma",78.8);
			
			students[0]=s1;
			students[1]=s2;
			students[2]=s3;
			
			students[3]=s4;
			return students;
		}
		
	}


