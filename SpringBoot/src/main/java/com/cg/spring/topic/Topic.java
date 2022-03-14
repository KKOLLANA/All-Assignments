package com.cg.spring.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Mapping to url
@RestController
public class Topic {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic1> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic1 getTopic1(@PathVariable String id) {
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic1 topic) {
		topicService.addTopic1(topic);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic1 topic, @PathVariable String id) {
		topicService.updateTopic1(id,topic);
}
	
@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
public void deleteTopic( @PathVariable String id) {
	topicService.deleteTopic1(id);
}
	
}
