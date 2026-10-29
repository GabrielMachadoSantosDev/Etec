idade = parseInt(prompt("Digite a idade:"));

if (idade < 0) {
    alert("Idade invalida");
} else if (idade <= 12) {
    alert("Crianca");
} else if (idade <= 17) {
    alert("Adolescente");
} else if (idade <= 59) {
    alert("Adulto");
} else {
    alert("Idoso");
}
