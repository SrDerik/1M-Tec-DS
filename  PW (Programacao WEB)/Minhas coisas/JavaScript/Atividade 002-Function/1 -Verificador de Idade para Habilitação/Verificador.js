/*
Função que responde se pode habilitar
*/
function podeDirigir(idade) {
  if (idade >= 18) {
    return "Você já pode ser habilitado(a)";
  } else {
    return "Você ainda não pode";
  }
}

/*
Pega os elementos da página
*/
const botao = document.querySelector("button");
const inputIdade = document.querySelector("#numero");
const resultado = document.querySelector("#resultado");

/*
Quando o usuário clicar, executa a verificação
*/
botao.addEventListener("click", function () {
  const idade = Number(inputIdade.value);

  /*
  Se vier vazio
  */
  if (!idade) { 
    resultado.textContent = "Por favor, insira uma idade válida.";
    return;
  }

  resultado.textContent = podeDirigir(idade);
});

