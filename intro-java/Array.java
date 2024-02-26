public class Array {
    private int[] numeros;

    public Array(int[] numeros) {
        this.numeros = numeros;
    }

    public void listarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrayNumeros = { 1, 2, 3, 4, 5, 6 };
        Array array = new Array(arrayNumeros);
        array.listarNumeros();
    }
}
