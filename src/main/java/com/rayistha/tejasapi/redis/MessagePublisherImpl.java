package com.rayistha.tejasapi.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;

public class MessagePublisherImpl implements MessagePublisher{

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@Autowired
	private ChannelTopic channelTopic;
	
	public MessagePublisherImpl() {
    }
 
    public MessagePublisherImpl(final RedisTemplate<String, Object> redisTemplate, final ChannelTopic topic) {
        this.redisTemplate = redisTemplate;
        this.channelTopic = topic;
    }
    
    @Override
    public void publish(String message) {
    	redisTemplate.convertAndSend(channelTopic.getTopic(), message);
    }
}
