package arielspear.todo.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by Ariel on 10/28/15.
 */

@Table(name = "tasks", id = "_id")
public class Task extends Model {

    @Column(name = "description")
    private String mDescription;
    public Task() {
        super();
    }

    public Task(String description) {
        super();
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public static List<Task> all() {
        return new Select().from(Task.class).execute();
    }
}
