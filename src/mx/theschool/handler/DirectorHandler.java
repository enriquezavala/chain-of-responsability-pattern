package mx.theschool.handler;

import mx.theschool.request.Request;

public class DirectorHandler extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getAbsences() > 3 && request.getAbsences() <= 5) {
            System.out.println("The Director will talk with the student.");
        } else {
            successor.handleRequest(request);
        }
    }
}
