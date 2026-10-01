

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void deveRetornarPrecoCafe() {
        Cafe cafe = new CafeSimples(10.0f);

        assertEquals(10.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeite() {
        Cafe cafe = new Leite(new CafeSimples(10.0f));

        assertEquals(12.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComChantilly() {
        Cafe cafe = new Chantilly(new CafeSimples(10.0f));

        assertEquals(13.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCanela() {
        Cafe cafe = new Canela(new CafeSimples(10.0f));

        assertEquals(11.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteMaisChantilly() {
        Cafe cafe = new Chantilly(new Leite(new CafeSimples(10.0f)));

        assertEquals(15.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteMaisCanela() {
        Cafe cafe = new Canela(new Leite(new CafeSimples(10.0f)));

        assertEquals(13.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComChantillyMaisCanela() {
        Cafe cafe = new Canela(new Chantilly(new CafeSimples(10.0f)));

        assertEquals(14.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteMaisChantillyMaisCanela() {
        Cafe cafe = new Canela(new Chantilly(new Leite(new CafeSimples(10.0f))));

        assertEquals(16.0f, cafe.getPreco());
    }

    // ---------- DESCRIÇÃO ----------

    @Test
    void deveRetornarDescricaoCafe() {
        Cafe cafe = new CafeSimples();

        assertEquals("Café simples", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeite() {
        Cafe cafe = new Leite(new CafeSimples());

        assertEquals("Café simples + Leite", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComChantilly() {
        Cafe cafe = new Chantilly(new CafeSimples());

        assertEquals("Café simples + Chantilly", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComCanela() {
        Cafe cafe = new Canela(new CafeSimples());

        assertEquals("Café simples + Canela", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteMaisChantilly() {
        Cafe cafe = new Chantilly(new Leite(new CafeSimples()));

        assertEquals("Café simples + Leite + Chantilly", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteMaisCanela() {
        Cafe cafe = new Canela(new Leite(new CafeSimples()));

        assertEquals("Café simples + Leite + Canela", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComChantillyMaisCanela() {
        Cafe cafe = new Canela(new Chantilly(new CafeSimples()));

        assertEquals("Café simples + Chantilly + Canela", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteMaisChantillyMaisCanela() {
        Cafe cafe = new Canela(new Chantilly(new Leite(new CafeSimples())));

        assertEquals("Café simples + Leite + Chantilly + Canela", cafe.getDescricao());
    }
}