package br.com.alura.tdd.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;

class ReajusteServiceTest {

	@Test
	void reajusteDe3PorCentoSeODesempenhoForADesejar() {
		Funcionario funcionario = new Funcionario("Mauricio", LocalDate.now(), new BigDecimal("1000.00"));
		ReajusteService rs = new ReajusteService();
		rs.reajusta(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	void reajusteDe15PorCentoSeODesempenhoForBom() {
		Funcionario funcionario = new Funcionario("Mauricio", LocalDate.now(), new BigDecimal("1000.00"));
		ReajusteService rs = new ReajusteService();
		rs.reajusta(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	void reajusteDe20PorCentoSeODesempenhoForOtimo() {
		Funcionario funcionario = new Funcionario("Mauricio", LocalDate.now(), new BigDecimal("1000.00"));
		ReajusteService rs = new ReajusteService();
		rs.reajusta(funcionario, Desempenho.OTIMO);

		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
