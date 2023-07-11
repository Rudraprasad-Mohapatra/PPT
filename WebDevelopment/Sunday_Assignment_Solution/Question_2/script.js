document.getElementById('btn').addEventListener('click', () => {
    const inpVal = document.getElementsByTagName("input")[0].value;
    if (inpVal !== '') {
        const divi = document.createElement('div');
        divi.innerHTML = inpVal;
        document.body.appendChild(divi);
        document.getElementsByTagName("input")[0].value = "";
    }
})