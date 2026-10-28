console.log("Hello World!")

var nome = prompt ("Digite seu nome");
var idade = prompt ("Digite sua idade");
var altura = prompt ("Digite sua altura");


console.log("Nome:" +nome+ "\n idade:"+idade+ "\n altura:"+altura)

if(idade>17){
    alert("Maior de idade")
}

else{
    alert("Menor de Idade")
}

var numero1 = prompt("Digite o primeiro número:");
var numero2 = prompt("Digite o segundo número:");

var soma = parseInt(numero1) + parseInt(numero2);
alert("Soma:"+soma);

var sub = parseFloat(numero1) - parseFloat(numero2);
alert("Subtração:"+sub);
