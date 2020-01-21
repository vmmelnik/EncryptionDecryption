package encryptdecrypt;

public class Main {

	public static void main(String[] args) {
		
		String mode = "enc";
		int key = 0;
		String originalText = "";
		
		for (int i = 0; i < args.length; i += 2) {
			switch (args[i]) {
			case "-mode":
				mode = args[i+1];
				break;
			case "-key":
				key = Integer.parseInt(args[i+1]);
				break;
			case "-data":
				originalText = args[i+1];
				break;
			default:
				break;
			}
		}
			
		char[] arrayText = originalText.toCharArray();
			
		if (mode.equals("enc")) {
			enc(arrayText, key);
			System.out.println(new String(arrayText));
		} else if (mode.equals("dec")) {
			dec(arrayText, key);
			System.out.println(new String(arrayText));
		} else {
			System.out.println("Unknown command!");
		}
		
		String firstName = null;
		String lastName = "null";
		//firstName.isEmpty();
		System.out.println((firstName.isEmpty() ? "" : firstName) +  " " + ("null".equals(lastName) ? "" : lastName));
		//+ " " + "null".equals(lastName) ? "" : lastName
		
	}
	
	
	private static char[] enc (char[] Text, int key) {
		for (int i = 0; i < Text.length; i++) {
			int intCh = (int) Text[i];
			Text[i] = (char) (intCh + key);
		}
		return Text;
	}
	
	
	private static char[] dec (char[] Text, int key) {
		for (int i = 0; i < Text.length; i++) {
			int intCh = (int) Text[i];
			Text[i] = (char) (intCh - key);
		}
		return Text;
	}
	

}
