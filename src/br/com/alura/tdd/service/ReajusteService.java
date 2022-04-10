package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajusta(Funcionario funcionario, Desempenho desempenho) {

		BigDecimal adicaoSalarial = funcionario.getSalario().multiply(desempenho.reajuste());
		BigDecimal novoSalario = funcionario.getSalario().add(adicaoSalarial);
		funcionario.setSalario(novoSalario.setScale(2, RoundingMode.FLOOR));

	}

}
