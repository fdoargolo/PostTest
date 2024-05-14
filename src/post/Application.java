package post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse("21/06/2018 13:05:44", formatter);
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country";
		int likes = 12;

		Post post1 = new Post(dateTime, title, content, likes);

		Comment comments = new Comment("Have a nice trip!");
		post1.setComments(comments);
		comments = new Comment("Wow! That is awesome!");
		post1.setComments(comments);

		dateTime = LocalDateTime.parse("28/07/2018 23:14:19", formatter);
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;

		Post post2 = new Post(dateTime, title, content, likes);

		comments = new Comment("Good night");
		post2.setComments(comments);
		comments = new Comment("May the force be with you");
		post2.setComments(comments);

		System.out.println(post1);
		System.out.println(post2);
	}

}
