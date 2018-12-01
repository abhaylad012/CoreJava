package com.Questions4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.myclass.News;

public class testNews {

	public static void main(String[] args) {
		
		List<News> paper = new ArrayList<News>();
		
		paper.add( new News(01, "Abhay", "Kajal", "Its great!!"));
		paper.add( new News(01, "Abhay", "Raj", "Its great budget!!"));
		paper.add( new News(05, "Abhay", "Naruto", "Its great!!"));
		paper.add( new News(04, "Abhay", "Raj", "Its great budget!!"));
		paper.add( new News(01, "Abhay", "Kaneki", "Its great!!"));
		
		paper.add( new News(02, "kajal", "Olly", "Its great!!"));
		paper.add( new News(02, "Kajal", "Bobby", "Its great budget!!"));
		paper.add( new News(03, "Abhay", "Naruto", "Its great budget!!"));
		paper.add( new News(02, "Kajal", "Bobby", "Its great!!"));
		paper.add( new News(02, "Kajal", "Naruto", "Its great!!"));
		
		
		paper.add( new News(03, "Abhay", "Naruto", "Its great budget!!"));
		paper.add( new News(03, "Abhay", "Naruto", "Its great!!"));
		paper.add( new News(03, "Abhay", "Bobby", "Its great budget!!"));
		paper.add( new News(03, "Abhay", "Bobby", "Its great budget!!"));
		paper.add( new News(01, "Abhay", "Naruto", "Its great!!"));
	
		paper.add( new News(04, "Abhay", "Kaneki", "Its great!!"));
		paper.add( new News(04, "Abhay", "Bobby", "Its great!!"));
		paper.add( new News(05, "Abhay", "Naruto", "Its great!!"));
		paper.add( new News(02, "Kajal", "Bobby", "Its great!!"));
		paper.add( new News(02, "Kajal", "Bobby", "Its great!!"));
		
		Map<Object, Long> question4 = paper.stream()
				.collect(Collectors.groupingBy(o -> o.getNewsId(),Collectors.counting()));
		System.out.println(question4);
		long max=0;
		int key=0;
		
		for(Entry<Object, Long> entry:question4.entrySet())
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				key= (int) entry.getKey();
			}
		}
		System.out.println("NewsId And Total Comments:\n"+question4); 			
		System.out.println("NewsId "+key+" got max comments that is : "+max);
		System.out.println("================================================================================================");
			

		
		//5.count of budget...
		Long question5=paper.stream()
				.filter(e->e.getComment().contains("budget")).count();
		System.out.println("Occurence of Word Budget is :"+question5);
		System.out.println("================================================================================================");

		
		
		
		//6.max number of comments by user
		Map<Object, Long> question6 = paper.stream()
				.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
				System.out.println("Comment by user and no. of comments:\n"+question6);
				long maxNumber=0;
				Object keyValue=0;
				for(Entry<Object, Long> entry:question6.entrySet())
				{							
					if(entry.getValue()>maxNumber)
					{
						maxNumber=entry.getValue();
						keyValue= entry.getKey();
					}
				}
				System.out.println("User "+keyValue+" got max number of comments that is : "+maxNumber);
				System.out.println("================================================================================================");

				
				
		//7.comments by user wise number of comments	
		Map<Object, Long> question7 = paper.stream()
				.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
			System.out.println("Comment by user and no. of comments:\n"+question7);
			System.out.println("================================================================================================");

	}

}
