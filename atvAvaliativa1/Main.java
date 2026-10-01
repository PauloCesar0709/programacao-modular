import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Mecanico mecanico1 = new Mecanico("Paulo", "122.344.566.78", "Motores", "(31) 98765-4540");
        Mecanico mecanico2 = new Mecanico("Rodrigo", "231.354.573.90", "Freios", "(31) 97654-9834");
        Mecanico mecanico3 = new Mecanico("Roberto", "875.978.847-94", "Suspensão", "(31) 96453-9363");


        Box boxe1 = new Box(1, "Reparação de Chassi", 5, "Rua Álvaro Ferreira Cardoso, 277");
        Box boxe2 = new Box(2, "Reparação de motor", 3, "Rua Pedro Aleixo, 399");
        Box boxe3 = new Box(3, "Reparação de suspensão", 10, "Rua Augusto Vieira, 344");

        int escolha = 0;

        while (escolha != 8){
        
            System.out.println("======== BEM-VINDO =======\n");
        
            System.out.println("1 - Cadastrar ordem de serviço");
            System.out.println("2 - Associar mecânico a box");
            System.out.println("3 - Atribuir ordem de serviço");
            System.out.println("4 - Exibir ordens de serviço");
            System.out.println("5 - Quantidade total de ordens finalizadas");
            System.out.println("6 - Buscar ordem por status");
            System.out.println("7 - Exibir detalhes de ordem");
            System.out.println("Sair - 8");

            System.out.println();

            System.out.println("Digite sua escolha: ");
            escolha = entrada.nextInt();

            if (escolha == 1){

            } 
            if (escolha == 2){

            }

            if (escolha == 3){

            }

            if (escolha == 4){

            }

            if (escolha == 5){

            }

            if (escolha == 6){

            }

            if (escolha == 7){
                
            }
        }
    
    }
}