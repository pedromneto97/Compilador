public class TS {
    private E atual;
    private int nivel;

    public TS() {
        this.nivel = -1;
        this.atual = null;
    }

    public E getAtual() {
        return atual;
    }

    public void setAtual(E atual) {
        this.atual = atual;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Cria um novo escopo E e atribui o escopo anterior como externo do novo escopo. Também incrementa o nível em 1
     */
    public void openScope() {
        E e = new E();
        e.setExterno(this.atual);
        this.atual = e;
        this.nivel++;
    }

    /**
     * Remove o escopo atual, passando a ser o externo
     */
    public void closedScope() {
        this.atual = this.atual.getExterno();
        this.nivel--;
    }

    /**
     * Cria um novo T a partir dos parâmetros,
     * se o T for do tipo CVAR adiciona o address como o nvars atual e incrementa o nvars.
     * Concatena o novo a lista de T e retorna
     *
     * @param nome
     * @param categoria
     * @param tipo
     * @return
     */
    public T insert(String nome, int categoria, int tipo) {
        T novo = new T(nome, categoria, tipo);
        if (categoria == Constantes.CVAR) {
            novo.setAddress(this.atual.getNvars());
            this.atual.setNvars(this.atual.getNvars() + 1);
        }
        this.atual.append(novo);
        return novo;
    }

    /**
     * Passa E por E buscando por nome, caso encontre retorna o obj. Se não encontrar retorna um novo objeto T com nome NoObj
     *
     * @param aname
     * @return
     */
    public T find(String aname) {
        T encontrou;
        E aux = atual;
        while (aux != null) {
            encontrou = aux.find(aname);
            if (encontrou != null) {
                return encontrou;
            }
            aux = aux.getExterno();
        }
        return new T("NoObj", Constantes.CPROC, Constantes.TUNDEF);
    }

    @Override
    public String toString() {
        return "Escopo atual:\n" + this.atual + "\nNível: " + this.nivel;
    }
}
