/*
Função que formata um número de 9 dígitos no formato XXXXX-XXXX
*/
function formatarTelefone(numero) {

  // Remove qualquer coisa que não seja número
  const somenteNumeros = numero.replace(/\D/g, "");

  // O telefone precisa ter exatamente 9 dígitos
  if (somenteNumeros.length !== 9) {
    return null;
  }

  // Divide as partes do telefone
  const parte1 = somenteNumeros.slice(0, 5);
  const parte2 = somenteNumeros.slice(5);

  return parte1 + "-" + parte2;
}

/*
Pegamos os elementos do HTML
*/
const botao = document.querySelector("button");
const inputTelefone = document.querySelector("#telefone");
const resultado = document.querySelector("#resultado");

/*
Quando o usuário clicar no botão, formatamos o número
*/
botao.addEventListener("click", function () {

  const valorDigitado = inputTelefone.value;

  if (valorDigitado === "") {
    resultado.textContent = "Digite um telefone com 9 dígitos.";
    return;
  }

  const formatado = formatarTelefone(valorDigitado);

  if (formatado === null) {
    resultado.textContent = "Número inválido. Use apenas 9 dígitos.";
    return;
  }

  resultado.textContent = formatado;
});
