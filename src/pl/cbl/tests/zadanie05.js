document.addEventListener('DOMContentLoaded', function(){
    var buttons = document.querySelectorAll('button');
    var div = document.querySelector('div');

    function clickbuton(){
        console.log(this); 
        div.innerText = this.dataset.text;
    }

    [].forEach.call(buttons, function(element){
       element.addEventListener('click', clickbuton); 

    });

});