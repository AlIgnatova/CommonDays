import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Main  {
    public static List<Pair> PairsList = new ArrayList<>();
    public static List<Project> ProjectsList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO
        //all scanner.nextLine() should be modified to read data from the .csv file; also countRows
        //to be extracted from there as well
        int countRows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countRows - 1; i++) {
            String firstEmpl = scanner.nextLine();
            String secondEmpl = scanner.nextLine();
            String projID = scanner.nextLine();
            int countDays = Integer.parseInt(scanner.nextLine());

            if(pairExists()){
                //update pair
                //add the pair object to the list
            }else {
                //create pair
                //add the pair object to the list
            }
        }
        //TODO
        //sort the list of pairs according to the workedDays
    }

    private static boolean pairExists() {
        //TODO
        return true;
    }
}
