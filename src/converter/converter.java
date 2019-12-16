package converter;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        char us_dollar_sym = 36;
        char rub_sym = 0;
        char byn_sym = 0;
        char euro_sym = 8364;

        String us_dollar = "долларах";
        String rub = "российских рублях";
        String byn = "белорусских рублях";
        String euro = "евро";
        double rate = 0;

        System.out.println("Приветствуем Вас из программы ezConverter \n");
        System.out.println("Используйте следующие цифры для выбора валюты: \n 1 - Dollars \n 2 - Euros \n 3 - Rubles \n 4 - BYN \n");

        System.out.println("Выберите валюту ввода:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        String inType = null;
        switch (choice) {
            case 1:
                inType = "Dollars >> " + us_dollar_sym;
                break;
            case 2:
                inType = "Euros >> " + euro_sym;
                break;
            case 3:
                inType = "Rubles >> " + rub_sym;
                break;
            case 4:
                inType = "BYN >> " + byn_sym;
                break;
            default:
                System.out.println("Перезапустите программу и введите номер из списка.");
                return;
        }

        System.out.println("Выберите валюту вывода");
        int output = in.nextInt();

        System.out.printf("Теперь введите сумму " + inType);
        double input = in.nextDouble();

        if (choice == output)
            System.out.println("Вы с какого голливуда? Так делать нельзя!");

        if (choice == 1 && output == 2) {
            double dollar_euro_rate = 0.8951;
            rate = input * dollar_euro_rate;
            System.out.printf("%s" + input + " ---> "
                            + dollar_euro_rate + " долларов в %s = %.2f\n",
                    (char) us_dollar_sym, euro, rate);
        } else if (choice == 1 && output == 3) {
            double dollar_rub_rate = 62.5387;
            rate = input * dollar_rub_rate;
            System.out.printf("%s" + input + " ---> "
                            + dollar_rub_rate + " долларов в %s = %.2f\n",
                    (char) us_dollar_sym, rub, rate);
        } else if (choice == 1 && output == 4) {
            double dollar_byn_rate = 2.1008;
            rate = input * dollar_byn_rate;
            System.out.printf("%s" + input + " ---> "
                            + dollar_byn_rate + " долларов в %s = %.2f\n",
                    (char) us_dollar_sym, byn, rate);
        }
        if (choice == 2 && output == 1) {
            double euro_dollar_rate = 1.1172;
            rate = input * euro_dollar_rate;
            System.out.printf("%s" + input + " ---> "
                            + euro_dollar_rate + " евро в %s = %.2f\n",
                    (char) euro_sym, us_dollar, rate);
        } else if (choice == 2 && output == 3) {
            double euro_rub_rate = 69.8682;
            rate = input * euro_rub_rate;
            System.out.printf("%s" + input + " ---> "
                            + euro_rub_rate + " евро в %s = %.2f\n",
                    (char) euro_sym, rub, rate);
        } else if (choice == 2 && output == 4) {
            double euro_byn_rate = 2.347;
            rate = input * euro_byn_rate;
            System.out.printf("%s" + input + " ---> "
                            + euro_byn_rate + " евро в %s = %.2f\n", (char) euro_sym,
                    byn, rate);
        }
        if (choice == 3 && output == 1) {
            double rub_dollar_rate = 0.016;
            rate = input * rub_dollar_rate;
            System.out.printf("%s" + input + " ---> "
                            + rub_dollar_rate + " российских рублей в %s = %.2f\n",
                    (char) rub_sym, us_dollar, rate);
        } else if (choice == 3 && output == 2) {
            double rub_euro_rate = 0.0143;
            rate = input * rub_euro_rate;
            System.out.printf("%s" + input + " ---> "
                            + rub_euro_rate + " российских рублей в %s = %.2f\n",
                    (char) rub_sym, euro, rate);
        } else if (choice == 3 && output == 4) {
            double rub_byn_rate = 0.0336;
            rate = input * rub_byn_rate;
            System.out.printf("%s" + input + " ---> "
                            + rub_byn_rate + " российских рублей в %s = %.2f\n",
                    (char) rub_sym, byn, rate);
        }
        if (choice == 4 && output == 1) {
            double byn_dollar_rate = 0.476;
            rate = input * byn_dollar_rate;
            System.out.printf("%s" + input + " ---> "
                            + byn_dollar_rate + " белорусских рублей в %s = %.2f\n", (char) byn_sym,
                    us_dollar, rate);
        } else if (choice == 4 && output == 2) {
            double byn_euro_rate = 0.4261;
            rate = input * byn_euro_rate;
            System.out.printf("%s" + input + " ---> "
                            + byn_euro_rate + " белорусских рублей в %s = %.2f\n", (char) byn_sym,
                    euro, rate);
        } else if (choice == 4 && output == 3) {
            double byn_rub_rate = 29.769;
            rate = input * byn_rub_rate;
            System.out.printf("%s" + input + " ---> "
                            + byn_rub_rate + " белорусских рублей в %s = %.2f\n", (char) byn_sym,
                    rub, rate);
        }
        System.out.println("Благодарим Вас за использование нашей программы ezConverter");
    }
}

