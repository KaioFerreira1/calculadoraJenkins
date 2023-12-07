package catolica.mini.curso.jenkins.service;

import catolica.mini.curso.jenkins.services.CalculadoraService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {
    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init(){
        calculadoraService = new CalculadoraService();
    }
    @Test
    public void deveriaRetornarUmaMensagem(){
        String heloo = "Bem Vindo ao curso de Jenkins";
        Assertions.assertEquals(heloo, calculadoraService.hello());
    }
    @Test
    public void deveriaRetornarAsoma(){
        int a = 2;
        int b = 5;
        int result = 7;
        Assertions.assertEquals(result, calculadoraService.somar(a,b));
    }
    @Test
    public void deveriaRetornarAsubtracao(){
        int a = 3;
        int b = 2;
        int result = 1;
        Assertions.assertEquals(result, calculadoraService.subtrair(a,b));
    }
}
