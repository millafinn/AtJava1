package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexoTest {

    @Test
    void somaReais() {
        Complexo calc = new Complexo();
        assertEquals(110,calc.somaReais(60, 50));
    }

    @Test
    void somaImaginario() {
        Complexo calc = new Complexo();
        assertEquals(110,calc.somaImaginario(60, 50));
    }

    @Test
    void subtReais() {
        Complexo calc = new Complexo();
        assertEquals(55,calc.subtReais(60, 5));
    }

    @Test
    void subtImaginario() {
        Complexo calc = new Complexo();
        assertEquals(1,calc.subtImaginario(10, 9));
    }

    @Test
    void modulo() {
        Complexo calc = new Complexo();
        assertEquals(10.488088481701515,Complexo.modulo( 10,10));
    }
}