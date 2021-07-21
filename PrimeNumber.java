package primenumbers;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 6;
		
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("The number is not pirme");
			return;
		}
		
		if(number<1) {
			System.out.println("Invalid number");
		}
		
		for(int i = 2;i<number;i++) {
			if(number %i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}
}
