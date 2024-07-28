using System;

public class ifsComcc {
    public static void main(){
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine();)
        float valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F* valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <=2500){
            valorImposto = 0.10F * valorSalario;
        }
        else if (valorSalario >= 2500.01){
            valorImposto = 015F * valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.writeLine(saida.ToString("0.00"));
    } 
}