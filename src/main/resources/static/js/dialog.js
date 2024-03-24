const btnDialogShower  = document.querySelectorAll(".dialog_btn_shower");
const btnDialogCloser  = document.querySelectorAll(".dialog_btn_closer");
const dialogs = document.querySelectorAll(".app_dialog");
btnDialogShower.forEach(el => {
    el.addEventListener("click",()=>{
        const dialog = findDialog(el.getAttribute('arial-target'));
        if(dialog && !dialog.classList.contains('show_dialog')) dialog.classList.add('show_dialog');
    })
})

btnDialogCloser.forEach(el => {
    el.addEventListener("click",()=>{
        const dialog = findDialog(el.getAttribute('arial-target'));
        if(dialog && dialog.classList.contains('show_dialog')) dialog.classList.remove('show_dialog');
    })
})

function findDialog(target){
    for(const dialog of dialogs) {
        if(dialog.getAttribute('data-target') === target) return dialog;
    }
    return null;
}