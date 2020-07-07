package problem28;

public class answer28 {
    public static void main(String[] args) {
        
    
    char[] chars = {'I', 'n', 's', 'e', 'r', 't'}; 

		// Create two MyStringBuilder1 objects
		MyStringBuilder1 str1 = new MyStringBuilder1("testString");
		MyStringBuilder1 str2 = new MyStringBuilder1(chars);

		// Insert str2 into str1 at index 3
		System.out.print("\nInsert string 2 into string 1 at index 3: ");
		MyStringBuilder1 str3 = str1.insert(3, str2);
		System.out.println(str3);

		// Reverse str1
		System.out.println("\nReverse string 1: " + str1.reverse());

		// Create a substring of str3 from index 10
		System.out.println("\nSubstring of string 3 beginning index 10: " + 
			str3.substring(10));

		// Display str2 in all upper case
		System.out.println("\nString 2 to upper case: " + str2.toUpperCase());
}
}