public class Storyteller {
	//DRESSES VS DRESS
	
	public static void main(String[] args) {
		System.out.println(storyteller("Alice", "Betsy", "dresses", 10, "rugs", "friends", "happily"));
	}


	public static String storyteller(String name, String name2, String poss, int num, String pluralNoun, String noun, String adverb) {
		String magicWords = name.charAt(name.length()-1) + "aa" + name.charAt(0) + " " + name2.charAt(name2.length()-1) + "ee" + name2.charAt(0) + " " + poss.charAt(poss.length()-1) + "ii" + poss.charAt(0); //s.charAt(s.length()-1) is last letter and s.charAt(0) is first letter
		String story = name + " was a beautiful princess. " + name2 + " was a wicked witch. " + name + " had " + num + " expensive " + poss + ", whereas " + name2 + " had only " + num/2 + ". Because of envy, " + name2 + " cast a spell on " + name + ", yelling these arcane magical words: '" + magicWords + "! " + magicWords.toUpperCase() + "!'. Suddenly, " + name + "'s " + num + " dresses turned into " + pluralNoun + ". " + name + " became very unhappy. Seeing that " + name + " was unhappy, " + name2 + " realized she was wrong, and reversed the spell. " + name + " and " + name2 + " became " + noun + ", and they lived " + adverb + " ever after.";
		return story;
	}
}
