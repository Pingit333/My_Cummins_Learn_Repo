package com.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<String,String> answers;

	protected Question() {
		super();
	}
	
	protected Question(int id, String question, Map<String,String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	
	public void show() {
		System.out.print("Question [id=" + id + ", Question=" + question + "]");
		System.out.print("\n");
		Set<Entry<String,String>> entryset= answers.entrySet();
		Iterator<Entry<String,String>>itr=entryset.iterator();	  
		while(itr.hasNext()){
			Entry<String,String> entry= itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
	
	
}
