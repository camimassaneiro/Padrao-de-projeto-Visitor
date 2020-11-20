package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

/**
 *
 * @author camil
 */
public class FolhaPagamentoConcreto implements FuncionarioVisitor{
    
    private double totalFolha;

    @Override
    public void visitGerente(Gerente gerente) {
        totalFolha += gerente.getSalario();        
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        totalFolha += funcionario.getSalario();
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        totalFolha += funcionario.getSalario();
    } 

    public double getTotalFolha() {
        return totalFolha;
    }   

    @Override
    public String toString() {
        return "Total da folha de pagamento: " + totalFolha;
    }
    
   
    
}
