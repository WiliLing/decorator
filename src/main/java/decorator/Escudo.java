package decorator;

public class Escudo extends HeroDecorator {
    public Escudo(Heroi protagonista) {
        super(protagonista);
    }

    @Override
    public float getAumentoLVL() {
        return 2;
    }

    @Override
    public float getAumentoVida() {
        return 10;
    }


    public String getNomeEstrutura() {
        return "Escudo";
    }
}
