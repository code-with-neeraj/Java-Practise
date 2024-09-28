// package PRA03;

public class pr_problem {
    public static void main(String[] args) {
        // Question1: write a java program to convert a string to lowercase?

        String name = "NEERAJ";
        name = name.toLowerCase();
        System.out.println(name);


        // Question2: write a java program to replace spaces with underscores?

        String name1 = "Neeraj kumar 2002";
        name1 = name1.replace(" ", "_");
        System.out.println(name1);
        

        // Question3: write a java program to fill in a letter template which looks
        //  like below:
        //  letter = "Dear <|name|>, Thanks a lot!"
        //  Replace <|name|> with a string (some name)

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Neeraj");
        System.out.println(letter);


        // Question4: write a java program to detect double and triple spaves in a string?
        String MyString = "This string contains  double and triple spaces";
        System.out.println(MyString.indexOf("  "));
        System.out.println(MyString.indexOf("   "));


        // Question5: write a program to format the following letter using escape swquence Characters. 
        // letter ="Dear Neeraj, This java course is nice . Thanks" 

        System.out.println("Dear Neeraj,\n \tThis java course is nice. \nThanks");
    }
    
}
