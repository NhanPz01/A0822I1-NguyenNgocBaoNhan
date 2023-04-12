let account_type = document.querySelector('.account-type')
let next_section_btn = document.querySelector('.next-section-btn')
let prev_section_btn = document.querySelector('.prev-section-btn')

account_type.addEventListener('change', (e) => {
    display()
})

next_section_btn.addEventListener('click', (e) => {
    document.querySelector('.next-section').style.display = 'flex'
    document.querySelector('.prev-section').style.display = 'none'
})

prev_section_btn.addEventListener('click', (e) => {
    document.querySelector('.next-section').style.display = 'none'
    document.querySelector('.prev-section').style.display = 'flex'
})

function display(){
    if (account_type.value == "Doctor")
    {
        document.querySelector('.doctor-section').style.display = 'flex'
        document.querySelector('.patient-section').style.display = 'none'
    }
    else
    {
        document.querySelector('.doctor-section').style.display = 'none'
        document.querySelector('.patient-section').style.display = 'flex'
    }
    console.log(account_type.value)
}

display()
document.querySelector('.next-section').style.display = 'none'
document.querySelector('.prev-section').style.display = 'flex'

