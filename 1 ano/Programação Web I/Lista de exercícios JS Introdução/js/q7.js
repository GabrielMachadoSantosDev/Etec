nota = parseFloat(prompt("Digite a nota de 0 a 10:"));

if (nota < 0 || nota > 10) {
    alert("Nota invalida");
} else if (nota >= 9) {
    alert("Conceito A");
} else if (nota >= 7) {
    alert("Conceito B");
} else if (nota >= 5) {
    alert("Conceito C");
} else {
    alert("Conceito D");
}
