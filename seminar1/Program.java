package GB_OOP.seminar1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import GB_OOP.seminar1.Classes.*;
import GB_OOP.seminar1.Classes.Character;

public class Program {
    static ArrayList<Character> team1 = new ArrayList<>();
    static ArrayList<Character> team2 = new ArrayList<>();
    static ArrayList<Character> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        generateTeam(team1, 10, 1);
        generateTeam(team2, 10, 10);

        allTeam.addAll(team1);
        allTeam.addAll(team2);
        
        Scanner in = new Scanner(System.in);
        while (true) {
            View.view();
            in.nextLine();
            for (Character character : allTeam) {
                if (team1.contains(character)) character.step(team2, team1);
                else character.step(team1, team2);
            }
            if (isDeadTeam(team1)) {
                System.out.println("Команда 2 выиграла");
                break;
            }
            if (isDeadTeam(team2)) {
                System.out.println("Команда 1 выиграла");
                break;
            }
        }
    }

    public static void generateTeam(ArrayList<Character> team, int teamSize, int posX) {
        Random random = new Random();

        for (int i = 1; i <= teamSize; i++) {
            int randomClass = random.nextInt(7); // Генерация случайного числа от 0 до 6

            switch (randomClass) {
                case 0:
                    team.add(new Peasant("Peasant " + (i + 1), posX, i));
                    break;
                case 1:
                    team.add(new Rogue("Rogue " + (i + 1), posX, i));
                    break;
                case 2:
                    team.add(new Sniper("Sniper " + (i + 1), posX, i));
                    break;
                case 3:
                    team.add(new Crossbowman("Crossbowman " + (i + 1), posX, i));
                    break;
                case 4:
                    team.add(new Warlock("Warlock " + (i + 1), posX, i));
                    break;
                case 5:
                    team.add(new Spearman("Spearman " + (i + 1), posX, i));
                    break;
                case 6:
                    team.add(new Monk("Monk " + (i + 1), posX, i));
                    break;
                default:
                    break;
            }
        }
    }

    public static boolean isDeadTeam(ArrayList<Character> team) {
        for (Character character : team) {
            if (character.getHealth() > 0) return false;
        };
        return true;
    }
}
