public class HighestFrequency {
    public static void main(String[] args) {
        String str =  "aaabbccccddeeee";
        char maxChar = ' ';
        int maxFreqeancy = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            int currentCharFrequancy = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==currentChar){
                    currentCharFrequancy++;
                }
            }
            if (currentCharFrequancy>maxFreqeancy){
                maxChar= currentChar;
                maxFreqeancy=currentCharFrequancy;
            }
        }
        System.out.print(maxChar);
        System.out.print(maxFreqeancy);


    }
}

/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */