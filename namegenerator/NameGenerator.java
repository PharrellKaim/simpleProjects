public class NameGenerator{
    private void generation(String Category, int Date, String Priority, String FileName) {
        System.out.println("Some Suggestions:");
        System.out.println(Date+"-"+Priority+"-"+Category+"-"+FileName);

        //tbd: more suggestions
        //tbd: create better naming, maybe with translation etc
    }

    public static void main(String[] args){
        NameGenerator NameGenerator = new NameGenerator();
        String Category = "W";
        int Date = 102022;
        String Priority = "C";
        String FileName = "TestFile";
        NameGenerator.generation(Category, Date, Priority, FileName);
        //input has to be done 
        // more testing -> very fast project, bc no time :) 
    }
}