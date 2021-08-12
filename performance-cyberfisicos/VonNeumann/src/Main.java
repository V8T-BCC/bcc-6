import Components.EnderecoInvalido;
import Components.IO;
import Components.RAM;
import Components.CPU;

public class Main {
    public static void main(String[] args) {
        IO es = new IO(System.out);
        RAM ram = new RAM(7);
        CPU cpu = new CPU(ram, es);

        try {
            ram.Write(0, 120);
            ram.Write(1, 127);
        } catch (EnderecoInvalido e) {
            System.err.println(e);
        }


        cpu.Run(0);

    }
}
