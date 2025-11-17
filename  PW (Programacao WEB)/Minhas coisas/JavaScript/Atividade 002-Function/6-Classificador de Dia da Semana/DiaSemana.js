/*
Imprimindo resultado com switch case (Rebecca indicou)
*/
function nomeDoDia(n) {
  switch (n) {
    case 1: return "Hoje é Domingo";
    case 2: return "Hoje é Segunda";
    case 3: return "Hoje é Terça";
    case 4: return "Hoje é Quarta";
    case 5: return "Hoje é Quinta";
    case 6: return "Hoje é Sexta";
    case 7: return "Hoje é Sábado";
    default: return "Número inválido (use de 1 a 7)";
  }
}
/*
Para pegar elementos do HTML
*/
const btnDia = document.querySelector("button");
const inpDia = document.querySelector("#numero");
const resDia = document.querySelector("#resultado");

/*
Se vier fora do comum
*/
btnDia.addEventListener("click", function () {
  const d = Number(inpDia.value);
  if (inpDia.value === "") {
    resDia.textContent = "Digite um número de 1 a 7";
    return;
  }
/*
Se vier numero com decimal  
*/
  if (!Number.isInteger(d)) {
    resDia.textContent = "Digite um número inteiro";
    return;
  }
  resDia.textContent = nomeDoDia(d);
});
