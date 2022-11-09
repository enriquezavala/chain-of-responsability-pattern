package mx.theschool;

import mx.theschool.handler.DirectorHandler;
import mx.theschool.handler.ParentHandler;
import mx.theschool.handler.TeacherHandler;
import mx.theschool.request.Request;

public class Main {

    public static void main(String[] args) {
        TeacherHandler teacherHandler = new TeacherHandler();
        DirectorHandler directorHandler = new DirectorHandler();
        ParentHandler parentHandler = new ParentHandler();

        // chain of receiver objects
        teacherHandler.setSuccessor(directorHandler);
        directorHandler.setSuccessor(parentHandler);

        Request request = new Request();
        request.setAbsences(3);
        teacherHandler.handleRequest(request);
        // The teacher will talk with the student.

        request = new Request();
        request.setAbsences(5);
        teacherHandler.handleRequest(request);
        // The Director will talk with the student.

        request = new Request();
        request.setAbsences(7);
        teacherHandler.handleRequest(request);
        // The Parent will talk with the student.
    }
}
