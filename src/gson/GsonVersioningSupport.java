package gson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonVersioningSupport {
    public static void main(String args[]) {

        GsonBuilder builder = new GsonBuilder();
        builder.setVersion(1.0);
        Gson gson = builder.create();

        Student student = new Student();
        student.setRollNo(1);
        student.setName("Mahesh Kumar");
        student.setVerified(true);

        String jsonString = gson.toJson(student);
        System.out.println(jsonString);

        gson = new Gson();
        jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
} 