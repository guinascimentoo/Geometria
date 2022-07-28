import java.util.Locale;
import java.util.Scanner;
import Entities.Area;

public class Geometry {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Area x = new Area();

        System.out.println("Escolha uma área para calcular");
        System.out.println("Digite 1 para quadrado");
        System.out.println("Digite 2 para retângulo");
        System.out.println("Digite 3 para círculo");
        System.out.println("Digite 4 para triângulo");
        System.out.println("Digite 5 para trapézio");

        int choose = sc.nextInt();
        char chooseChar = 's';

        do {
            if (choose == 1){
                System.out.println("Coloque as medidas do quadrado:");
                System.out.println("Digite o primeiro lado:");
                x.a = sc.nextDouble();
                System.out.println("Digite o segundo lado:");
                x.b = sc.nextDouble();

                System.out.printf("A área do quadrado é %.2f%n", x.square());
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = sc.next().charAt(0);
            }

            else if (choose == 2){
                System.out.println("Coloque as medidas do retângulo:");
                System.out.println("Digite o maior lado:");
                x.a = sc.nextDouble();
                System.out.println("Digite o menor lado:");
                x.b = sc.nextDouble();

                System.out.printf("A área do retângulo é %.2f%n", x.rectangle());
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = sc.next().charAt(0);
            }

            else if (choose == 3){
                System.out.println("Coloque as medidas do círculo: ");
                System.out.println("Digite o raio: ");
                double radius = sc.nextDouble();
                System.out.println("Digite o diâmetro");
                double diameter = sc.nextDouble();

                System.out.printf("O raio vale: %.2f%n", Area.circleRadius(radius));
                System.out.printf("O diâmetro vale: %.2f%n", Area.circleDiameter(diameter));
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = sc.next().charAt(0);
            }

            else if (choose == 4){
                System.out.println("Coloque as medidas do triângulo:");
                System.out.println("Digite a base:");
                x.a = sc.nextDouble();
                System.out.println("Digite a altura");
                x.b = sc.nextDouble();

                System.out.printf("A área do triângulo vale: %.2f%n", x.triangle());
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = sc.next().charAt(0);
            }

            else if (choose == 5){
                System.out.println("Coloque as medidas do trapézio:");
                System.out.println("Digite a base maior");
                x.a = sc.nextDouble();
                System.out.println("Digite a base menor:");
                x.b = sc.nextDouble();
                System.out.println("Digite a altura:");
                x.c = sc.nextDouble();

                System.out.printf("A área do trapézio é: %.2f%n", x.trapeze());
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = sc.next().charAt(0);
            }

            else{
                System.out.println("Escolha não listada, digite novamente");
                choose = sc.nextInt();
            }

            }while (chooseChar != 'n');

        System.out.println("Esta operação será finalizada");

    }
}