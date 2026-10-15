public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
                "Celal",
                "Coskun",
                "Nackademin",
                20
        );

        System.out.println("Förnamn: " + student1.getFornamn());
        System.out.println("Efternamn: " + student1.getEfternamn());
        System.out.println("Skola: " + student1.getSkola());
        System.out.println("Alder: " + student1.getAlder());
    }
}
