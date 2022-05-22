import java.util.Scanner;

public class SeasonExample {

  public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
  }

  public static void main(String[] args) {

    System.out.println("Please type a month name:");
    Scanner scanner = new Scanner(System.in);
    String month = scanner.nextLine();

    String seasonRecognized;

    switch(month.toLowerCase()) {
      case "december":
      case "january":
      case "february":
        seasonRecognized = Season.WINTER.toString();
        break;
      case "march":
      case "april":
      case "may":
        seasonRecognized = Season.SPRING.toString();
        break;
      case "june":
      case "july":
      case "august":
        seasonRecognized = Season.SUMMER.toString();
        break;
      case "september":
      case "october":
      case "november":
        seasonRecognized = Season.AUTUMN.toString();
        break;
      default:
        seasonRecognized = "wrong";
    }
    System.out.println("This is a " + seasonRecognized + " month.");
  }
}
