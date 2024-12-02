import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lista de animal geral utilizada para fazer o cadastro dos animais e consulta do mesmo.
        List<Animal> listaAnimalGeral = new ArrayList<>();

        // menu do sistema do veterianario
int opcao = 0;
do {
    System.out.println("Olá, escolha uma das opções abaixo: \n");
    System.out.println("1.Retorno exame \n" +
            "2.Cadastrar Animal \n" +
            "3.Agendar consulta \n" +
            "4.Agendar exame \n" +
            "5.Consultar animal\n" +
            "6.Sair\n");
    ;
  opcao = scanner.nextInt();
    switch (opcao){
            case 1:
                System.out.println("Retorno exame");
                System.out.println("Digite o nome do animal para verificar o exame");
                String animalExame = scanner.next();


                break;
            case 2:
                System.out.println("Cadastrar Animal");

                System.out.println("Nome do animal");
                String nomeAnimal = scanner.next();

                System.out.println("idade do animal");
                int idadeAnimal = scanner.nextInt();

                System.out.println("Tipo do animal");
                String tipo = scanner.next();

                System.out.println("Raça do animal");
                String raca = scanner.next();

                System.out.println("Estado de saude do animal");
                String estadoSaude = scanner.next();

                System.out.println("Digite o nome do Dono do Animal");
                String nomeDonoAnimal = scanner.next();

                System.out.println("Cadastro realizado com sucesso");


//                for (int i = 0; i < listaAnimalGeral.size(); i++) {
//
//                }

                Animal animal1 = new Animal(nomeAnimal,tipo, raca,
                        idadeAnimal, estadoSaude, nomeDonoAnimal);

                listaAnimalGeral.add(animal1);

                break;
            case 3:
                System.out.println("Agendar consulta");
                System.out.println("Informe a data da consulta: ");
                String data = scanner.next();
                System.out.println("Informe o convênio: ");
                String convenio = scanner.next();
                System.out.println("Informe a duração da consulta: ");
                int duracao = scanner.nextInt();
                System.out.println("Informe o valor da consulta: ");
                int valor = 120 * (duracao/60);
                break;
            case 4:
                System.out.println("Agendar exame");
                System.out.println("Informe a data para realizar o exame: ");
                String dataExame = scanner.next();
                System.out.println("Informe o tipo de exame: ");
                String tipoExame = scanner.next();
                System.out.println("Informe o valor deste exame: ");
                int valorExame = scanner.nextInt();
                break;

            case 5:
                System.out.println("Consultar animal na lista: ");
                System.out.println("Digite o nome do Animal: ");
                String consultarAnimal = scanner.next();
                System.out.println("Digite o nome do dono: ");
                String nomeDono = scanner.next();

                Animal animalConsulta = new Animal();
                animalConsulta.procurarAnimal(nomeDono, consultarAnimal, listaAnimalGeral);
                break;
            case 6:
                System.out.println("Saindo do sistema");
                break;
        }

}while(opcao != 6);


    }
}