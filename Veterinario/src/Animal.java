import java.util.ArrayList;
import java.util.List;

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
//    public Animal(){
//
//    }

    public List<Animal> cadastroAnimal( Animal animal1){
        List<Animal> listaAnimal = new ArrayList<>();
        listaAnimal.add(animal1);

        return listaAnimal;

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
}
