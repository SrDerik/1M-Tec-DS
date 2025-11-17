/*
Cálculo para mostrar
*/
function calcularMediaSimples(n1, n2) {
  const media = (n1 + n2) / 2;
  return media >= 7 ? "Você foi aprovado" : "Você foi reprovado";
}

/*
Pegando elementos do HTML
*/
const btnMed = document.querySelector("button");
const inpN1 = document.querySelector("#numero");
const inpN2 = document.querySelector("#numero2");
const resMed = document.querySelector("#resultado");

/*
Pegando valores
*/
btnMed.addEventListener("click", function () {
  const n1 = Number(inpN1.value);
  const n2 = Number(inpN2.value);

  /*
  Se vier sem nada
  */
  if (inpN1.value === "" || inpN2.value === "") {
    resMed.textContent = "Preencha as duas notas.";
    return;
  }

  /*
  Se vier inválido
  */
  if (isNaN(n1) || isNaN(n2)) {
    resMed.textContent = "Notas inválidas.";
    return;
  }

  resMed.textContent = calcularMediaSimples(n1, n2);
});
