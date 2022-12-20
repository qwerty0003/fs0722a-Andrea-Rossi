var alphas:string[]
alphas = ['1','2','3']
console.log(alphas[0])
console.log(alphas[1])
console.log(alphas[2])

var nums:number[]=[1,2,3,4,5]
console.log(nums[4])
console.log(nums[3])
console.log(nums[2])

//creo usando l'oggetto Array
//argomento -> un val num(rappresenta la dimensione) oppure un elenco di valori separati da virgole

var arr_names:number[]=new Array(4)
for(var i = 0;i < arr_names.length;i++){
    arr_names[i]=i*2
    console.log(arr_names[i])
}

var names:string[]=new Array("ciaoo","dumb","guy","Hill")
for(let k = 0;k<names.length;k++){
    console.log(names[k])
}

//metodi
//pop
var numbers= [1,4,9]
var element = numbers.pop()
console.log('element is: '+element)
//push
var length = numbers.push(10)
console.log('new number is: '+numbers)
//decostruzione di un array
var arr:number[]=[12,13]
var[x,y] = arr
console.log(x)
console.log(y)
//atraverso l'array con for
var j:any
var numz:number[]=[1233, 3427, 7306, 5354]
for(j in numz){
    console.log(numz[j])
}

// array multidimensionali
var array_bi:number[][]=[[100,666,234],[1,2,3]]

//posso passare un array ad una funzioone
var namez:string[]=new Array('gianniz','marioz','peppinz')
function display(unArrayNomi:string[]){
    for(let i = 0;i<unArrayNomi.length;i++){
        console.log(unArrayNomi[i])
    }
}display(namez)