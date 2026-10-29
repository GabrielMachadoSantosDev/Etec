 numero = parseInt(prompt("Digite um numero inteiro:"));

document.write("Tabuada do " + numero + "<br>");


for ( i = 1; i <= 10; i++) {
     resultado = numero * i;
    document.write(numero + " x " + i + " = " + resultado + "<br>");
}
