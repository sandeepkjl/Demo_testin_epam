package designpatterns.behaviouraldesignpattern.command;

/**
 * In command design Pattern we don't pass the request to the resource,
 * we pass the request to resource as a command with the help of invoker,
 * Invoker invoke the command on the resource.
 *
 * see the example implemented
 *
 *
 * **/


public class CommandPatternTest {
    public static void main(String args[]){

        ResourceFile resourceFile = new ResourceFile("abc.txt");
        FileOperation fileOperation = new OpenFileCommand(resourceFile);

        FileOperationInvoker fileOperationInvoker = new FileOperationInvoker(fileOperation);

        fileOperationInvoker.execute();


    }
}
