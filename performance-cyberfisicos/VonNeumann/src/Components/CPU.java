package Components;

public class CPU {
    private final RAM ram;
    private final IO es;
    private int PC = 0;

    public CPU (RAM ram, IO es) {
        this.ram = ram;
        this.es = es;
    }

    public void Run(int ender) throws Exception{
        PC = ender;

        int reg_a = ram.Read(PC++);
        int reg_b = ram.Read(PC++);

        for (int i=reg_a; i<=reg_b; i++) {
            ram.Write(i, i-reg_a+1);
            es.Output("\tcpu> " + i + " -> " + (i-reg_a+1));
        }

    }
}
