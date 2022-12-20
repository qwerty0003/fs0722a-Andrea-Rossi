// override -> la classe figlia definisce il metodo della super-classe
class PrinterClass{
    doPrint():void{
        console.log('doPrint() from Parent called..')
    }
}
class StringPrinter extends PrinterClass{
    doPrint(): void {
        super.doPrint(){
            console.log(`doPrint() is printin' a string..` )
        }
    }
}
var obw = new StringPrinter()
obw.doPrint()