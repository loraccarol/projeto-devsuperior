public class Program {
    public static void main(String[] args) {

        Champion c1 = new Champion("Darius", 50, 8, 1); // instancias
        Champion c2 = new Champion("Fiora", 40, 10, 2);
        System.out.println("Vida Darius: " + c1.getLife());
        System.out.println("Vida Fiora: " + c2.getLife());

        c1.takeDamage(c2);
        System.out.println("Vida Darius após sofrer ataque: " + c1.getLife());
        System.out.println("Vida Fiora após atacar: " + c2.getLife());

        c2.takeDamage(c1);
        System.out.println("Vida Darius após atacar: " + c1.getLife());
        System.out.println("Vida Fiora após sofrer ataque: " + c2.getLife());
    }
}
