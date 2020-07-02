public class Test{
	public static void main(String[] args){
		DateTimeFormatter parser = ISODateTimeFormat.date();

		DateTime date = parser.parseDateTime(dateString);

		String nextDay = parser.print(date.plusDays(1));
		System.out.println(nextDay);
	}
}


