public class Main {
    public static void main(String[] args) {

        try {
            Verificateur.verifierAge(16);
        } catch (AgeInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }



    }
}