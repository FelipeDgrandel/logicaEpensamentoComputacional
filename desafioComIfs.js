// Le os valores de entrada:
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

//Calcula imposto atraves da funcao " calcularImposto"
const valorImposto = calcularImposto(valorSalario);

//calcula e imprime a saida ( com duas casa decimais)
const saida = valorSalario - valorImposto + valorBeneficios;
print(saida.toFixed(2));

//funcao util para o calculo do imposto (baseados nas aliquotas).
function calcularImposto(salario){
    let aliquota = 0;
    if (salario >= 0 && salario <=1100){
        aliquota = 0.05;
    } else if (salario >=1101 && salario <= 2500){
        aliquota = 0.10
    } else if (salario >= 2501){
        aliquota = 0.15
    } return aliquota*salario;
}
