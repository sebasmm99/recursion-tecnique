package problem_d;

public class Digits {

	public static void main(String[] args) {
		
		int number = 85;
		
		System.out.println("El número consta de " + d(number) + " digitos");

	}
	
	public static int d(int element) {
		if(element<10){
            return 1;
        } else {
            return d(element/10) + 1;
        }
	}

}
