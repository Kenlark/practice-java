public class Verificateur {
    public static void verifierAge(int age) throws AgeInvalideException {
        if (age < 18) {
            throw new AgeInvalideException("Âge insuffisant : accès refusé.");
        }
    }
}
