const fetchData = async () =>{
    const response = await fetch('https://jsonplaceholder.typicode.com/posts');
    const data = await response.json();
    return data;
};

const displayData = (data) => {
    const dataContainer = document.getElementById('data-container');
    dataContainer.innerHTML = '';

    data.forEach(item => {
        const postElement = document.createElement('div');
        postElement.innerHTML = `
        <h3>${item.title}</h3>
        <p>${item.body}</p>`;
        dataContainer.appendChild(postElement);
    });
}

const showLoader = ()=>{
    const dataContainer = document.getElementById('data-container');
    dataContainer.innerHTML = '';

    for (let i = 0; i < 5; i++){
        const skeletonLoader = document.createElement('div');
        skeletonLoader.className = 'skeleton-loader';
        dataContainer.appendChild(skeletonLoader);
    }
};

showLoader();

setTimeout(() => {
    fetchData()
    .then((data) => {
        displayData(data);
    })
    .catch((error) => {
        console.error(`Error in fetching data ${error}`);
    });
}, 5000);