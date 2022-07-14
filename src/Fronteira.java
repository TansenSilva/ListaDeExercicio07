public class Fronteira {

    public static void paisesFazemFronteira(Pais pais1, Pais pais2){
        pais1.adicionarPais(pais2);
        pais2.adicionarPais(pais1);
    }


}
