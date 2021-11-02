package geometry;

import java.util.Locale;
import java.util.Scanner;
import Entities.Area;

/**
 *
 * @author Guilherme
 */
public class Geometry {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner dig = new Scanner(System.in);
        
        Area x;
        x = new Area();
        
        System.out.println("Escolha uma área para calcular");
        System.out.println("Digite 1 para quadrado");
        System.out.println("Digite 2 para retângulo");
        System.out.println("Digite 3 para círculo");
        System.out.println("Digite 4 para triângulo");
        System.out.println("Digite 5 para trapézio");
        
        int choose = dig.nextInt();
        char chooseChar = 's';
        
        while(chooseChar == 's'){ 
            
            if (choose == 1){         
                System.out.println("Coloque as medidas do quadrado:");
                System.out.println("Digite o primeiro lado:");
                x.a = dig.nextDouble();
                System.out.println("Digite o segundo lado:");
                x.b = dig.nextDouble();
                
                double squareX = x.square();
                
                System.out.printf("A área do quadrado é %.2f%n", squareX);
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = dig.next().charAt(0);
                
                switch(chooseChar){
                    case 'n':
                        System.out.println("Esta operação será finalizada");
                    break;
                }
            }          
            
            if (choose == 2){
                System.out.println("Coloque as medidas do retângulo:");
                System.out.println("Digite o maior lado:");
                x.a = dig.nextDouble();
                System.out.println("Digite o menor lado:");
                x.b = dig.nextDouble();
                
                double rectangleX = x.rectangle();
                
                System.out.printf("A área do retângulo é %.2f%n", rectangleX);
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = dig.next().charAt(0);
                
                switch (chooseChar){
                    case 'n':
                        System.out.println("Esta operação será finalizada");
                    break;
                }
            }
            
            if (choose == 3){
                System.out.println("Coloque as medidas do círculo: ");
                System.out.println("Digite o raio: ");
                double radius = dig.nextDouble();
                System.out.println("Digite o diâmetro");
                double diameter = dig.nextDouble();
                
                double circleX = Area.circleRadius(radius);
                double circleY = Area.circleDiameter(diameter);
                
                System.out.printf("O raio vale: %.2f%n", circleX);
                System.out.printf("O diâmetro vale: %.2f%n", circleY);
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = dig.next().charAt(0);
                
                switch(chooseChar){
                    case 'n':
                        System.out.println("Esta operação será finalizada");
                    break;
                }
            }
            
            if (choose == 4){
                System.out.println("Coloque as medidas do triângulo:");
                System.out.println("Digite a base:");
                x.a = dig.nextDouble();
                System.out.println("Digite a altura");
                x.b = dig.nextDouble();
                
                double triangleX = x.triangle();
                
                System.out.printf("A área do triângulo vale: %.2f%n", triangleX);
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = dig.next().charAt(0);
                
                switch(chooseChar){
                    case 'n':
                        System.out.println("Esta operação será finalizada");
                    break;
                }
            }
            
            if (choose == 5){
                System.out.println("Coloque as medidas do trapézio:");
                System.out.println("Digite a base maior");
                x.a = dig.nextDouble();
                System.out.println("Digite a base menor:");
                x.b = dig.nextDouble();
                System.out.println("Digite a altura:");
                x.c = dig.nextDouble();
                
                double trapezeX = x.trapeze();
                
                System.out.printf("A área do trapézio é: %.2f%n", trapezeX);
                System.out.println("Você deseja fazer outra operação ? (s/n) ?");
                chooseChar = dig.next().charAt(0);
                
                switch(chooseChar){
                    case 'n':
                        System.out.println("Esta operação será finalizada");
                    break;
                }
            }
        }
    }
}