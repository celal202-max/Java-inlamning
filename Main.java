import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {
Matratt pizza = new Matratt("Pizza", 120, "meat", 900);
Matratt sallad = new Matratt("Salad", 80, "Vegetarian", 400);
Matratt pasta = new Matratt("Pasta", 100, "Vegetarian", 700);
ArrayList<Matratt> meny = new ArrayList<>();

meny.add(pizza);
meny.add(sallad);
meny.add(pasta);
for (Matratt matratt : meny) {
    System.out.println(matratt.name);
}
    }
}