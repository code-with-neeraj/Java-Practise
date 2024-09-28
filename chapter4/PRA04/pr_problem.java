



public class pr_problem {
    public static void main(String[] args) {
        // Question1: what will be the output of this program:
        //  int a = 10;
        //  if(a = 11)
        //  System.out.println("I am 11");
        //  else
        //  System.out.println("I am not 11");

        // int a = 10;
        // if(a==11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }


        // Question2:write a program to find out whether a student is pass or fail; 
        // if it requires total 40& and at leat 33% in each subject to pass. Assume
        // 3 Subjects and take marks as and input from the user.

        // byte m1, m2, m3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks in Physics: ");
        // m1 = sc.nextByte();
        // System.out.println("Enter your marks in Chemistry: ");
        // m2 = sc.nextByte();
        // System.out.println("Enter your marks in Mathematics: ");
        // m3 = sc.nextByte();
        
        // float avg = (m1+m2+m3)/3.0f;
        // System.out.println("overall percentage is: " + avg);

        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("Congratulations, You have been promoted");
        // }else{
        //     System.out.println("Sorry, You have not been promoted! Please try again");

        // }

        // Question3:Calculate income tax paid by and employee to the government as per the slabs mentioned below:
        // Income Slab              Tax
        // 2.5L -5.0L                5%
        // 5.0L -10.0L               20%
        // Above -10.0L              30%

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your incomein Lakhs per annum: ");
        // float tax = 0;
        // float income =  sc.nextFloat();
        // if(income<=2.5){
        //     tax = tax + 0;
        // }
        // else if(income>2.5f && income<=5f){
        //     tax = tax + 0.05f * (income- 2.5f);
        // }
        // else if(income>5f && income<=10.0f){
        //     tax = tax + 0.05f * (5.0f- 2.5f);
        //     tax = tax + 0.2f * (income- 5.0f);
        // }
        // else if(income>10.0f){
        //     tax = tax + 0.05f * (5.0f- 2.5f);
        //     tax = tax + 0.2f * (10.0f- 5.0f);
        //     tax = tax + 0.3f * (income- 10.0f);
        // }

        // System.out.println("The total tax paid by the employee is: " + tax);

        // Question4:write a java program to find out the day of the week a given the number
        // [ 1 for Monday, 2 for Tuesday... and do on!] 

        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        
        //     default:
        //         break;

        // }

        // Question5:Write a java program to find whether a year entered by the user
        // is a leap year or not.


        // Question6: write a program to find out the type of website from the url
        // .com--> Commercial website
        // .org--> Organization website
        // .in--> Indian website

        // Scanner sc = new Scanner(System.in);
        // String website = sc.next();
        // if (website.endsWith(".org")) {
        //     System.out.println("This is an Commercial website");
        // } 
        // else  if(website.endsWith(".com")){
        //     System.out.println("This is an Organization website");
        // }
        // else  if(website.endsWith(".in")){
        //     System.out.println("This is an Indian website");
        // }



    }
    
}
