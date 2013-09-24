import example.*

class BootStrap {

    def init = { servletContext ->

        def simpleProject = new Project(name:'Simple Project', barcodeStrategy: 'example.SimpleBarcodeGenerator').save()
        println simpleProject.toString() + ' >> ' + simpleProject.getBarcodeGenerator().generateBarcode()

        def complexProject = new Project(name:'Complex Project', barcodeStrategy: 'example.ComplexBarcodeGenerator').save()
        println complexProject.toString() + ' >> ' + complexProject.getBarcodeGenerator().generateBarcode()

    }
    def destroy = {
    }
}
