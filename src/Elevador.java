public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) {
            this.andarAtual = andarAtual;
        }
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= 1) {
            this.totalAndares = totalAndares;
        }
    }

    public void setCapacidade(int capacidade) {
        if (capacidade >= 1) {
            this.capacidade = capacidade;
        }
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        if (pessoasPresentes >= 0 && pessoasPresentes <= capacidade) {
            this.pessoasPresentes = pessoasPresentes;
        }
    }
}