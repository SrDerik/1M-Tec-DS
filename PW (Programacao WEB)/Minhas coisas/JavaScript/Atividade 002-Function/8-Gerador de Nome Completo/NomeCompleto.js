/*
Juntando nome e sobrenome
*/
function gerarNomeCompleto(primeiro, sobrenome) {
  return primeiro + " " + sobrenome;
}

/*
Pegando elementos do HTML
*/
const botao = document.querySelector("button");
const inputNome = document.querySelector("#nome");
const inputSobrenome = document.querySelector("#sobrenome");
const resultado = document.querySelector("#resultado");

/*
Pegando valores
*/
botao.addEventListener("click", function () {
  const nome = inputNome.value.trim();
  const sobrenome = inputSobrenome.value.trim();

  /*
  Se vier sem nada
  */
  if (!nome || !sobrenome) {
    resultado.textContent = "Preencha nome e sobrenome.";
    return;
  }

  resultado.textContent = gerarNomeCompleto(nome, sobrenome);
});
