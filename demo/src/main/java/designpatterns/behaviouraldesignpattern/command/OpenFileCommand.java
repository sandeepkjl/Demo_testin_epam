package designpatterns.behaviouraldesignpattern.command;

public class OpenFileCommand implements FileOperation{

    ResourceFile resourceFile;

    public OpenFileCommand(ResourceFile resourceFile) {
        this.resourceFile = resourceFile;
    }

    @Override
    public void performOperation() {
        System.out.println("Opened the file :"+ resourceFile.name);
    }


}
