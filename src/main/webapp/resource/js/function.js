function openFormCadastro(){
    window.location = "cadastro.jsp";
}

function cancelCadastro(){
   window.location = "login.jsp";
}

function submitFormCadastro(e){
    let msg = document.getElementById("msg");
    let senha = document.getElementById("inputPassword").value;
    let senhaConfirm = document.getElementById("inputPasswordConfirm").value;
    if(senha !== senhaConfirm){
        console.log("aqui");
        msg.innerHTML = "Senhas não conferem!";
        e.preventDefault();
    }
}