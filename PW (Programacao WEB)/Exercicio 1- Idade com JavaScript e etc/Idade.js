document.getElementById('formulario').addEventListener('submit', function(event) {
    event.preventDefault(); // impede o recarregamento da página
      /*
      Pegando a data inserida
      */
        const inputData = document.getElementById('data');
        const valorData = inputData.value;
      /*
      Pegando data de nascimento e de hoje
      */
       const dataNascimento = new Date(valorData);
       const hoje = new Date();
      /*
      Fazendo calculos
      */
       let idade = hoje.getFullYear() - dataNascimento.getFullYear();
       const mes = hoje.getMonth() - dataNascimento.getMonth();
  
      /*
      Se valorData vier vazio
      */
       if (!valorData) {
         document.getElementById('resultado').textContent = "Por favor, selecione uma data";
         return;
       }
      /*
      Se for colocado uma data que nao passou
      */
       if (dataNascimento > hoje) {
         document.getElementById('resultado').textContent = "Você não nasceu ainda!";
        return;
      }
      /*
      Se o mes nao passou
      */
       if (mes < 0 || (mes === 0 && hoje.getDate() < dataNascimento.getDate())) {
         idade--;
       }
       
      /*
      Printando o resultado
      */
       document.getElementById('resultado').textContent = `Você tem ${idade} anos`;
       return;
     }
    );