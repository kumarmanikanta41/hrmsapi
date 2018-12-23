package com.rayistha.tejasapi.redis;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rayistha.tejasapi.constant.Constants;
import com.rayistha.tejasapi.modal.Context;

@Repository
public class RedisRepositoryImpl implements RedisRepository{
	
	private RedisTemplate<String, Object> redisTemplate;
	private ValueOperations<String, Object> valueOperations; 
	
	@Autowired
	public RedisRepositoryImpl(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }
	
	@PostConstruct
	private void init() {
		valueOperations = redisTemplate.opsForValue();
	}

	@Override
	public void set(Context context) {
		try {
			valueOperations.set(context.getSessionId(), Constants.MAPPER.writeValueAsString(context), 60, TimeUnit.SECONDS);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Context get(String id) {
		String value = (String) valueOperations.get(id);
		Context context = new Context();
		if (!StringUtils.isEmpty(value)) {
			try {
				context = Constants.MAPPER.readValue(value, Context.class);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return context;
	}

}
