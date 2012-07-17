package controllers.model;
import lombok.Setter;

import java.util.ArrayList;

public class Project {
    @Setter
    String name;
    String office;
    ArrayList<String> teamName = new ArrayList<String>();

}
