package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Robot> robotList  = new ArrayList<>();
        List<Citizen> citizenList = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            if (tokens.length == 2) {
                Robot robot = new Robot(tokens[0], tokens[1]);
                robotList.add(robot);
            } else {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                citizenList.add(citizen);
            }
            line = scanner.nextLine();
        }

        String fakeIdPostFix = scanner.nextLine();

        for (Robot r : robotList) {
            if(r.getId().endsWith(fakeIdPostFix)){
                System.out.println(r.getId());
            }
        }
        for (Citizen c : citizenList) {
            if(c.getId().endsWith(fakeIdPostFix)){
                System.out.println(c.getId());
            }
        }
    }
}
