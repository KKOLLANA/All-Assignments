package com.cg.spring.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic1> topics = new ArrayList<>(Arrays.asList(
			new Topic1("Spring","Spring Frame worl","Spring Frame Description"),
			new Topic1("Html","Html5","Html Description"	)
			));
	
	//Methods of the Topic Class
	public List<Topic1> getAllTopics(){  
		return topics;
		
	}
	public Topic1 getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic1(Topic1 topic) {
		topics.add(topic);
		
	}
	public void updateTopic1(String id, Topic1 topic) {
		for(int i=0; i< topics.size(); i++) {
			Topic1 t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
				
				
			}
			
		}
		
	}
	
	
	public void deleteTopic1(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		

	
		
	
	
		
	}
	
}
