import java.util.Scanner;
public class reflectionAssembler{
    public static void main (String []args){
        
        String mostImportantThing = "", mostImportantThingWhy = "", mostSurprising="",contentQuestion = "";
        int contentQuestionAnswer = 0;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Weekly Reflection Assembler");
        System.out.println("I will ask you three simple questions, answer them truthfully using what you learned this week");
        System.out.println("Press Enter when your ready to start");
        keyboard.nextLine();

        System.out.println("First Question (Part I): What was the most important thing you learned this week?");
        mostImportantThing = keyboard.nextLine();
        System.out.println("First Question (Part II): Why was that important?");
        mostImportantThingWhy = keyboard.nextLine();
        System.out.println("Second Question: What was the biggest thing that surprised you this week (can be anything)");
        mostSurprising = keyboard.nextLine();

        do {
            System.out.println("Third Question: Do you have any questions about the content of the course this week?");
            System.out.println("Enter [1] for YES or [2] for NO");
            while (!keyboard.hasNextInt()) {
                System.out.println("Hey fuckass, Enter [1] or [2]");
                keyboard.next();
            } contentQuestionAnswer = keyboard.nextInt();
        }   while (contentQuestionAnswer != 1 && contentQuestionAnswer != 2); 


        if (contentQuestionAnswer == 2) {
            contentQuestion = "I do not have any questions about the conent of the course this week.";
        } else if (contentQuestionAnswer == 1) {
            System.out.println("What is your question?");
            contentQuestion = keyboard.nextLine();
        }

        System.out.println("The most important thing I learned this week was " + mostImportantThing + ".");
        System.out.println("This is because " + mostImportantThingWhy + ".");
        System.out.println("The most surpising this I learned this week was " + mostSurprising + ".");
        System.out.println(contentQuestion);


        keyboard.close();
    }
}
