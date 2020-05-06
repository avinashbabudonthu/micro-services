package com.netflix.zuul.api.gateway.server.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ZuulLoggingFilter extends ZuulFilter {

	/**
	 * To set filter order
	 */
	@Override
	public int filterOrder() {
		return 1;
	}

	/**
	 * Should this filter to be executed or not. We can write business logic and check certain things and
	 * return true or false
	 * 
	 * Returning true means execute this filter for all requests
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * When this filter has to be execute like
	 * before request - value is pre
	 * after request - value is post
	 * only when error request - value is - error
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * Actual filter logic
	 */
	@Override
	public Object run() throws ZuulException {
		// get current request
		HttpServletRequest httpServletRequest = RequestContext.getCurrentContext().getRequest();

		log.info("request={}, uri={}", httpServletRequest, httpServletRequest.getRequestURI());

		return null;
	}

}
