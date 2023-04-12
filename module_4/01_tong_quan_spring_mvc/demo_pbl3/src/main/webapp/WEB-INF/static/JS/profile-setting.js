let personal_infor_pg = document.querySelector('.personal-infor-page')
let contact_infor_pg = document.querySelector('.contact-infor-page')
let pwd_change_pg = document.querySelector('.pwd-change-page')

let personal_infor_btn = document.querySelector('.personal-infor-btn')
let contact_infor_btn = document.querySelector('.contact-infor-btn')
let pwd_change_btn = document.querySelector('.pwd-change-btn')

personal_infor_btn.addEventListener('click', (e) => {
    e.preventDefault()
    personal_infor_pg.style.display = 'block'
    contact_infor_pg.style.display = 'none'
    pwd_change_pg.style.display = 'none'
})

contact_infor_btn.addEventListener('click', (e) => {
    e.preventDefault()
    personal_infor_pg.style.display = 'none'
    contact_infor_pg.style.display = 'block'
    pwd_change_pg.style.display = 'none'
})

pwd_change_btn.addEventListener('click', (e) => {
    e.preventDefault()
    personal_infor_pg.style.display = 'none'
    contact_infor_pg.style.display = 'none'
    pwd_change_pg.style.display = 'block'
})

personal_infor_pg.style.display = 'block'
contact_infor_pg.style.display = 'none'
pwd_change_pg.style.display = 'none'