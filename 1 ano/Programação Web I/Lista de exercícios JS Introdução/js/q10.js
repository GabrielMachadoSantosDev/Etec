n1 = parseFloat(prompt("Digite o primeiro numero:"));
n2 = parseFloat(prompt("Digite o segundo numero:"));
opcao = parseInt(prompt("Escolha a operacao:\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao"));

switch (opcao) {
    case 1:
        alert("Resultado: " + (n1 + n2));
        break;
    case 2:
        alert("Resultado: " + (n1 - n2));
        break;
    case 3:
        alert("Resultado: " + (n1 * n2));
        break;
    case 4:
        if (n2 == 0) {
            alert("Nao e possivel dividir por zero");
        } else {
            alert("Resultado: " + (n1 / n2));
        }
        break;
    default:
        alert("Opcao invalida");
}
