public class IntroArrays {
    private int[] numeros = { 1, 2, 3, 4, 5, 6, 7 };

    public int getNumeros() {
        return numeros[2];
    }

    public int getTamanhoArray() {
        return numeros.length;
    }

    public void listarNumeros() {
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }

    public static void main(String[] args) {
        IntroArrays obj = new IntroArrays();
        System.out.println("" + obj.getNumeros());
        System.out.println("" + obj.getTamanhoArray());
        obj.listarNumeros();
    }
}
