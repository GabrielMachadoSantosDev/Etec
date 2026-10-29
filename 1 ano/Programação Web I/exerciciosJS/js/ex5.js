
base = parseInt(prompt("Digite a base:"));
expoente = parseInt(prompt("Digite o expoente:"));

resultado = 1;
conta = "";

for (i = 1; i <= expoente; i++) {
    resultado = resultado * base;

    if (i == 1) {
        conta = base;
    } else {
        conta = conta + "*" + base;
    }
}

if (expoente == 0) {
    conta = "1";
}

document.write("Base " + base + "<br>");
document.write("Expoente " + expoente + "<br>");
document.write(conta + " = " + resultado);
