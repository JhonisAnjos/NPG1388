function openFormCadastro(){
    window.location = "cadastro.html";
}

function cancelCadastro(){
   window.location = "index.html";
}

function submitFormCadastro(e){
    let msg = document.getElementById("msg");
    let senha = document.getElementById("inputPassword").value;
    let senhaConfirm = document.getElementById("inputPasswordConfirm").value;
    if(senha !== senhaConfirm){
        console.log("aqui");
        msg.innerHTML = "Senhas não conferem";
        e.preventDefault();
    }
}