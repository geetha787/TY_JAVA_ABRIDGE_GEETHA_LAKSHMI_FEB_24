package com.capgemini.assignments.day3;

public class Emp {
	
	int id;
	String name;
	long sal;

	

	public Emp(int id, String name, long sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public static void main(String[] args) {
		Emp[] emp=new Emp[4];
		Emp s1=new Emp (101,"swaroopa",9076);
		Emp s2=new Emp(102,"sakshi",7879);
		Emp s3=new Emp(103,"disha",6778);
		Emp s4=new Emp(104,"anupuma",78098);
		emp[0]=s1;
		emp[1]=s2;
		emp[2]=s3;
		emp[3]=s4;
		printEmployeeDetails(emp);
		Emp[] e= getEmployees();
		printEmployeeDetails(emp);

			}
			static void printEmployeeDetails(Emp[] empp) {
				for(int i=0;i<empp.length;i++) {
					System.out.println("Name--"+empp[i].name);
					System.out.println("id--"+empp[i].id);
					System.out.println("percentage--"+empp[i].sal);
					System.out.println("_____________");
				}
			}
				static Emp[] getEmployees() {
					
					Emp[] e=new Emp[4];
					Emp s1=new Emp (101,"swaroopa",9076);
					Emp s2=new Emp(102,"sakshi",7879);
					Emp s3=new Emp(103,"disha",6778);
					Emp s4=new Emp(104,"anupuma",78098);
					e[0]=s1;
					e[1]=s2;
					e[2]=s3;
					e[3]=s4;
					return e;
				}
				
	}


