import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PastelTest {

    // Massas de Dados
    private static Pastel pastelzinho1;
    private static Pastel pastelzinho2;
    private static Pastel pastelzinho3;
    private static Pastel pastelzinho4;
    private static Pastel pastelzinho5;
    private static Pastel pastelzinho6;

    @BeforeEach
    void InstanciaMassa(){
        pastelzinho1 = new Pastel("Camarão");
        pastelzinho2 = new Pastel("Pizza");
        pastelzinho3 = new Pastel("Carne de Sol");
        pastelzinho4 = new Pastel("Calabresa com Queijo");
        pastelzinho5 = new Pastel("Queijo");
        pastelzinho6 = new Pastel("vento");
    }

    @Test
    void encontrar_true() {
        Pastel pastelzinho = Pastel.encontrar("Camarão");
        assertEquals("Camarão", pastelzinho.nome);
    }

    @Test
    void encontrar_false() {
        Pastel pastelzinho = Pastel.encontrar("Caruaru");
        assertEquals("Caruaru", pastelzinho.nome);
    }


    @Test
    void comparaNomeIgual() {
        // Valores iguais
        int compPastel1 = pastelzinho1.comparaNome(pastelzinho1);
        assertEquals(0, compPastel1, "Sabor dos pasteis não são iguais!");

        // Valor da cidade 1 é menor alfabeticamente da cidade 2.
        int compPastel2 = pastelzinho1.comparaNome(pastelzinho2);
        assertTrue(compPastel2 < 0, "Pastel 1 não é menor alfabeticamente que o pastel 2!");

        // Valor da cidade 2 é maior alfabeticamente da cidade 1.
        int compPastel3 = pastelzinho2.comparaNome(pastelzinho1);
        assertTrue(compPastel3 > 0, "Pastel 2 não é maior alfabeticamente que a pastel 1!");
    }

    @Test
    void testToString() {
        assertEquals("Pizza", pastelzinho2.toString());
    }

    @Test
    void comparaPreco() {
        pastelzinho1.preco = 5;
        pastelzinho2.preco = 3;
        pastelzinho3.preco = 10;
        pastelzinho4.preco = 10;

        assertEquals(0, Pastel.comparaPreco(pastelzinho3, pastelzinho4));
        assertTrue(Pastel.comparaPreco(pastelzinho1, pastelzinho2) > 0, "Pastel2 não é mais barato que o Pastel1.");
        assertTrue(Pastel.comparaPreco(pastelzinho2, pastelzinho1) < 0, "Pastel1 não é mais barato que o Pastel2.");
    }
}