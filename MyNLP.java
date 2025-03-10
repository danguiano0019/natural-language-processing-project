import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {
  
  private ArrayList<String> names = new ArrayList<>();
  private ArrayList<String> firstLetters = new ArrayList<>();

  public MyNLP() {
    names = FileReader.toStringList("FirstNames.txt");
  }

  private ArrayList<String> loadNames(String firstLetter) {
    ArrayList<String> finalNames = new ArrayList<>(); 
    for (int i = 0; i < names.size(); i++) {
       if (names.get(i).substring(0,1).equals(firstLetter)) {
        finalNames.add(names.get(i));
      }
    }
    return finalNames;
  }

  public void prompt() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first letter of the name you want:");
    String userInput = input.nextLine().toUpperCase();
    
    ArrayList<String>  finalNames = loadNames(userInput);

    for (String fName : finalNames) {
      System.out.println(fName);
    }

    
    input.close();
  }

 
}