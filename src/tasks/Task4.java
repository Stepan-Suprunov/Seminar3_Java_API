// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Меркурий");
        ArrayList<Integer> countPlanets = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet : planets) {
            int position = resultList.indexOf(planet);
            if (position >= 0) {
                countPlanets.set(position, countPlanets.get(position) + 1);
            } else {
                resultList.add(planet);
                countPlanets.add(1);
            }
        }
        printPlanetCount(resultList, countPlanets);
    }

    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }
}
