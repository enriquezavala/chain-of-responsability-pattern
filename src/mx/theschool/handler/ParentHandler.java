package mx.theschool.handler;

import mx.theschool.request.Request;

public class ParentHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getAbsences() > 5) {
            System.out.println("The Parent will talk with the student.");
        }
    }
}
