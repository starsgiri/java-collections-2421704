package com.linkedin.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application {

	public static void main(String[] args) {

		Deque<String> messageDeck = new ArrayDeque<>();
		messageDeck.push("message 1");

		messageDeck.push("message 2");

		messageDeck.push("message 3");
		messageDeck.push("message 4");

		messageDeck.push("message 5");

		print(messageDeck);
		System.out.println(messageDeck.pop());
	}

	public static void print(Deque<String> deque) {

		System.out.format("%n--Deque Contents--%n");

		int x = 0;
		for(String msg : deque) {
			System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)":"");
		}
		
		System.out.println("");
		
	}
}
