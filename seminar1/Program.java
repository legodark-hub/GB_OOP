package GB_OOP.seminar1;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        
        ArrayList<Character> team1 = new ArrayList<>();
        ArrayList<Character> team2 = new ArrayList<>();

        generateTeam(team1, 10);
        generateTeam(team2, 10);

        for (Character unit : team1) {
            System.out.println(unit.getInfo());
        }

        for (Character unit : team2) {
            System.out.println(unit.getInfo());
        }
    }

    public static void generateTeam(ArrayList<Character> team, int teamSize) {
        Random random = new Random();

        for (int i = 0; i < teamSize; i++) {
            int randomClass = random.nextInt(7); // Генерация случайного числа от 0 до 6

            switch (randomClass) {
                case 0:
                    team.add(new Peasant("Peasant " + (i + 1)));
                    break;
                case 1:
                    team.add(new Rogue("Rogue " + (i + 1)));
                    break;
                case 2:
                    team.add(new Sniper("Sniper " + (i + 1)));
                    break;
                case 3:
                    team.add(new Crossbowman("Crossbowman " + (i + 1)));
                    break;
                case 4:
                    team.add(new Warlock("Warlock " + (i + 1)));
                    break;
                case 5:
                    team.add(new Spearman("Spearman " + (i + 1)));
                    break;
                case 6:
                    team.add(new Monk("Monk " + (i + 1)));
                    break;
                default:
                    break;
            }
        }
    }
}
