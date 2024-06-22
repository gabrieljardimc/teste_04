package gestao_quatro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EquacaoSegundoGrauTest {

    @Test
    public void testIgualdadeConfirmada() {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(0, 0, 0);
        assertEquals("Igualdade confirmada: 0 = 0", eq.resolver());
    }

    @Test
    public void testCoeficientesIncorretos() {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(0, 0, 8);
        assertEquals("Coeficientes informados incorretamente", eq.resolver());
    }

    @Test
    public void testEquacaoPrimeiroGrau() {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(0, 2, -8);
        assertEquals("Esta é uma equação de primeiro grau: x = 4.0", eq.resolver());
    }

    @Test
    public void testEquacaoSegundoGrauSemRaizesReais() {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(10, -4, 12);
        assertEquals("Esta é uma equação de segundo grau. Esta equação não possui raízes reais (delta < 0): delta = -464.0", eq.resolver());
    }

    @Test
    public void testEquacaoSegundoGrauRaizesIguais() {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(4, -4, 1);
        assertEquals("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais iguais: x' = x'' = 0.5", eq.resolver());
    }

    @Test
    public void testEquacaoSegundoGrauRaizesDiferentes() {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(1, 6, 7);
        assertEquals("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes: delta = 8.0, x' = -1.5857864376269049, x'' = -4.414213562373095", eq.resolver());
    }
}
