package designpatterns.behaviouraldesignpattern.command;

public class FileOperationInvoker {

    FileOperation fileOperation;

    public FileOperationInvoker(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    public void execute(){
      fileOperation.performOperation();
    }

    public FileOperation getFileOperation() {
        return fileOperation;
    }

    public void setFileOperation(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }
}
