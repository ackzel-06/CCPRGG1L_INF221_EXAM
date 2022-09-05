public class App {
    public static void main(String[] args) throws Exception {

        Student Student = new Student();
        Student.surname = "Borero";
        Student.firstname = "Ackzel john";
        Student.middleInitial = 'E';
        Student.dateOfBirth = "06/04/2002";
        Student.studentNumber = 2022101645;
        Student.studentEmailAddress = "boreroae@students.national-u.edu.public";
        Student.iAmAwesome = true;
        Student.saymyStudentNumber();
        Student.sayMystudentEmailAddress();
        Student.amIAwesome();
        }
    }
