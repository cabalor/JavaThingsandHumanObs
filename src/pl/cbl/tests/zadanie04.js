var sample1 = document.querySelectorAll(".sample_class")

function getElementsTag(elements) {
    var tablica=[]
    for (var i = 0; i < elements.length; i++) {
        tablica.push(elements[i].tagName)
    }
    return tablica;
}

console.log(getElementsTag(sample1));


var id1 = document.querySelectorAll("#sample_id")

function getElementsClass(element){
        var tablica2=[]
        for (var i = 0; i < element.length; i++) {
            tablica2.push(element[i].className)
        }
        return tablica2;
        }
        
console.log(getElementsClass(id1));


var sample = document.querySelector(".sample_class_2")
var Li = sample.querySelectorAll("li")



function getElementsInnerText(liElements) {
            var tablica3=[]
            for (var i = 0; i < liElements.length; i++) {
                tablica3.push(liElements[i].innerText)
            }
            return tablica3;
        }
      

console.log(getElementsInnerText(Li));

var links = document.querySelectorAll("a")


        function getElementsAdress(aElements) {
            var tablica4=[];
            for (var i = 0; i < aElements.length; i++) {
                tablica4.push(aElements[i].getAttribute("href"))
            }
            return tablica4
        }

        console.log(getElementsAdress(links));

var cls3 = document.querySelector(".sample_class_3");
var children = cls3.children;


        function childTag(elements){
            var tablica5 = [];
            for(var i =0; i<elements.length;i++){
                tablica5.push(elements[i].tagName)
        }
        return tablica5;

        }
console.log(childTag(children));
