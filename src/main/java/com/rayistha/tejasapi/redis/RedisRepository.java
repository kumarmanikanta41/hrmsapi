package com.rayistha.tejasapi.redis;

import com.rayistha.tejasapi.modal.Context;

public interface RedisRepository {

	public void set(Context context);
	public Context get(String id);
}
