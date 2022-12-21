var mytuple = [10,'Hello']//i tipi vengono dedotti
console.log(mytuple[0])//10
console.log(mytuple[1])//'Hello'

console.log('Items before push: '+mytuple.length)
mytuple.push(12)
mytuple.push('hello world')
console.log('Items after push: '+mytuple.length)
