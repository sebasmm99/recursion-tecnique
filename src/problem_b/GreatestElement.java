package problem_b;

public class GreatestElement {
	
	public static void main(String[] args) {
		
		int[] numbers = {7,5,8,22,66,450,78,12};
		
		System.out.println("El mayor elemento del arreglo es " + g(numbers, 0 , numbers[0]));
		
	}
	
	public static int g(int[] elements, int index, int max) {
		
		if(index != elements.length) {
			
			if (elements[index] > max) {
				max = g(elements, index + 1, elements [index]);
			}
			else {
				max = g(elements, index + 1, max);
			}
			
		}
		
		return max;
		
	}

}
