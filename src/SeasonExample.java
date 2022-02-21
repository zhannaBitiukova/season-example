import java.util.Scanner;

public class SeasonExample {

  public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
  }

  public static void main(String[] args) {

    System.out.println("Please type a month name:");
    Scanner scanner = new Scanner(System.in);
    String month = scanner.nextLine();

    String season_recognized;

    switch(month.toLowerCase()) {
      case "december":
      case "january":
      case "february":
        season_recognized = Season.WINTER.toString();
        break;
      case "march":
      case "april":
      case "may":
        season_recognized = Season.SPRING.toString();
        break;
      case "june":
      case "july":
      case "august":
        season_recognized = Season.SUMMER.toString();
        break;
      case "september":
      case "october":
      case "november":
        season_recognized = Season.AUTUMN.toString();
        break;
      default:
        season_recognized = "wrong";
    }
    System.out.println("This is a " + season_recognized + " month.");
  }
}
