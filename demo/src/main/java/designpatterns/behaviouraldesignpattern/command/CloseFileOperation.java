package designpatterns.behaviouraldesignpattern.command;

public class CloseFileOperation implements FileOperation{

    ResourceFile resourceFile;

    public CloseFileOperation(ResourceFile resourceFile) {
        this.resourceFile = resourceFile;
    }

    @Override
    public void performOperation() {
        System.out.println("Closed The file : "+resourceFile.name);

    }

}
