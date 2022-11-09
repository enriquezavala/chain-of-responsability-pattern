package mx.theschool.handler;

import mx.theschool.request.Request;

// Handler is an interface based
// decoupling of sender and receiver
public abstract class Handler {
    // each handler has a reference to the next handler
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    // ConcreteHandler for each implementation
    public abstract void handleRequest(Request request);
}
