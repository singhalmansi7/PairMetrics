package model;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project {
    @Setter@Getter
    String name;

    @Getter
    String office;

    @Getter
    Map<Integer,String> teamName = new HashMap<Integer, String> ();

}
