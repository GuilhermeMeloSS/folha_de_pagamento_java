import java.util.Scanner;

public class folhapgmto {

    public static void main(String[] args) {

        int horas;
        double valorHora, salarioBruto, descontoINSS, descontoSindicato, descontoIR, fgts, salarioLiquido;
        double irPercentual = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas horas você trabalha mensalmente? ");
        horas = sc.nextInt();

        System.out.print("Qual o valor da sua hora trabalhada? ");
        valorHora = sc.nextDouble();

        salarioBruto = horas * valorHora;
        descontoINSS = 0.1 * salarioBruto;
        descontoSindicato = 0.03 * salarioBruto;
        fgts = 0.11 * salarioBruto;

        if (salarioBruto <= 900) {
            irPercentual = 0;
        } else if (salarioBruto <= 1500) {
            irPercentual = 0.05;
        } else if (salarioBruto <= 2500) {
            irPercentual = 0.1;
        } else {
            irPercentual = 0.2;
        }

        descontoIR = salarioBruto * irPercentual;
        salarioLiquido = salarioBruto - (descontoINSS + descontoSindicato + descontoIR);

        System.out.println("----- Folha de Pagamento -----");
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Desconto Sindicato: R$ %.2f%n", descontoSindicato);
        System.out.printf("Desconto IR: R$ %.2f%n", descontoIR);
        System.out.printf("FGTS: R$ %.2f%n", fgts);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}
