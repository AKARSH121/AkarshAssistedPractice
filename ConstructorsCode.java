package com.AkarshJavaAssignment;

public class ConstructorsCode {

	
			int empID;
			String name;
			void display() {
				System.out.println(empID +" : "+ name);
			}


			public static void main(String[] args) {
				ConstructorsCode emp1 = new ConstructorsCode();
				emp1.display();



				paraConstructor emp2 = new paraConstructor(201452, "Akarsh");

			}

		}
		class paraConstructor{
			int empID;
			String name;
			paraConstructor(int empID,String name) {
				this.empID=empID;
				this.name=name;
				System.out.println(empID +" : "+ name);
			}
		}

