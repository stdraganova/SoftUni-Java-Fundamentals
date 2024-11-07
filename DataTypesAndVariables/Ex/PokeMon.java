package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int targetCount = 0;
        int initialPokePowerN = pokePowerN;

        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            targetCount++;

            if (pokePowerN == initialPokePowerN / 2) {
                if (exhaustionFactorY > 0) {
                    pokePowerN /= exhaustionFactorY;
                    if (pokePowerN < distanceM) {
                        break;
                    }
                }
            }
        }

        System.out.println(pokePowerN);
        System.out.println(targetCount);
    }
}