import java.util.Scanner;
public class FlamesChecker
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name1 = scanner.nextLine();
    System.out.println("Enter your crush's name: ");
    String name2 = scanner.nextLine();
    name1 = name1.replaceAll("\\s+", "").toLowerCase();
    name2 = name2.replaceAll("\\s+", "").toLowerCase();
    StringBuilder sb1 = new StringBuilder(name1);
    StringBuilder sb2 = new StringBuilder(name2);
    for (int i = 0; i < name1.length(); i++)
    {
      char c = name1.charAt(i);
      for (int j = 0; j < name2.length(); j++)
      {
        if (c == name2.charAt(j)) {
          sb1.deleteCharAt(i);
          sb2.deleteCharAt(j);
          name1 = sb1.toString();
          name2 = sb2.toString();
          i--;
          break;
        }
      }
    }
    int count = name1.length() + name2.length();
    String flames = "FLAMES";
    int index = 0;

    while (flames.length() > 1)
    {
      index = (index + count - 1) % flames.length();
      flames = flames.substring(0, index) + flames.substring(index + 1);
    }
    String result = "";

    switch (flames)
    {
      case "F":
        result = "Friendship";
        break;
      case "L":
        result = "Love";
        break;
      case "A":
        result = "Affection";
        break;
      case "M":
        result = "Marriage";
        break;
      case "E":
        result = "Enmity";
        break;
      case "S":
        result = "Sibling";
        break;
    }

    System.out.println("Your FLAMES result is: " + result);
  }
}
