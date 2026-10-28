function tabuada() {
    numero1 = document.getElementById("txtabuada").value


    for(i=1; i <= 10; i++) {
        resultado = parseInt(numero1) * parseInt(i);
        document.write(numero1 + "x " + i + " = " + resultado + " <br> ")
    }

}