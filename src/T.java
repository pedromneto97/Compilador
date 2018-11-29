public class T {

    private String nome;
    private int categoria;
    private int tipo;
    private int address;

    public T(String nome, int categoria, int tipo) {
        this.nome = nome;
        this.setCategoria(categoria);
        this.setTipo(tipo);
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        if (categoria == Constantes.CVAR || categoria == Constantes.CPROC) {
            this.categoria = categoria;
        } else {
            throw new IllegalArgumentException("Valor de categoria inválido");
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo == Constantes.TUNDEF || tipo == Constantes.TINTEGER || tipo == Constantes.TBOOLEAN) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Valor do tipo inválido");
        }
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKind() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return "\n\t\tNome: " + this.nome + "\n\t\tCategoria: " + this.categoria + "\n\t\tTipo: " + this.tipo + "\n\t\tAddress: " + this.address + "\n\t";
    }
}
