public class Gasto {
    private boolean pagado;
    private String nombre;
    private int valor;

    public Gasto(String nombre, int valor, boolean pagado){
        this.nombre = nombre;
        this.valor = valor;
        this.pagado = pagado;
    }

    public int getValor(){
        return valor;
    }
}
