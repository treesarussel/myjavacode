package automationtesting;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		        String input = "name123"; // Replace with your input string

		        boolean isAlpha = true;
		        for (char c : input.toCharArray()) {
		            if (!Character.isLetter(c)) {
		                isAlpha = false;
		                break;
		            }
		        }

		        System.out.println("IsAlpha: " + isAlpha);
		    }
		

	}


