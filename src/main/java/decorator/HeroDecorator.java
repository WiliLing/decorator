package decorator;

public abstract class HeroDecorator implements Heroi {
    private Heroi protagonista;
    public String estrutura;

    public HeroDecorator(Heroi protagonista) {
        this.protagonista = protagonista;
    }

    public Heroi getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Heroi protagonista) {
        this.protagonista = protagonista;
    }

    public abstract float getAumentoLVL();

    public float getLvl() {
        return this.protagonista.getLvl() * (1 + (this.getAumentoLVL() / 100));
    }
    public abstract float getAumentoVida();

    public float getVida() {
        return this.protagonista.getVida() * (1 + (this.getAumentoVida() * 2 ));
    }
    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.protagonista.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

}