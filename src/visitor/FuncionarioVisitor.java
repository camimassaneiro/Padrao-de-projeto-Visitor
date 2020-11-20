package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

public interface FuncionarioVisitor {

	void visitGerente(Gerente gerente);
	void visitFuncNivelA(FuncNivelA funcionario);
	void visitFuncNivelB(FuncNivelB funcionario);	
}
