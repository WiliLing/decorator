package decorator;

public class HeroiIniciante implements Heroi {
    public float lvl;
    public float vida;

    @Override
    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public HeroiIniciante(float lvl, float vida) {
        this.lvl= lvl;
        this.vida=vida;
    }

    @Override
    public float getLvl() {
        return lvl;
    }

    public void setLvl(float lvl) {
        this.lvl = lvl;
    }

    public String getEstrutura() {
        return "Iniciante";
    }
}
