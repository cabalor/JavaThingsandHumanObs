document.addEventListener('DOMContentLoaded', function(){
    var buttonA = document.querySelector('#button-1');
    var buttonD = document.querySelector('#button-2');
    var buttonC = document.querySelector('#button-3');
    var lista = document.querySelector('#shopping-list');

    buttonA.addEventListener('click', function(){
        var newP = document.createElement('p');
        newP.innerText = los(tablica);
        lista.appendChild(newP);
    });

    buttonD.addEventListener('click', function(){
        var elToDel = lista.children[lista.children.length-1];
        lista.removeChild(elToDel);
    });

    buttonC.addEventListener('click', function(){
        var elCloned = lista.children[1].cloneNode(true);
        lista.appendChild(elCloned);
    });
    
    
    
    var tablica = ["rodznki", "mleko","jablko","chleb", "bulka","kasztan", "kielbasa","mąka", "miotla", "slimak"];
    
    var length = tablica.length;
    
    console.log("do listy sa dopisywane losowe produkty z listy");
    
    function los(tab){
        return tab[Math.floor(Math.random()*(length))];
    }
    
    
    
});