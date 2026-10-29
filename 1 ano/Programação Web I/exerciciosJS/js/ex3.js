

n = parseInt(prompt("Digite o valor de N:"));
anterior = 0; 
atual = 1;     

for ( i = 1; i <= n; i++) {
    document.write(atual + " &nbsp; ");

    proximo = anterior + atual;
    anterior = atual;
    atual = proximo;
}
