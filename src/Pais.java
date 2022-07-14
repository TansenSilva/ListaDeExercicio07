import java.util.HashSet;
import java.util.Set;

public class Pais {

    private String codigoIso;
    private String nome;
    private double populacao;
    private double dimensao;
    private Set<Pais> paisesFronteira = new HashSet<>();

    public Pais(String codigoIso, String nome, double dimensao) {
        this.setCodigoIso(codigoIso);
        this.setNome(nome);
        this.setDimensao(dimensao);
    }
    public void vizinhos(Pais pais){
        if (this.paisesFronteira.contains(pais)){
            System.out.println("Faz fronteira com "+pais.getNome());
        }else {
            System.out.println("Não faz fronteira com "+pais.getNome());
        }
    }

    public void paisesFazerFronteira(){
        System.out.println("Países que fazem fronteira com: "+getNome());
        for (Pais pais :paisesFronteira) {
            System.out.println(pais.getNome());
        }
    }

    public  void adicionarPais(Pais pais){
        this.paisesFronteira.add(pais);
    }

    public double calculoDensidade(){
        return this.getPopulacao()/this.getDimensao();
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}
