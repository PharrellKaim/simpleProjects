import java.util.Scanner;

public class NameGenerator{
    private void generation( String Date, String Priority, String Category, String FileName) {
        System.out.println("Some Suggestions:");
        System.out.println(Date+"-"+Priority+"-"+Category+"-"+FileName);

        //tbd: create better naming, maybe with translation etc
    }

    public static void main(String[] args){
        //Generate instance and Scanner
        NameGenerator NameGenerator = new NameGenerator();
        Scanner in = new Scanner(System.in);

        //Request date
        System.out.println("Enter your Date (ddmmyyy or mmyyyy or yyyy): ");
        String date = in.nextLine();
        //Request Priority
        System.out.println("Enter your Priority (A,B,C): ");
        String priority = in.nextLine();
        //Request Category
        System.out.println("Enter Your Category: ");
        String category = in.nextLine();
        //Request Filename
        System.out.println("Name your File: ");
        String fileName = in.nextLine();

        NameGenerator.generation( date, priority, category, fileName);
        //maybe: genenrate some more suggestions
    }
}