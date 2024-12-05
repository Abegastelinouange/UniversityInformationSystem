/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */


import java.util.ArrayList;
import java.util.List;

public class Department {
	 private final String name;
	    private final List<Professor> professors;
	    private final List<Student> students;

	    public Department(String name) {
	        this.name = name;
	        this.professors = new ArrayList<>();
	        this.students = new ArrayList<>();
	    }

	    public void addProfessor(Professor professor) {
	        this.professors.add(professor);
	    }

	    public void addStudent(Student student) {
	        this.students.add(student);
	    }

	    public String getName() {
	        return this.name;
	    }

	    public List<Professor> getProfessors() {
	        return this.professors;
	    }

	    public List<Student> getStudents() {
	        return this.students;
	    }
	}
