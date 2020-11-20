
package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

/**
 *
 * @author camil
 */
public class FeriasConcreto implements FuncionarioVisitor{

    private int totalFunFerias;
    
    @Override
    public void visitGerente(Gerente gerente) {
        if (gerente.getSalario() >= 5000){
            gerente.setFeriasAGozar(10);
            totalFunFerias++;
        }
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        if (funcionario.getSalario() >= 5000){
            funcionario.setFeriasAGozar(10);
            totalFunFerias++;
        }
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        if (funcionario.getSalario() >= 1500){
            funcionario.setFeriasAGozar(5);
            totalFunFerias++;
        }
    }

    public int getTotalFunFerias() {
        return totalFunFerias;
    }
    
    
}
