package problem_a;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 17;
        System.out.print(p(number, 2)?"SI es un número primo.":"NO es un número primo.");
    }
     
    public static boolean p(int num, int divisor){
        if(num/2 < divisor){
            return true;
        } else {
            if(num%divisor==0){
                return false;
            } else {
                return p(num, divisor+1);
            }
        }
    }

}
