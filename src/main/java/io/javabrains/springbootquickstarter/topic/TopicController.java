package io.javabrains.springbootquickstarter.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value = "/topic", method = RequestMethod.GET)
	public List<Topics> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	@RequestMapping(value="/topic/{id}",method = RequestMethod.GET)
	public Topics getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
		
	}
	
	//the above two are example of GET Request to API
	
	//Now lets try to make a POST Request to aur Course-API
	@RequestMapping(value = "/topic",method = RequestMethod.POST)
	public void addTopic(@RequestBody Topics topics)
	{
		topicService.addTopic(topics);
	}
	@RequestMapping(value = "/topic/{id}",method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topics topics,@PathVariable String id)
	{
		topicService.updateTopic(id, topics);
	}
	
	@RequestMapping(value="/topic/{id}",method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	
	
	
}
