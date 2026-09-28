package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarDocumentoTest {
    @Test
    public void ValidarDocumentoTest(){
        ValidarDocumento validador = new ValidarDocumento();

        boolean resultado = validador.validarDocumento("52998224725");
        assertTrue(resultado);
    }
    @Test
    public void ValidarDocumentoTest2(){
        ValidarDocumento validador = new ValidarDocumento();
        boolean resultado = validador.validarDocumento("52998224726");
    }
    @Test
    public void ValidarDocumentoTest3(){
        ValidarDocumento validador = new ValidarDocumento();
        boolean resultado = validador.validarDocumento("529.982.247-25");
        assertTrue(resultado);
    }
    @Test
    public void ValidarDocumentoTest4(){
        ValidarDocumento validador = new ValidarDocumento();
        boolean resultado = validador.validarDocumento("5299822472");
        assertFalse(resultado);
    }
    @Test
    public void ValidarDocumentoTest5(){
        ValidarDocumento validador = new ValidarDocumento();
        boolean resultado = validador.validarDocumento("52998A24726");
        assertFalse(resultado);
    }
    @Test
    public void ValidarDocumentoTest6(){
        ValidarDocumento validador = new ValidarDocumento();
        boolean resultado = validador.validarDocumento("11111111111");
        assertFalse(resultado);
    }
}