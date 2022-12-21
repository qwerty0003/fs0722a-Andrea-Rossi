//duck-typing -> due oggetti  sono considerati dello stesso tipo se condividono lo stesso insieme di propietà
interface IPoint{
    x:number
    y:number
}
function addPoints(p1:IPoint,p2:IPoint):IPoint{
    var x = p1.x + p2.x
    var y = p1.y + p2.y
    return{x:x,y:y}
}
var newPoint = addPoints({x:3,y:6},{x:6,y:7}) //struttura valida
//var newPoint = addPoints({x:3,y:6}{x:6}) struttura non valida,5 mancano una virgola e la y
