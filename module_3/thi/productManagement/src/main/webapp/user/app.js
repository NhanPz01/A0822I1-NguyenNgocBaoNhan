var btnOpen = document.querySelector('.open-modal-btn');
var modal = document.querySelector('.modal');
var iconClose = document.querySelector('.modal__header button');
var btnClose = document.querySelector('.modal__footer button');

function toggleModal(e) {
    console.log(e.target);
    modal.classList.toggle('hide');
}

btnOpen.addEventListener('click', toggleModal)
btnClose.addEventListener('click', toggleModal)
iconClose.addEventListener('click', toggleModal)
modal.addEventListener('click', toggleModal)