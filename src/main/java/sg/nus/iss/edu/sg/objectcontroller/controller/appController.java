package sg.nus.iss.edu.sg.objectcontroller.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.edu.sg.objectcontroller.model.Topic;
import sg.nus.iss.edu.sg.objectcontroller.resources.TopicService;

@RestController
@RequestMapping(path="/")
public class appController {

    @Autowired
    private TopicService topicService;
    
    @GetMapping(path="/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
       
    }

    @GetMapping(path = "/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
}
