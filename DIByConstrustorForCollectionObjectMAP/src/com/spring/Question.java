package com.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<Answer,User> answers;

	protected Question() {
		super();
	}
	
	protected Question(int id, String question, Map<Answer,User> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	public void show() {
		System.out.print("Question [id=" + id + ", Question=" + question + "]");
		Set<Entry<Answer,User>> entryset= answers.entrySet();
		Iterator<Entry<Answer,User>> itr=entryset.iterator();
		System.out.print("\n");
		while(itr.hasNext()){
			Entry<Answer,User> entry=itr.next();
			Answer ans =entry.getKey();
			User user = entry.getValue();
			System.out.println(ans+"	"+user);
		}
	}
	
	
}
