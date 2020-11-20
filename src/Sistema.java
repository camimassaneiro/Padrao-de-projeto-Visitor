import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;
import empresa.Setor;
import visitor.FeriasConcreto;
import visitor.FolhaPagamentoConcreto;
import visitor.FuncionarioVisitor;

public class Sistema {

	public static void main(String[] args) {

		FuncNivelA f1 = new FuncNivelA("J", 5000);
		FuncNivelA f2 = new FuncNivelA("K", 4500);
		
		FuncNivelB f3 = new FuncNivelB("X", 1200);
		FuncNivelB f4 = new FuncNivelB("Y", 1500);
		
		Gerente g = new Gerente("AAA", 8000);
		
		Setor s = new Setor();
		s.add(f1);
		s.add(f2);
		s.add(f3);
		s.add(f4);
		s.add(g);
		
		s.setGerente(g);
                
                FolhaPagamentoConcreto folha = new FolhaPagamentoConcreto();
                f1.accept(folha);
                f2.accept(folha);
                f3.accept(folha);
                f4.accept(folha);
                g.accept(folha);
                System.out.println("Folha " + folha.getTotalFolha());
                
                FeriasConcreto ferias = new FeriasConcreto();
                f1.accept(ferias);
                f2.accept(ferias);
                f3.accept(ferias);
                f4.accept(ferias);
                g.accept(ferias);
                
                System.out.println("Total de funcionários com direito a férias: " + ferias.getTotalFunFerias());
                
        }
}
