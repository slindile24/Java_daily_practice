package LearnUnitTesting.CapitalizeWord;

public class Capitalize {
    public String capitalize(String word){
        char firstChar = word.charAt(0);
        char upperFirstChar = Character.toUpperCase(firstChar);
        String upperFirst = String.valueOf(upperFirstChar);
        String capitalized = upperFirst + word.substring(1);
        return capitalized;
    }
}
