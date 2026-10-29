n1 = parseFloat(prompt("Digite o primeiro numero:"));
n2 = parseFloat(prompt("Digite o segundo numero:"));

if (n1 > n2) {
    alert("O maior e " + n1);
} else if (n2 > n1) {
    alert("O maior e " + n2);
} else {
    alert("Os numeros sao iguais");
}
