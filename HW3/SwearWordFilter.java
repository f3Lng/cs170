public class SwearWordFilter {
	
	public static String swearFilter(String text, String[] swear) {
		// String lowerText = text.toLowerCase();
		// String[] swear2 = new String[swear.length];
		// // String star = "";
		// for (int i = 0; i < swear.length; i++) {
		// 	String star = "";
		// 	//for (int j = swear[i].length - 2; j > 0; j--) {
		// 	for (int k = 0; k < swear[i].length() - 2; k++) {
		// 		star = star + "*";
		// 	}
		// 		swear2[i] = swear[i].charAt(0) + star + swear[i].charAt(swear[i].length() - 1);
		// 	text = text.replaceAll(swear[i], swear2[i]);
		// 	}
		// 	// text = text.replaceAll(swear[i], swear2[i]);
		// 	return text;
		// }


		// String lowerText = text.toLowerCase();
		// for (int i = 0; i < swear.length; i++) {
		// 	if (lowertext.contains(swear[i])) {
		// 		swear[i] = swear[i].replace(swear[i], swear2[i].charAt(0) + stars + swear2[i].charAt(swear2.length()))
		// 	}
		// }
		// return text;
		// }

		String lowertext = text.toLowerCase();
		String result = "";
		String stars = "";
		for (int i = 0; i < swear.length; i++) {
			for (int j = 0; j < swear[i].length(); j++) {
				stars += "*";
			}
			result += text.charAt(lowertext.indexOf(swear[i])) + stars + text.charAt((lowertext.indexOf(swear[i])) + swear[1].length() - 2);
		}
	
		return result;
	}


	


	public static void main(String[] args) {
		String s = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
		String[] swears = {"duck", "ship", "whole"};
		System.out.println(swearFilter(s, swears));

	}
}

//text.contains(swear[i]) WORKS!!!!!
//text.replaceAll("swear[i]", UPDATED VERSION)
//s = s.replaceAll("ship", "s**p")
