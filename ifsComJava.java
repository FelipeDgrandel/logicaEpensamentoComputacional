import java.util.Scanner;

public class ifsComJava {

    public static void main(String[] args) {
        Scanner leitorDeEntrada = new Scanner(System.in); 
        float valorSalario = leitorDeEntrada.nextFloat();
        float valorBeneficios = leitorDeEntrada.nextFloat();
        float valorImposto = 0;
        
        if (valorSalario >= 0 && valorSalario <=1100){
            valorImposto = 0.05F*valorSalario;
        }
        else if (valorSalario >= 1101 && valorSalario <= 2500){
            valorImposto = 0.10F * valorSalario;
        }
        else if (valorSalario >= 2501){
            valorImposto = 0.15F * valorSalario;
        }
        
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
        leitorDeEntrada.close();
    }
}