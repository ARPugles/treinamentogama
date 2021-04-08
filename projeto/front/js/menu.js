function validaLogin() {
    let userTxt = localStorage.getItem("userlogged");

    if(!userTxt) {
        window.location = "index.html"
    }

    let user = JSON.parse(userTxt);

    document.getElementById("user").innerHTML = `nome: ${user.nome} RACF ${user.racf}`
    document.getElementById("foto").innerHTML = `<img src=${user.linkFoto}>`
}

function logout() {
    localStorage.removeItem("userlogged");
    window.location = "index.html";
}

function gerarRelatorio() {
    // let dataInicio = document.getElementById("dataInicio").value
    // let dataFinal = document.getElementById("dataFinal").value
    // console.log(dataInicio)
    // console.log(dataFinal)

    fetch("http://localhost:8080/usuarios/all")
        .then(res => tratarResposta(res))
}

function tratarResposta(resposta) {
    if(resposta) {
        resposta.json().then(res => exibirDados(res))
    }
}

function exibirDados(listaUsers) {
    let tabela = '<table class="table table-sm"> <tr> <th>nome</th> <th>email</th> <th>racf</th> </tr>'

    for(i = 0; i < listaUsers.length; i++) {
        tabela = tabela + `<tr> <td>${listaUsers[i].nome}</td> <td>${listaUsers[i].email}</td> <td>${listaUsers[i].racf}</td> </tr>`
    }

    tabela = tabela + '</table>'
    document.getElementById("tabela").innerHTML = tabela
}