// von Neumann Básico
// PSCF - PUCPR (Prof. Luiz Lima)

package vonneumann;

public class CPU {
	private final RAM ram;
	private final IO es;
	private int PC = 0;

	public CPU(RAM ram, IO es) {
		this.ram = ram;
		this.es = es;
	}

	public void Run(int ender) throws EnderecoInvalido {
		PC = ender;

		int regA = ram.Read(PC++);
		int regB = ram.Read(PC++);

		for (int i=regA; i<=regB; ++i) {
			ram.Write(i, i-regA+1);
			es.Output("\tcpu> " + i + " -> " + (i-regA+1));
		}
	}
}
