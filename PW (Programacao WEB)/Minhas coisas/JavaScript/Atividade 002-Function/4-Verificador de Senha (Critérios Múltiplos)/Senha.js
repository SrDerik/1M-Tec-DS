/*
Função para ver se é menor do que 8 ou "12345678"
*/
function senhaForte(senha) {
  return senha.length > 8 && senha !== "12345678";
}

/*
Pegando elementos do HTML
*/
const botao = document.querySelector("button");
const inputSenha = document.querySelector("#senha");
const resultado = document.querySelector("#resultado");

/*
Pegando o valor
*/
botao.addEventListener("click", function () {
  const senha = inputSenha.value;

  /*
  Se vier vazio
  */ 
  if (!senha) {
    resultado.textContent = "Digite uma senha!";
    return;
  }

  /*
  Resultado
  */
  resultado.textContent = senhaForte(senha)
    ? "Sua senha é forte"
    : "Sua senha é fraca";
});
