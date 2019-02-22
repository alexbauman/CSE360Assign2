package cse360assign2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Choose an operation:\n(1) Add\n(2) Subtract\n(3) Multiply\n(4) Divide\n(5) History\n(6) Total");
			op = sc.nextInt();
			switch(op) {
			case 1: System.out.println("Enter an integer to add");
					calc.add(sc.nextInt());
					System.out.println("Total: " + calc.getTotal());
					break;
			case 2: System.out.println("Enter an integer to subtract");
					calc.subtract(sc.nextInt());
					System.out.println("Total: " + calc.getTotal());
					break;
			case 3: System.out.println("Enter an integer to multiply");
					calc.multiply(sc.nextInt());
					System.out.println("Total: " + calc.getTotal());
					break;
			case 4: System.out.println("Enter an integer to divide");
					calc.divide(sc.nextInt());
					System.out.println("Total: " + calc.getTotal());
					break;
			case 5: System.out.println(calc.getHistory());
					break;
			case 6: System.out.println("Total: " + calc.getTotal());
					break;
			default: break;
			}
		} while (op != 0);

	}

}
