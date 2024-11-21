public class Cachorro extends Animal {
    private String corPelugem;
    private String carteiraVacina;

    public Cachorro(String nome, String tipo, String raca, int idade, String estadoSaude, String nomeDono, String corPelugem,String carteiraVacina){
        super(nome, tipo,raca,idade,estadoSaude,nomeDono);
        this.corPelugem = corPelugem;
        this.carteiraVacina = carteiraVacina;

    }

    public Cachorro(){

    }

    public void cavar(){

    }
    public void latir(){

    }
    public void vomitar(){

    }
    public void morder(){

    }


}
