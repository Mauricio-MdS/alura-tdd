package br.com.alura.tdd.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

class BonusServiceTest {

	@Test
	void deveriaSer10PorCentoDoSalarioParaUmSalarioMenorQue10000() {
		BonusService bs = new BonusService();
		BigDecimal bonus = bs.calcularBonus(new Funcionario("Mauricio", LocalDate.now(), BigDecimal.TEN));

		assertEquals(new BigDecimal("1.00"), bonus);
	}
	
	@Test
	void deveriaSer10PorCentoDoSalarioDeExatamente10000() {
		BonusService bs = new BonusService();
		BigDecimal bonus = bs.calcularBonus(new Funcionario("Mauricio", LocalDate.now(), BigDecimal.valueOf(10000)));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
	@Test
	void deveriaSerZeroParaUmSalarioMaiorQue10000() {
		BonusService bs = new BonusService();
		BigDecimal bonus = bs.calcularBonus(new Funcionario("Mauricio", LocalDate.now(), BigDecimal.valueOf(1000000)));

		assertEquals(new BigDecimal("0.00"), bonus);
	}

}
