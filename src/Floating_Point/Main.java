public class Main {
    public static void main(String[] args) {
        System.out.println("***********************");
        System.out.println("       Questão 1       ");
        System.out.println("***********************");
        System.out.println("A precisão está relacionada com a quantidade de informação armazenada em um número.");
        System.out.println("Normalmente são utilizados 32 bits para pontos flutuantes de precisão simples,\ne 64 bits para precisão dupla.");

        System.out.println("***********************");
        System.out.println("       Questão 2       ");
        System.out.println("***********************");
        System.out.println("A precisão dupla consegue guardar mais informação, ou seja, ser literalmente mais precisa.\nConsegue representar mais números antes ou depois da vírgula.");
        System.out.println("Sendo assim, consegue guardar números muito maiores ou muito menores.");
        System.out.println("A maior desvantagem disso é que eles ocupam o dobro de armazenamento e, por consequência, fazem o programa levar mais tempo para a execução.");

        System.out.println("***********************");
        System.out.println("       Questão 3       ");
        System.out.println("***********************");
        System.out.println("O tipo 'int' é usado para números inteiros entre " + Integer.MIN_VALUE + " e " + Integer.MAX_VALUE);
        System.out.println("O tipo 'float' é usado para números com módulo maior que os suportados pelo tipo 'int', ou números decimais.");
        System.out.println("O tipo 'double' é usado para números ainda maiores que 'float', ou com ainda mais detalhes.");

        System.out.println("***********************");
        System.out.println("       Questão 4       ");
        System.out.println("***********************");
        System.out.println("           a           ");
        System.out.println("***********************");
        System.out.println("""
                int n = 100000;
                float x, resultado, s;
                x = 0.1F;
                s = 10000F;
                resultado = 0F;
                for (int k = 1; k <= n; k++) {
                   resultado += x;
                }
                s -= resultado;
                System.out.println(s)
                """);
        int n = 100000;
        float x, resultado, s;
        x = 0.1F;
        s = 10000F;
        resultado = 0F;
        for (int k = 1; k <= n; k++) {
            resultado += x;
        }
        s -= resultado;
        System.out.println("S = " + s);

        System.out.println("***********************");
        System.out.println("           b           ");
        System.out.println("***********************");
        System.out.println("""
                int n = 80000;
                float x, resultado, s;
                x = 0.125F;
                s = 10000F;
                resultado = 0F;
                for (int k = 1; k <= n; k++) {
                   resultado += x;
                }
                s -= resultado;
                System.out.println(s)
                """);
        n = 80000;
        x = 0.125F;
        s = 10000F;
        resultado = 0F;
        for (int k = 1; k <= n; k++) {
            resultado += x;
        }
        s -= resultado;
        System.out.println("S = " + s);
    }
}