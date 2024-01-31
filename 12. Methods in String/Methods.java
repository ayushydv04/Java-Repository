public class Methods {

    public static void main(String[] args) {
        String name = "Ayush";
        
        // 1. get length of string
        // int len = name.length();
        // System.out.println(len);

        // // 2. To lower case
        // String lower = name.toLowerCase();
        // System.out.println(lower);

        // // 3. To upper case
        // String upper = name.toUpperCase();
        // System.out.println(upper);

        // 4. To trim() extra spaces
        // String nontrimmedString = "     Ayush    ";
        // System.out.println(nontrimmedString.trim());


        // 5. Substring(int start) --> to print string from a particular index
        // System.out.println(name.substring(2));

        // 6. substring(int start, int end) --> To print string from a particular index to a particular index
        // System.out.println(name.substring(1, 4));

        // 7. replace() --> To replace characters
        // System.out.println(name.replace("h", "s"));

        // 8. replace() --> To replace some words or to add many words in place of a word
        // System.out.println(name.replace("ush", "hiiii"));

        // 9. startsWith() --> return true if it starts with the same character
        // System.out.println(name.startsWith("A"));
        
        // 10. endsWith() --> return true if it ends with the same character
        // System.out.println(name.endsWith("h"));

        // 11. charAt() -->  returns character at certain index
        // System.out.println(name.charAt(3));

        // 12. indexOf() --> returns the index of the given string
        // System.out.println(name.indexOf("sh"));

        // 13. indexOf("s", 3) --> Search first occ. index but from index 3
        // System.out.println(name.indexOf("y", 2));

        // 14. lastIndexOf("r") --> returns the last index of the given string 
        // System.out.println(name.lastIndexOf("s"));

        // 15. lastIndexOf("r", 2) --> Search in only starting 2 index
        // System.out.println(name.lastIndexOf("s", 2));

        // 16. equals("") --> Check if string is equal or not
        // System.out.println(name.equals("Ayush"));

        // 17. equalIgnoreCase("") --> This is case-insensitive
        // System.out.println(name.equalsIgnoreCase("ayush"));

    }
}