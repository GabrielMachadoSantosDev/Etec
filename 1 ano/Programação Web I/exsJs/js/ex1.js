function subtrair (){
    numero1 = document.getElementById("txanonasc").value
    numero2 = document.getElementById("txanoatual").value
    nome = document.getElementById("txnome").value
    subtrair = parseInt(numero2) - parseInt(numero1)
    alert(subtrair)

    alert(nome)

 if(subtrair<18){
    alert ("Menor de idade")
 }

 else{
    alert ("Maior de idade")
 }

}
