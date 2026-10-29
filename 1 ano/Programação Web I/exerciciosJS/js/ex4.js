
 numero = parseInt(prompt("Digite um nmero inteiro:"));

 divisores = 0;

for ( i = 1; i <= numero; i++) {
    if (numero % i == 0) { 
        divisores++;
    }
}

if (divisores == 2) {
    alert(numero + " e um numero primo");
} else {
    alert(numero + " nao e um numero primo");
}
