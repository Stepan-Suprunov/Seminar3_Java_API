import tasks.Task1;
import tasks.Task2;
import tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1.fillListRandom();
        System.out.println();
        ArrayList<String> poetry = new ArrayList<>();
        poetry.add("Поэзия");
        poetry.add("Евгений Онегин");
        poetry.add("Облако в штанах");
        ArrayList<String> prose = new ArrayList<>();
        prose.add("Проза");
        prose.add("Накануне");
        prose.add("Преступление и наказание");
        Task2.fillLibrary(poetry);
        Task2.fillLibrary(prose);
        Task3.deleteIntegers();
    }
}