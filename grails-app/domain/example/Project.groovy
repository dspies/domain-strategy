package example

class Project {

    def grailsApplication

    String name
    String barcodeStrategy
    private BarcodeGenerator barcodeGenerator

    static constraints = {
        name blank: false
        barcodeStrategy blank: false
    }

    BarcodeGenerator getBarcodeGenerator(){
        if (!barcodeGenerator){
            barcodeGenerator = grailsApplication.classLoader.loadClass(this.barcodeStrategy).newInstance()
        }
        return barcodeGenerator
    }

    String toString(){
        return name
    }
}