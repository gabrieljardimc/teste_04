package gestao_quatro;

public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolver() {
        if (a == 0 && b == 0 && c == 0) {
            return "Igualdade confirmada: 0 = 0";
        } else if (a == 0 && b == 0) {
            return "Coeficientes informados incorretamente";
        } else if (a == 0) {
            double raiz = -c / b;
            return "Esta é uma equação de primeiro grau: x = " + raiz;
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                return "Esta é uma equação de segundo grau. Esta equação não possui raízes reais (delta < 0): delta = " + delta;
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                return "Esta é uma equação de segundo grau. Esta equação possui duas raízes reais iguais: x' = x'' = " + raiz;
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + raiz1 + ", x'' = " + raiz2;
            }
        }
    }

    public static void main(String[] args) {
        // Aqui podemos adicionar um loop para permitir que o usuário execute o algoritmo quantas vezes desejar
        // Exemplo de execução
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(1, 6, 7);
        System.out.println(eq.resolver());
    }
}
