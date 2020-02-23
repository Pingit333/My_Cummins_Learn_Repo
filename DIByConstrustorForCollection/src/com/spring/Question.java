package com.spring;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<String> answers;

	protected Question() {
		super();
	}
	protected Question(int id, String question, List<String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public void show() {
		System.out.print("Question [id=" + id + ", Question=" + question + "]");
		Iterator<String> iterator= answers.iterator();
		System.out.print("\n");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
}
