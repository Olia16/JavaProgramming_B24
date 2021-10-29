package ExtraPractice;

import java.util.ArrayList;

public class UsingCanvas {
    /*
    create an object of the Canvas and verify all the fields and methods can be
accessed and used
     */
    public static void main(String[] args) {

        Quiz quiz = new Quiz("String",5,4);
        System.out.println(quiz.takeQuiz());
        Quiz quiz2 = new Quiz("SS", 15, 10);

        File file = new File("UnitOne", 10);
        File file2 = new File("UnitTwo", 15);

        Module module = new Module();
        module.addFile(file);
        module.addFile(file2);
        Module module1 = new Module(module.files);
        module.files.add(file);

        Canvas canvas = new Canvas("SS");
        canvas.addModules(module);
        canvas.addQuizzes(quiz);
        canvas.addQuizzes(quiz2);
        canvas.quizzes.add(quiz);
        canvas.modules.add(module);
        canvas.modules.get(0);

        System.out.println(canvas.topic);
        System.out.println(canvas.quizzes);
        System.out.println(canvas.modules);
        module.removeFile(file);
        System.out.println(module1);
        System.out.println(quiz);
        System.out.println(file.openFile());
        Canvas canvas1 = new Canvas("Java", canvas.quizzes, canvas.modules);
       // System.out.println(canvas1.topic);
        System.out.println(canvas1);




    }
}
