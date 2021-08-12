// von Neumann Básico
// PSCF - PUCPR (Prof. Luiz Lima)

// ALTERE O PROGRAMA PRINCIPAL ABAIXO CONFORME
// INSTRUÇÕES FORNECIDAS NA AULA

package vonneumann;

public class Main {
	public static void main(String [] args) {

		IO es = new IO(System.out);
		es.Output("Olá");

		try {
			RAM ram = new RAM(7);
			ram.Write(122, 11);
			System.out.println(ram.Read(122));

			ram.Write(128,111);
		} catch (EnderecoInvalido erro) {
			System.err.println(erro);
		}

	}
}
