const aLinks = document.querySelectorAll('.city');
// console.log(aLinks);

const imgTag = document.querySelector('img');

for (let i = 0; i < aLinks.length; i++) {
    aLinks[i].addEventListener('click', function () {
       imgTag.src = `img/${aLinks[i].classList[1]}.jpg`;

       aLinks.forEach((elem)=>{
        elem.classList.remove('curr_sel');
       });

       aLinks[i].classList.add('curr_sel');
    });
    // aLinks[i].style.setProperty('cursor', 'pointer'); // 이건 CSS에서 하는게 좋음
}