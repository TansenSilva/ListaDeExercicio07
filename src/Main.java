public class Main {
    public static void main(String[] args) {
        Pais chile = new Pais("CHL","Chile",111);
        Pais brasil = new Pais("CHL","Chile",111);
        Pais bolivia = new Pais("CHL","Chile",111);
        Pais argentina = new Pais("ARD","Argentina",111);
        Pais uruguai = new Pais("URG","Uruguai",343);
        Fronteira.paisesFazemFronteira(chile,bolivia);
        Fronteira.paisesFazemFronteira(chile,argentina);
        chile.vizinhos(brasil);
        bolivia.vizinhos(chile);
        chile.paisesFazerFronteira();
        chile.setPopulacao(230);
        System.out.println(chile.calculoDensidade());




    }

}
