public class FacebookUserGrowth {
    public static void main(String[] args) {
        int initialUsers = 1000000000; // 1 bilhão
        double growthRate = 0.04; // 4%

        int targetUsers1 = 1500000000; // 1,5 bilhão
        int targetUsers2 = 2000000000; // 2 bilhões

        int monthsToReachTarget1 = calculateMonths(initialUsers, targetUsers1, growthRate);
        int monthsToReachTarget2 = calculateMonths(initialUsers, targetUsers2, growthRate);

        System.out.println("Levará aproximadamente " + monthsToReachTarget1 + " meses para o Facebook alcançar 1,5 bilhão de usuários.");
        System.out.println("Levará aproximadamente " + monthsToReachTarget2 + " meses para o Facebook alcançar 2 bilhões de usuários.");
    }

    public static int calculateMonths(int initialUsers, int targetUsers, double growthRate) {
        int months;
        for (months = 0; initialUsers < targetUsers; months++) {
            initialUsers += initialUsers * growthRate;
        }
        return months;
    }
}
