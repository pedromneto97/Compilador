public enum Constantes {
    //Constantes
    CVAR(8), CPROC(9),
    //Tipos
    TUNDEF(0), TINTEGER(1), TBOOLEAN(2),
    //Operações
    OPPLUS(100), OPMINUS(101), OPTIMES(102), OPSLASH(103), OPEQU(104), OPLSS(105), OPGTR(106);

    private int valor;

    Constantes(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
