function relatorioAlarmes() {

    fetch("http://localhost:8080/alarmes/all")
        .then(res => tratarResposta(res))
}

function tratarResposta(resposta) {
    if(resposta) {
        resposta.json().then(res => exibirDados(res))
    }
}

function exibirDados(listaAlarmes) {
    let tabela = '<table class="table table-sm"> <tr> <th>Id Alarme</th> <th>Nome</th> <th>Descrição</th> </tr>'

    for(i = 0; i < listaAlarmes.length; i++) {
        tabela = tabela + `<tr> <td>${listaAlarmes[i].idAlarme}</td> <td>${listaAlarmes[i].nome}</td> <td>${listaAlarmes[i].descricao}</td> </tr>`
    }

    tabela = tabela + '</table>'
    document.getElementById("tabela").innerHTML = tabela
}

function validaLogin() {
    let userTxt = localStorage.getItem("userlogged");

    if(!userTxt) {
        window.location = "index.html"
    }

    let user = JSON.parse(userTxt);

    document.getElementById("user").innerHTML = `<b>Nome:</b> ${user.nome} <br> <b>RACF:</b> ${user.racf}`
    document.getElementById("foto").innerHTML = `<img src=${user.linkFoto}>`
    
}

function logout() {
    localStorage.removeItem("userlogged");
    window.location = "index.html";
}

function voltarMenu() {
    window.location = "dashmenu.html"
}