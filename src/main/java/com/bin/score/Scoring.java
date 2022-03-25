package com.bin.score;

public class Scoring {
    public static void main(String[] args) {
        Student King = new Student("King",87,78);
        King.print();
        Student John = new Student("John");
        John.print();
        GraduateStudent Jane = new GraduateStudent("Jane");
        Jane.print();
        //student.name = "king";
        //student.english = 87;
        //student.math = 78;

    }

    public static class GraduateStudent extends Student {
        public GraduateStudent (String name){
            super(name);
        }

    }
}

