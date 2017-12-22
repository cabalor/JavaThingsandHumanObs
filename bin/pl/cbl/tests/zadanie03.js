document.addEventListener("DOMContentLoaded", function(){
    
   
    var User = function(name){
        this.name = name;
    }
    
User.prototype.welcomeUser = function(){
    return "welcome " + this.name;
}
    
var user1 = new User("rysiu");
console.log(user1.welcomeUser());
    
});