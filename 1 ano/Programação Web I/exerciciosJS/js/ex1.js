
nome = prompt("Digite seu nome:");
anoNascimento = parseInt(prompt("Digite o ano de nascimento:"));
anoAtual = parseInt(prompt("Digite o ano atual:"));

idade = anoAtual - anoNascimento;

if (idade >= 18) {
    alert(nome + ", voce e maior de idade");
} else {
    alert(nome + ", voce e menor de idade");
}
