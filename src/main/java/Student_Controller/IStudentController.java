/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Controller;

import DAO_Controller.DAOSQL;
import Exceptions.DAO_Excep;
import Exceptions.Student_Excep;
import Models.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fran Perez
 */
public interface IStudentController {

    public abstract void readAllStudents() throws DAO_Excep, Student_Excep;
    
    public abstract void readStudents() throws DAO_Excep, Student_Excep;

    public abstract void insertStudent() throws DAO_Excep, Student_Excep;

    public abstract void updateStudent() throws DAO_Excep, Student_Excep;

    public void deleteStudent() throws DAO_Excep, Student_Excep;
    
    public void deleteAllStudents() throws DAO_Excep, Student_Excep;    
    
    public void resetAges() throws DAO_Excep, Student_Excep;      

}
