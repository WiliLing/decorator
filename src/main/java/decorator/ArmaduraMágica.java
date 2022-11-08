package decorator;

public class ArmaduraMágica extends HeroDecorator{
    public ArmaduraMágica(Heroi protagonista) {
        super(protagonista);
    }
    @Override
    public float getAumentoLVL() {
        return 20;
    }

    @Override
    public float getAumentoVida() {
        return 40;
    }

    @Override
    public String getNomeEstrutura() {
        return "ArmaduraMágica";
    }
}
