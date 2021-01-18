
public class NumerosPrimos {
	
	int n ;
	
	public NumerosPrimos(int n) {
		this.n = n;
	}

	public void ehPrimo(NumerosPrimos numero){	
		if(n <= 0) {
			System.out.println("invalid argument");
		}else {
			for (int  i = 2; i < n; i++) {
				if ( n % i == 0) {
					System.out.println("not a prime number");
				}else {
					System.out.println("prime number");
				}
				break;
			}
		}
	}
}