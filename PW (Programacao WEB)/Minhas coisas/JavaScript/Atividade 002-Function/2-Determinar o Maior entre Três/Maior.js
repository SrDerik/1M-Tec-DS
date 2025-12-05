/*
Função que recebe 3 números e retorna o maior deles
*/
function encontrarMaior(num1, num2, num3) {
  if (num1 >= num2 && num1 >= num3) {
    return num1;
  } 
  if (num2 >= num1 && num2 >= num3) {
    return num2;
  }
  return num3;
}

/*
Pegamos os elementos do HTML
*/
const botao = document.querySelector("button");
const input1 = document.querySelector("#num1");
const input2 = document.querySelector("#num2");
const input3 = document.querySelector("#num3");
const resultado = document.querySelector("#resultado");

/*
Quando clicar no botão, verificamos os valores
*/
botao.addEventListener("click", function () {

  const n1 = Number(input1.value);
  const n2 = Number(input2.value);
  const n3 = Number(input3.value);

  /*
  Validamos os 3 números
  */
  if (input1.value === "" || input2.value === "" || input3.value === "") {
    resultado.textContent = "Preencha todos os três números.";
    return;
  }

  /*
  Verifica se são números válidos
  */
  if (isNaN(n1) || isNaN(n2) || isNaN(n3)) {
    resultado.textContent = "Digite apenas números válidos.";
    return;
  }

  /*
  Mostra o maior número
  */
  const maior = encontrarMaior(n1, n2, n3);
  resultado.textContent = "O maior número é: " + maior;
});
