import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // menu do sistema do veterianario

        System.out.println("Olá, escolha uma das opções abaixo: \n");
        System.out.println("1.Cadastrar cliente \n" +
                "2.Cadastrar Animal \n" +
                "3.Agendar consulta \n" +
                "4.Gerar solicitação de exame \n" +
                "5.Gerar receita médica\n" +
                "6.Consultar animal\n");
        ;

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:


            case 2:
                System.out.println("Cadastrar Animal");

                System.out.println("Nome do animal");
                String nomeAnimal = scanner.nextLine();

                System.out.println("idade do animal");
                int idadeAnimal = scanner.nextInt();

                System.out.println("Tipo do animal");
                String tipo = scanner.nextLine();

                System.out.println("Raça do animal");
                String raca = scanner.nextLine();

                System.out.println("Estado de saude do animal");
                String estadoSaude = scanner.nextLine();

                System.out.println("Digite o nome do Dono do Animal");
                String nomeDonoAnimal = scanner.nextLine();

                Animal animal1 = new Animal(nomeAnimal,tipo, raca,
                        idadeAnimal, estadoSaude, nomeDonoAnimal);



//                animal1.setNome(nomeAnimal);
//                animal1.setIdade(idadeAnimal);

//                List<Animal> listaAnimal = new ArrayList<>();
//                listaAnimal.add(animal1);

                animal1.cadastroAnimal(animal1);

            case 3:
                System.out.println("Agendar consulta");
                System.out.println("Informe a data da consulta: ");
                String data = scanner.nextLine();
                System.out.println("Informe o convênio: ");
                String convenio = scanner.nextLine();
                System.out.println("Informe a duração da consulta: ");
                int duracao = scanner.nextInt();
                System.out.println("Informe o valor da consulta: ");
                int valor = 120 * (duracao/60);

        }



    }
}