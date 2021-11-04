package funcionario;

public class Funcionario {

    private int id;
    private int numFilhos;
    private float salario;

    public Funcionario(int id, int numFilhos, float salario) {
        this.id = id;
        this.numFilhos = numFilhos;
        this.salario = salario;
    }

    public String funcInfo(){
        return id + "," + numFilhos + "," + salario +"\n";
    }

    public int getId() {
        return id;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public float getSalario() {
        return salario;
    }
}
