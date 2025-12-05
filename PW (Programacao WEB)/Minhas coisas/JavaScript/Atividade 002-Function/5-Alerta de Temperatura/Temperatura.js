/*
Função para ver o clima
*/
function checarTemperatura(t) {
  if (t < 10) return "Cuidado, alerta de frio";
  if (t <= 25) return "A temperatura está ideal";
  return "Cuidado, alerta de calor";
}

/*
Para pegar elementos no HTML
*/
const btnTemp = document.querySelector("button");
const inpTemp = document.querySelector("#numero");
const resTemp = document.querySelector("#resultado");

/*
Quando clicar no botão
*/
btnTemp.addEventListener("click", function () {
  const t = Number(inpTemp.value);

  if (inpTemp.value === "") {
    resTemp.textContent = "Digite a temperatura em °C.";
    return;
  }

  if (isNaN(t)) {
    resTemp.textContent = "Valor inválido.";
    return;
  }

  resTemp.textContent = checarTemperatura(t);
});
