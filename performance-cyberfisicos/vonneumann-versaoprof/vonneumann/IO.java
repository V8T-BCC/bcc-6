// von Neumann Básico
// PSCF - PUCPR (Prof. Luiz Lima)

package vonneumann;

public class IO {
	private final java.io.PrintStream saida;	// ex: System.out

	public IO(java.io.PrintStream saida) {
		this.saida = saida;
	}

	public void Output(String s) {
		saida.println(s);
	}
}
