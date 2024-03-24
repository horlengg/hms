const appMenu = document.querySelector("#app_menu");
const btnToggleLayout = document.querySelector("#btn_toggle_layout");


function resetMenus(){
    const menus = appMenu.querySelectorAll('.app_menu_item')
    menus.forEach(el => {
        if(el.classList.contains('menu_active')) el.classList.remove('menu_active');
    })

}

function handleAppLoad(){
    resetMenus();
    const currentPath = location.pathname.split('/')[1];
    const currentMenuitem = appMenu.querySelector(`#${currentPath}_mgmt`)
    currentMenuitem.classList.add('menu_active');
}


window.addEventListener('load',handleAppLoad)
btnToggleLayout.addEventListener('click',()=>{
    document.body.classList.toggle('inactive_layout');
})