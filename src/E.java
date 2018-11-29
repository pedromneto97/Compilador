import java.util.ArrayList;
import java.util.List;

public class E {

    private List<T> locals = new ArrayList<T>();
    private E externo = null;
    private int nvars;

    public E() {
        this.externo = null;
        this.locals = new ArrayList<T>();
        this.nvars = 0;
    }

    public List<T> getLocals() {
        return locals;
    }

    public void setLocals(List<T> locals) {
        this.locals = locals;
    }

    public E getExterno() {
        return externo;
    }

    public void setExterno(E externo) {
        this.externo = externo;
    }

    public int getNvars() {
        return nvars;
    }

    public void setNvars(int nvars) {
        this.nvars = nvars;
    }

    /**
     * Concatena um novo T ao locals
     *
     * @param novo
     */
    public void append(T novo) {
        this.locals.add(novo);
    }

    /**
     * Encontra um T pelo nome e retorna ou retorna nulo
     *
     * @param nome
     * @return
     */
    public T find(String nome) {
        for (T atual : this.locals) {
            if (atual.getNome().equals(nome)) {
                return atual;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\tLocals existentes: \n\t" + this.locals + "\n\tNúmero de variáveis: " + this.nvars + "\n\tExterno: " + this.externo;
    }
}
