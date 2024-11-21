import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {
    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private String estadoSaude;
    private String nomeDono;

    public Animal(String nome, String tipo, String raca, int idade, String estadoSaude, String nomeDono){
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.estadoSaude = estadoSaude;
        this.nomeDono = nomeDono;

    }
    public Animal(){

    }



    public void procurarAnimal(String nomeDono, String nomeAnimal, List<Animal> listaAnimalGeral){
        for (int i = 0; i < listaAnimalGeral.size(); i++) {
            if (nomeAnimal.equals( listaAnimalGeral.get(i).getNome()) && nomeDono.equals(listaAnimalGeral.get(i).getNomeDono())) {

                System.out.println("Nome do Animal: "+listaAnimalGeral.get(i).getNome());
                System.out.println("Idade: "+listaAnimalGeral.get(i).getIdade());
                System.out.println("Tipo: " +listaAnimalGeral.get(i).getTipo());
                System.out.println("Raça "+listaAnimalGeral.get(i).getRaca());
                System.out.println("Estado de saúde "+listaAnimalGeral.get(i).getEstadoSaude());
                System.out.println("Nome do Dono: "+ listaAnimalGeral.get(i).getNomeDono());
            }
        }
    }

    public void comer(){

    }
    public void dormir(){

    }
    public void movimentar(){

    }
    public void fazerNecessidades(){

    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
}
