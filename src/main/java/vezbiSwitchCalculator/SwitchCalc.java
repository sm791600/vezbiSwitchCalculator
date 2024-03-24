/*Напиши програма која ќе претставува калкулатор со прости аритметички
операции: собирање, одземање, множење и делење. Во програмата треба да се
напише метод со кој ќе се внесат двата операнди и соодветниот оператор. Доколку се
внесе невалиден оператор соодветно да се постапи.*/

package vezbiSwitchCalculator;
import java.util.Scanner;
public class SwitchCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vnes= new Scanner(System.in);
		Scanner vnes2 = new Scanner(System.in);
		System.out.println("Vnesi prv broj");
		double a=vnes.nextDouble();
		System.out.println("Vnesi znak za operacija");
		String operacija=vnes2.nextLine();
		System.out.println("Vnesi vtor broj");
		double b=vnes.nextDouble();
		double c;
		switch(operacija) {
		case "+":
			c=a+b;
			System.out.println(a+operacija+b+"="+c);
			break;
		case "-":
			c=a-b;
			System.out.println(a+operacija+b+"="+c);
			break;
		case "*":
			c=a*b;
			System.out.println(a+operacija+b+"="+c);
			break;
		case "/":
			c=a/b;
			System.out.println(a+operacija+b+"="+c);
			break;
			default:
				System.out.println("Greska");
				break;
		}
	}

}
