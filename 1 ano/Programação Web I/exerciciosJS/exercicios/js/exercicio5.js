var numero1 = prompt("Digite a primeira nota");
var numero2 = prompt("Digite a segunda nota");
var numero3 = prompt("Digite a terceira nota");

var soma = parseInt(numero1) + parseInt(numero2) + parseInt(numero3);
var media = parseInt(soma) / 3;

if(media>=7){
    alert("Aprovado:"+media);
}
else{
    alert("Reprovado:"+media);
}