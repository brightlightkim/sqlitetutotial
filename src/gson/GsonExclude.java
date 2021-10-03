package gson;

import java.lang.reflect.Modifier;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExclude {
    public static void main(String args[]) {

        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithModifiers(Modifier.TRANSIENT);
        Gson gson = builder.create();

        Student student = new Student();
        student.setRollNo(1);
        student.setName("Mahesh Kumar");
        student.setVerified(true);
        student.setId(1);
        student.className = "VI";

        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}