package sg.nus.iss.edu.sg.objectcontroller.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import sg.nus.iss.edu.sg.objectcontroller.model.Topic;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
        new Topic("1", "Math", "Study Math"),
        new Topic("2", "EL", "Study EL"),
        new Topic("3", "CE", "Study CE")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
  
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
