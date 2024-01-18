public class mvcpattern {
    public static void main(String[] args) {
        //Create Model
        Student model = createStudent();
        //Create View
        StudentView view = new StudentView();
        //Create controller
        StudentController controller = new StudentController(model, view );

        //update View
        controller.updateView();

        //update Model data
        controller.setStudentName("Pharrell Kaim");
        controller.setStudentRoleNumber(33);

        //show view again
        controller.updateView();
    }

    private  static Student createStudent(){
        Student student = new Student();
        student.setName("Pharrell");
        student.setRoleNumber(25);
        return student;
    }

}

class Student{
    private Integer roleNumber;
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getRoleNumber(){
        return roleNumber;
    }

    public void setRoleNumber(Integer roleNumber){
        this.roleNumber = roleNumber;
    }
}

class StudentView{
    public void printStudentDetails(String studentName, Integer studentRoleNumber){
        System.out.println("StudentName: " + studentName);
        System.out.println("StudentRoleNumber: " + studentRoleNumber);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view  = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(Student model){
        return model.getName();
    }

    public void setStudentRoleNumber(Integer roleNumber){
        model.setRoleNumber(roleNumber);
    }

    public Integer getStudentRoleNumber(Student model){
        return model.getRoleNumber();
    }

    public void updateView(){
       view.printStudentDetails(model.getName(), model.getRoleNumber());
    }
}

