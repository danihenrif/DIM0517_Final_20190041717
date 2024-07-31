package com.example.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcApplicationTests {
	private Calc calc;

	@BeforeEach
    void setUp() {
        calc = new Calc();
    }

	@Test
	void testSoma() {
		assertEquals(calc.soma(3, 4), 7);
	}

	@Test
	void testSubtracao() {
		assertEquals(calc.subtracao(4, 3), 1);
		assertEquals(calc.subtracao(3, 4), -1);
	}
}
