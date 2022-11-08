package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroiTest {
    @Test
    void deveRetornarVidaHeroi() {
        Heroi protagonista = new HeroiIniciante(1.0f,10.0f);

        assertEquals(10.0f, protagonista.getVida());
    }

    @Test
    void deveRetornarVidaEscudo() {
        Heroi protagonista = new Escudo(new HeroiIniciante(1.0f,10.0f));

        assertEquals(210.0f, protagonista.getVida());
    }

    @Test
    void deveRetornarVidaArmadura() {
        Heroi protagonista = new ArmaduraMágica(new HeroiIniciante(1.0f,10.0f));

        assertEquals(810.0f, protagonista.getVida());
    }

    @Test
    void deveRetornarVidaEscudoArmadura() {
        Heroi protagonista = new ArmaduraMágica(new Escudo(new HeroiIniciante(1.0f,10.0f)));

        assertEquals(17010.0, protagonista.getVida());
    }

    @Test
    void deveRetornarEstruturaHeroi() {
        Heroi protagonista = new HeroiIniciante(1.0f,10.0f);

        assertEquals("Iniciante", protagonista.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComEstagio() {
        Heroi protagonista= new Escudo(new HeroiIniciante(1.0f,10.0f));

        assertEquals("Iniciante/Escudo", protagonista.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComAtividadesComplementares() {
        Heroi protagonista = new ArmaduraMágica(new Escudo(new HeroiIniciante(1.0f,10.0f)));

        assertEquals("Iniciante/Escudo/ArmaduraMágica", protagonista.getEstrutura());
    }


}