const moreBtn = doument.querySelector('.info .metadata .moreBtn');
const title = document.querySelector('.info .metadata .title');

moreBtn.anddEventListener('click', () => {
    moreBtn.classList.toggle('clicked');
    title.classList.toggle('clamp');
});
