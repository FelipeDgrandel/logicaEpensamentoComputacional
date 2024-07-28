#Funçao util para para o calculo do imposto(baseados nas aliquotas)
def calcular_imposto(salario):
    aliquota = 0.0
    if (salario >= 0 and salario <1500):
        aliquota = 0.05
    elif (salario >= 1501 and salario <= 2500):
        aliquota =  0.10
    else :
        aliquota = 0.15
    return aliquota*salario
#Le os valores de entradas:
valorSalario =  float(input())
valorBeneficio = float(input())

#calcula o impostos atraves da funçao "calcular imposto":
valor_imposto = calcular_imposto(valorSalario)

#calcula e imprime a Saida (com dua casas decimais)
saida = valorSalario - valor_imposto + valorBeneficio
print(f'{saida:.2f}')    