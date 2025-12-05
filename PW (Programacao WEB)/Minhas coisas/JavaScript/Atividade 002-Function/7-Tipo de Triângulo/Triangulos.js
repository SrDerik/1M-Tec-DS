/*
Cálculo para mostrar o tipo de triângulo
*/
function tipoTriangulo(l1, l2, l3) {
  if (l1 === l2 && l2 === l3) {
    return "Seu triângulo é Equilátero";
  }
  if (l1 === l2 || l1 === l3 || l2 === l3) {
    return "Seu triângulo é Isósceles";
  }
  return "Seu triângulo é Escaleno";
}

/*
Pegando elementos do HTML
*/
const botao = document.querySelector("button");
const lado1 = document.querySelector("#lado1");
const lado2 = document.querySelector("#lado2");
const lado3 = document.querySelector("#lado3");
const resultado = document.querySelector("#resultado");

/*
Pegando o valor para ver erros
*/
botao.addEventListener("click", function () {
  const n1 = Number(lado1.value);
  const n2 = Number(lado2.value);
  const n3 = Number(lado3.value);

  /*
  Se vier com algum vazio
  */
  if (lado1.value === "" || lado2.value === "" || lado3.value === "") {
    resultado.textContent = "Preencha todos os lados!";
    return;
  }

  resultado.textContent = tipoTriangulo(n1, n2, n3);
});
