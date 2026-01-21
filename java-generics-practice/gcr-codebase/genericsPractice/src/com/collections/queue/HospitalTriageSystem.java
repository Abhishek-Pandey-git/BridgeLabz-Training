package com.collections.queue;

import java.util.*;

//class to represent the atient with severity
class Patient {
	String name;
	int severity;

	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}
}

public class HospitalTriageSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// asking for user input
		System.out.println("Enter 1 for adding pateint\t\t Enter 0 to exit program");
		int choice = input.nextInt();

		// comparator to make the comparison
		Comparator<Patient> comp = ((a, b) -> Integer.compare(b.severity, a.severity));

		// initializing the queue
		Queue<Patient> patients = new PriorityQueue<>(comp);

		// further logic
		if (choice == 0) {
			System.out.println("Thankyou!");
			input.close();
			return ;
		} else if (choice == 1) {
			boolean runLoop=true;
			while (runLoop) {
				System.out.println("Enter pateint name: ");
				String name = input.next();
				System.out.println("Enter the severity: ");
				int severity = input.nextInt();

				Patient patient = new Patient(name, severity);
				patients.offer(patient);

				while (true) {
					System.out.println("Enter 1 for adding pateint\tEnter 2 for treating the pateint\tEnter 0 to exit program");
					choice = input.nextInt();
					if (choice == 2) {
						patient = patients.poll();
						System.out.println("Patient treated: " + patient.name + " " + patient.severity);
					} else if (choice == 1) {
						break;

					} else {
						runLoop=false;
						break;
					}
					
				}

			}
		}
		
		else {
			System.out.println("Thankyou!!! Exiting now");
		}

		input.close();
	}

}
