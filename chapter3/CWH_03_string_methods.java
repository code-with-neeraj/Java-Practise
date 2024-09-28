public class CWH_03_string_methods {
    public static void main(String[] args) {
        String name = "Neeraj";

        // System.out.println(name);

        // int value = name.length();
        // System.out.println(value);

        // String lString = name.toLowerCase();
        // System.out.println(lString);

        // String uString = name.toUpperCase();
        // System.out.println(uString);

        // String nonTrimmedString = "      Neeraj         ";
        // System.out.println(nonTrimmedString);

        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);

        // System.out.println(name.substring(3));
        // System.out.println(name.substring(2,5));
        // System.out.println(name.replace('r', 'a'));
        // System.out.println(name.replace("eer", "ir"));

        // System.out.println(name.startsWith("N"));
        // System.out.println(name.endsWith("r"));

        // System.out.println(name.charAt(4));
        // System.out.println(name.indexOf("e"));
        // System.out.println(name.indexOf("e", 4));
        // System.out.println(name.lastIndexOf("e", 5));

        System.out.println(name.equals("neeraj"));
        System.out.println(name.equalsIgnoreCase("neeraj"));

        System.out.println("I an escape sequence \" double quote");
        System.out.println("I an escape sequence \t hey i am");
        System.out.println("I an escape sequence \'' hey i am");
        System.out.println("I an escape sequence \\ hey i am");
    }
}
