const open = document.getElementById('open');
const close = document.getElementById('close');
const container = document.getElementById('container');

open.addEventListener('click', () => {
    container.classList.add('active');
    document.body.style.overflow = "hidden";
});

close.addEventListener('click', () => {
    container.classList.remove('active');
    document.body.style.overflow = "scroll";
});
const parentElement = container;
parentElement.addEventListener('click', (e) => {
    if (e.target === parentElement) {
        container.classList.remove('active');
        document.body.style.overflow = "scroll";
    }
});

