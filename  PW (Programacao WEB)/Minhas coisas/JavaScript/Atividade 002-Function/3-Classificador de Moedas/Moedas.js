/*
Função que verifica qual valor recebeu e responde
*/
function classificarMoeda(valor) {
  if (valor === 0.01) return "1 centavo";
  if (valor === 0.05) return "5 centavos";
  if (valor === 0.10) return "10 centavos";
  if (valor === 0.25) return "25 centavos";
  if (valor === 0.50) return "50 centavos";
  if (valor === 1.00) return "1 real";
  return "Valor desconhecido";
}

/*
Pegando os elementos do HTML
*/
const btnMoeda = document.querySelector("button");
const inpMoeda = document.querySelector("#numero");
const resMoeda = document.querySelector("#resultado");

/*
Começa a função quando clicar
*/
btnMoeda.addEventListener("click", function () {
  const v = Number(inpMoeda.value);

  /*
  Se o valor for inválido
  */
  if (!inpMoeda.value) {
    resMoeda.textContent = "Digite um valor (ex: 0.25)";
    return;
  }

  /*
  Se não for número
  */
  if (isNaN(v)) {
    resMoeda.textContent = "Valor inválido";
    return;
  }

  /*
  Para evitar problemas com ponto flutuante, formatamos com 2 casas
  */
  const rounded = Math.round(v * 100) / 100;
  resMoeda.textContent = classificarMoeda(rounded);
});
