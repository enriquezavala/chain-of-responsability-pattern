package mx.theschool.handler;

import mx.theschool.request.Request;

public class TeacherHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getAbsences() <= 3) {
            System.out.println("The teacher will talk with the student.");
        } else {
            successor.handleRequest(request);
        }
    }
}
