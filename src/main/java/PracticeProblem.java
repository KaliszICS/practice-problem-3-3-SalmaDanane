public class PracticeProblem {

	public static void main(String args[]) {

	}
   public static String evenOrOdd(int number) {
	String evenOrOdd;
	if ((number % 2) == 0) {
		evenOrOdd = "Even";
	}
	if (number == 0) {
		evenOrOdd = "Zero";
	}
	else if ((number % 2) != 0) {
		evenOrOdd = "Odd";
	}
	return evenOrOdd;
   }

   public static String positiveOrNegative(int number) {
	String positiveOrNegative;
	if (number > 0) {
		positiveOrNegative = "Positive";
	}
	else if (number < 0) {
		positiveOrNegative = "Negative";
	}
	else {
		positiveOrNegative = "Zero";
	}
	return positiveOrNegative;
   }
   
   public static String pluralize(String word) {
	word = word.toLowerCase();
	String pluralize;
	if (word.endsWith("ey")) {
		pluralize = "eys";
	}
	else if (word.endsWith("y")) {
		pluralize = "ies";
	}
	else if(word.endsWith("ife")) {
		pluralize = "ives";
	}
    else {
		pluralize = "s";
	}
	return pluralize;
   }
	
	}

