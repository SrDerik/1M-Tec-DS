function verificar() {
  let resultado = document.getElementById("resultado");
  /*
   Pegando o número do input
  */ 
  let numero = Number(document.getElementById("numero").value);
  /*
   Fazendo o cálculo (módulo de 2) e imprimindo
  */ 
  if (numero % 2 === 0) {
    resultado.textContent = `O número ${numero} é par!`;
  } else {
    resultado.textContent = `O número ${numero} é ímpar!`;
  }
}
