import java.util.ArrayList;
import java.util.List;

class Course
{
    private int courseId;
    private String courseName;
    private int maxCapacity;
    private int currentEnrollment;

    // Constructor
    public Course(int courseId, String courseName, int maxCapacity) 
	{
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.currentEnrollment = 0;
    }

    // Getter methods
    public int getCourseId() 
	{
        return courseId;
    }

    public String getCourseName() 
	{
        return courseName;
    }

    public int getMaxCapacity() 
	{
        return maxCapacity;
    }

    public int getCurrentEnrollment() 
	{
        return currentEnrollment;
    }

    // Method to enroll a student
    public boolean enrollStudent() 
	{
        if (currentEnrollment < maxCapacity) 
		{
            currentEnrollment++;
            return true;
        }
        return false;
    }

    // Method to remove a student from the course
    public void removeStudent() 
	{
        if (currentEnrollment > 0) 
		{
            currentEnrollment--;
        }
    }
}

class Student 
{
    private int studentId;
    private String studentName;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() 
	{
        return studentName;
    }
}

class CourseDatabase 
{
    private List<Course> courses = new ArrayList<>();

    // Add a course to the database
    public void addCourse(Course course) 
	{
        courses.add(course);
    }

    // Remove a course from the database
    public void removeCourse(Course course) 
	{
        courses.remove(course);
    }

    // Get a list of all courses
    public List<Course> getAllCourses() 
	{
        return courses;
    }
}


class StudentDatabase 
{
    private List<Student> students = new ArrayList<>();

    // Add a student to the database
    public void addStudent(Student student) 
	{
        students.add(student);
    }

    // Remove a student from the database
    public void removeStudent(Student student) 
	{
        students.remove(student);
    }

    // Get a list of all students
    public List<Student> getAllStudents() 
	{
        return students;
    }
}

class RegistrationSystem 
{
    public static void main(String[] args) 
	{
        CourseDatabase courseDB = new CourseDatabase();
        StudentDatabase studentDB = new StudentDatabase();

        // Add courses and students to the databases
        Course course1 = new Course(1, "TOC", 30);
        Course course2 = new Course(2, "Operating system", 25);
        courseDB.addCourse(course1);
        courseDB.addCourse(course2);

        Student student1 = new Student(101, "Akshay");
        Student student2 = new Student(102, "Virat");
        studentDB.addStudent(student1);
        studentDB.addStudent(student2);

        // Enroll a student in a course
        if (course1.enrollStudent())
		{
            System.out.println("Akshay is enrolled in TOC.");
        } 
		else
		{
            System.out.println("TOC course is full.");
        }

        // Remove a student from a course
        course1.removeStudent();
        System.out.println("Virat has been removed from Operating system.");
    }
}
