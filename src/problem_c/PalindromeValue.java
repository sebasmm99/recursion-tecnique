package problem_c;

public class PalindromeValue {

	public static void main(String[] args) {
		
		int[] numbers = {8,2,5,2,8};
		
		System.out.println(p(numbers, 0, numbers.length - 1,numbers.length));

	}
	
	public static int p(int[] elements, int index, int last, int size) {
		if(elements[index] == elements[last]) {
			if(size<3) {
				return 1;
			}
			else {
				return p(elements, index + 1, last - 1, size - 1);
			}
			
		}
		else {
			return 0;
		}		
	}
}
